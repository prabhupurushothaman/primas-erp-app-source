package com.primas.bp.laminar.air.flow.chamber1.log.book.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.primas.bp.laminar.air.flow.chamber1.log.book.dto.PrimasBPLaminarAirFlowChamber1LogDto;
import com.primas.bp.laminar.air.flow.chamber1.log.book.entity.PrimasBPLaminarAirFlowChamber1LogEntity;
import com.primas.bp.laminar.air.flow.chamber1.log.book.exception.PrimasBPLaminarAirFlowChamber1CustomException;
import com.primas.bp.laminar.air.flow.chamber1.log.book.payload.BPLaminarAifFlowChamber1LogResponse;
import com.primas.bp.laminar.air.flow.chamber1.log.book.repository.PrimasBPLaminarAirFlowChamber1LogRepository;
import com.primas.bp.laminar.air.flow.chamber1.log.book.service.PrimasBPLaminarAirFlowChamber1LogService;
import com.primas.bp.laminar.air.flow.chamber1.log.book.util.PrimasBpLaminarAirFlowChamber1LogBookConstants;

@Service
public class PrimasBPLaminarAirFlowChamber1LogServiceImpl implements PrimasBPLaminarAirFlowChamber1LogService {

	private PrimasBPLaminarAirFlowChamber1LogRepository primasBPLaminarAirFlowChamber1LogRepository;

	private ModelMapper mapper;

	public PrimasBPLaminarAirFlowChamber1LogServiceImpl(PrimasBPLaminarAirFlowChamber1LogRepository primasBPLaminarAirFlowChamber1LogRepository, ModelMapper mapper) {
		//super();
		this.primasBPLaminarAirFlowChamber1LogRepository = primasBPLaminarAirFlowChamber1LogRepository;
		this.mapper = mapper;
	}

	//@Override
	public PrimasBPLaminarAirFlowChamber1LogDto createBpLaminarAirFlowChamber1Log(PrimasBPLaminarAirFlowChamber1LogDto primasBPLaminarAirFlowChamber1LogDto) {
		System.out.println("Entering into createBpLaminarAirFlowChamber1Log in ServiceImpl");
		// Convert DTO to Entity

		//Optional<PrimasBPLaminarAirFlowChamber1LogEntity> optionalMrndShaker3Log = primasBPLaminarAirFlowChamber1LogRepository.findByDate(primasBPLaminarAirFlowChamber1LogDto.getDate());

		//System.out.println("optionalMrndShaker3Log : " + optionalMrndShaker3Log);

		//TODO: Enable this code - 01-Nov-2024
		/*if(optionalMrndShaker3Log.isPresent()) {
			throw new PrimasUnitCustomException(
					primasBPLaminarAirFlowChamber1LogDto.getDate() +
					PrimasBpLaminarAirFlowChamber1LogBookConstants.HYPEN +
					PrimasBpLaminarAirFlowChamber1LogBookConstants.SPACE +
					PrimasBpLaminarAirFlowChamber1LogBookConstants.UNIT_ALREADY_EXIST_MSG, 
					PrimasBpLaminarAirFlowChamber1LogBookConstants.UNIT_ALREADY_EXIST_CODE);
		}*/

		
		PrimasBPLaminarAirFlowChamber1LogEntity primasBPLaminarAirFlowChamber1LogEntity = mapToEntity(primasBPLaminarAirFlowChamber1LogDto);

		primasBPLaminarAirFlowChamber1LogRepository.save(primasBPLaminarAirFlowChamber1LogEntity);
		// Convert entity to DTO
		PrimasBPLaminarAirFlowChamber1LogDto bpLaminarAirFlowChamber1LogResponse = mapToDTO(primasBPLaminarAirFlowChamber1LogEntity);

		System.out.println(" bpLaminarAirFlowChamber1LogResponse : " + bpLaminarAirFlowChamber1LogResponse);
		return bpLaminarAirFlowChamber1LogResponse;
	}
	
