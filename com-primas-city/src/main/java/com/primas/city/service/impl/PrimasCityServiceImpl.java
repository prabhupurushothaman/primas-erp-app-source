package com.primas.city.service.impl;


import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.primas.city.dto.PrimasCityMasterDto;
import com.primas.city.entity.PrimasCityMasterEntity;
import com.primas.city.exception.PrimasCityAlreadyExistException;
import com.primas.city.exception.PrimasCityCustomException;
import com.primas.city.exception.ResourceNotFoundException;
import com.primas.city.repository.PrimasCityRepository;
import com.primas.city.service.PrimasCityService;
import com.primas.city.util.PrimasCityConstants;

@Service
public class PrimasCityServiceImpl implements PrimasCityService {

	private PrimasCityRepository primasCityRepository;
	
	private ModelMapper mapper;
	
	public PrimasCityServiceImpl(PrimasCityRepository primasCityRepository, ModelMapper mapper) {
		//super();
		this.primasCityRepository = primasCityRepository;
		this.mapper = mapper;
	}

	
	//@Override
		public PrimasCityMasterDto createCity(PrimasCityMasterDto primasCityMasterDto) {
			// Convert DTO to Entity

			Optional<PrimasCityMasterEntity> optionalCity = primasCityRepository.findByCityCode(primasCityMasterDto.getCityCode());

			System.out.println("optionalCity : " + optionalCity);
		
			if(optionalCity.isPresent()) {
				throw new PrimasCityCustomException(primasCityMasterDto.getCityCode() +
						PrimasCityConstants.HYPEN +
						PrimasCityConstants.SPACE
						+ PrimasCityConstants.CITY_ALREADY_EXIST_MSG, PrimasCityConstants.CITY_ALREADY_EXIST_CODE);
			}

			PrimasCityMasterEntity primasCityMasterEntity = mapToEntity(primasCityMasterDto);

			primasCityRepository.save(primasCityMasterEntity);
			// Convert entity to DTO
			PrimasCityMasterDto cityResponse = mapToDTO(primasCityMasterEntity);

			System.out.println(" cityResponse : " + cityResponse);
			return cityResponse;
		}

	//@Override
	public PrimasCityMasterDto getCityById(Long id) {
		PrimasCityMasterEntity primasCityMasterEntity = primasCityRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException(PrimasCityConstants.CITY,PrimasCityConstants.SMALL_ID,id));
		return mapToDTO(primasCityMasterEntity);
	}

	
	public PrimasCityMasterDto updateCity(PrimasCityMasterDto primasCityMasterDto, Long id) {
		// get post by id from the data base
		
		System.out.println("Enteringing into updateCity in serviceimpl");

		Optional<PrimasCityMasterEntity> optionalCity = primasCityRepository.findByCityCode(primasCityMasterDto.getCityCode());

		System.out.println("optionalCity : " + optionalCity);
	
		if(optionalCity.isPresent()) {
			throw new PrimasCityAlreadyExistException(primasCityMasterDto.getCityCode() +
					PrimasCityConstants.HYPEN +
					PrimasCityConstants.SPACE
					+ PrimasCityConstants.CITY_ALREADY_EXIST_MSG);
		}

		PrimasCityMasterEntity primasCityMasterEntity = primasCityRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(PrimasCityConstants.CITY, PrimasCityConstants.SMALL_ID, id));

		primasCityMasterEntity.setCountryCode(primasCityMasterDto.getCountryCode());
		primasCityMasterEntity.setStateCode(primasCityMasterDto.getStateCode());
		
		primasCityMasterEntity.setCityCode(primasCityMasterDto.getCityCode());
		primasCityMasterEntity.setCityDescription(primasCityMasterDto.getCityDescription());
	
		PrimasCityMasterEntity updatedPrimasCityMasterEntity = primasCityRepository.save(primasCityMasterEntity);
		return mapToDTO(updatedPrimasCityMasterEntity);
	}

	
	
	@Override
	public void deleteCity(Long id) {
		// TODO Auto-generated method stub
		PrimasCityMasterEntity primasCityMasterEntity = 
				primasCityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(PrimasCityConstants.CITY,PrimasCityConstants.SMALL_ID,id));
		primasCityRepository.delete(primasCityMasterEntity);
	}
	
	
	//Convert DTO to Entity
	private PrimasCityMasterEntity mapToEntity(PrimasCityMasterDto primasCityMasterDto) {
		PrimasCityMasterEntity primasCountryMasterEntity = mapper.map(primasCityMasterDto, PrimasCityMasterEntity.class);
		return primasCountryMasterEntity;
	}
	
	// Convert Entity into DTO
	private PrimasCityMasterDto mapToDTO(PrimasCityMasterEntity primasStateMasterEntity) {
		PrimasCityMasterDto primasCountryMasterDto = mapper.map(primasStateMasterEntity, PrimasCityMasterDto.class);
		return primasCountryMasterDto;
	}
}