	@Override
	public BPLaminarAifFlowChamber1LogResponse getAllBpLaminarAirFlowChamber1Logs(int pageNo, int pageSize, String sortBy, String sortDir) {
		
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
				: Sort.by(sortBy).descending();
		// Create Pageable Instance
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		
		Page<PrimasBPLaminarAirFlowChamber1LogEntity>  posts = primasBPLaminarAirFlowChamber1LogRepository.findAll(pageable);
		
		// get content from page object
		
		List<PrimasBPLaminarAirFlowChamber1LogEntity> listofPost = posts.getContent();
		List<PrimasBPLaminarAirFlowChamber1LogDto> content = listofPost.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
		BPLaminarAifFlowChamber1LogResponse bpLaminarAirFlowChamber1LogResponse = new BPLaminarAifFlowChamber1LogResponse();
		bpLaminarAirFlowChamber1LogResponse.setContent(content);
		bpLaminarAirFlowChamber1LogResponse.setPageNo(posts.getNumber());
		bpLaminarAirFlowChamber1LogResponse.setPageSize(posts.getSize());
		bpLaminarAirFlowChamber1LogResponse.setTotalElements(posts.getTotalElements());
		bpLaminarAirFlowChamber1LogResponse.setTotalPages(posts.getTotalPages());
		bpLaminarAirFlowChamber1LogResponse.setLast(posts.isLast());
		return bpLaminarAirFlowChamber1LogResponse;
		
	}

	public PrimasBPLaminarAirFlowChamber1LogDto getBpLaminarAirFlowChamber1LogById(Long id) {
		PrimasBPLaminarAirFlowChamber1LogEntity primasBPLaminarAirFlowChamber1LogEntity = primasBPLaminarAirFlowChamber1LogRepository.findById(id)
				.orElseThrow(() -> new
						PrimasBPLaminarAirFlowChamber1CustomException(
								PrimasBpLaminarAirFlowChamber1LogBookConstants.EMPTY+id +
								PrimasBpLaminarAirFlowChamber1LogBookConstants.HYPEN +
								PrimasBpLaminarAirFlowChamber1LogBookConstants.SPACE +
								PrimasBpLaminarAirFlowChamber1LogBookConstants.BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_MSG, PrimasBpLaminarAirFlowChamber1LogBookConstants.BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_CODE));
		
		return mapToDTO(primasBPLaminarAirFlowChamber1LogEntity);
	}
	
	@Override
	public void deleteBpLaminarAirFlowChamber1Log(Long id) {
		PrimasBPLaminarAirFlowChamber1LogEntity primasBPLaminarAirFlowChamber1LogEntity = primasBPLaminarAirFlowChamber1LogRepository.findById(id)
			.orElseThrow(() -> new 
					PrimasBPLaminarAirFlowChamber1CustomException(
							PrimasBpLaminarAirFlowChamber1LogBookConstants.EMPTY + id +
							PrimasBpLaminarAirFlowChamber1LogBookConstants.HYPEN +
							PrimasBpLaminarAirFlowChamber1LogBookConstants.SPACE +
							PrimasBpLaminarAirFlowChamber1LogBookConstants.BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_MSG, PrimasBpLaminarAirFlowChamber1LogBookConstants.BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_CODE));
		primasBPLaminarAirFlowChamber1LogRepository.delete(primasBPLaminarAirFlowChamber1LogEntity);
	}


	//TODO: Unit Code Exist check to be done
	//TODO : Write a logic to find the duplicate value based on the 2 combinations (Date and Time)
	//@Override
	public PrimasBPLaminarAirFlowChamber1LogDto updateBpLaminarAirFlowChamber1Log(PrimasBPLaminarAirFlowChamber1LogDto primasBPLaminarAirFlowChamber1LogDto, Long id) {
		// get post by id from the data base
	
		System.out.println("Enteringing into updateBpLaminarAirFlowChamber1Log in serviceimpl");

		//TODO: Find the entry based on the date and time
		
		//Optional<PrimasBPLaminarAirFlowChamber1LogEntity> optionaShaker3Log = primasBPLaminarAirFlowChamber1LogRepository.findByUnitCode(primasBPLaminarAirFlowChamber1LogDto.getUnitCode());

		//System.out.println("optionaShaker3Log : " + optionaShaker3Log);
	
		/*if(optionalUnit.isPresent()) {
			//throw new PrimasUnitAlreadyExistException(
			throw new PrimasUnitCustomException(
					primasBPLaminarAirFlowChamber1LogDto.getUnitCode() +
					PrimasBpLaminarAirFlowChamber1LogBookConstants.HYPEN +
					PrimasBpLaminarAirFlowChamber1LogBookConstants.SPACE +
					PrimasBpLaminarAirFlowChamber1LogBookConstants.UNIT_ALREADY_EXIST_MSG,
					PrimasBpLaminarAirFlowChamber1LogBookConstants.UNIT_ALREADY_EXIST_CODE);
		}*/

		PrimasBPLaminarAirFlowChamber1LogEntity primasBPLaminarAirFlowChamber1LogEntity = primasBPLaminarAirFlowChamber1LogRepository.findById(id)
				.orElseThrow(() -> new 
						PrimasBPLaminarAirFlowChamber1CustomException(
								PrimasBpLaminarAirFlowChamber1LogBookConstants.EMPTY + id +
								PrimasBpLaminarAirFlowChamber1LogBookConstants.HYPEN +
								PrimasBpLaminarAirFlowChamber1LogBookConstants.SPACE +
								PrimasBpLaminarAirFlowChamber1LogBookConstants.BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_MSG, PrimasBpLaminarAirFlowChamber1LogBookConstants.BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_CODE));

		primasBPLaminarAirFlowChamber1LogEntity.setDate(primasBPLaminarAirFlowChamber1LogDto.getDate());
		primasBPLaminarAirFlowChamber1LogEntity.setTime(primasBPLaminarAirFlowChamber1LogDto.getTime());
		
		primasBPLaminarAirFlowChamber1LogEntity.setFlask(primasBPLaminarAirFlowChamber1LogDto.getFlask());
		primasBPLaminarAirFlowChamber1LogEntity.setUvDuration(primasBPLaminarAirFlowChamber1LogDto.getUvDuration());
	
		primasBPLaminarAirFlowChamber1LogEntity.setAction(primasBPLaminarAirFlowChamber1LogDto.getAction());
		primasBPLaminarAirFlowChamber1LogEntity.setEmpCode(primasBPLaminarAirFlowChamber1LogDto.getEmpCode());
		
		PrimasBPLaminarAirFlowChamber1LogEntity updatedPrimasMrndShaker3LogEntity = primasBPLaminarAirFlowChamber1LogRepository.save(primasBPLaminarAirFlowChamber1LogEntity);
		return mapToDTO(updatedPrimasMrndShaker3LogEntity);
	}


	

	//Convert DTO to Entity
	private PrimasBPLaminarAirFlowChamber1LogEntity mapToEntity(PrimasBPLaminarAirFlowChamber1LogDto primasBPLaminarAirFlowChamber1LogDto) {
		PrimasBPLaminarAirFlowChamber1LogEntity primasBPLaminarAirFlowChamber1LogEntity = mapper.map(primasBPLaminarAirFlowChamber1LogDto, PrimasBPLaminarAirFlowChamber1LogEntity.class);
		return primasBPLaminarAirFlowChamber1LogEntity;
	}

	// Convert Entity into DTO
	private PrimasBPLaminarAirFlowChamber1LogDto mapToDTO(PrimasBPLaminarAirFlowChamber1LogEntity primasBPLaminarAirFlowChamber1LogEntity) {
		PrimasBPLaminarAirFlowChamber1LogDto primasBPLaminarAirFlowChamber1LogDto = mapper.map(primasBPLaminarAirFlowChamber1LogEntity, PrimasBPLaminarAirFlowChamber1LogDto.class);
		return primasBPLaminarAirFlowChamber1LogDto;
	}
/*
	@Override
	public List<PrimasBPLaminarAirFlowChamber1LogEntity> getAllUnit() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}