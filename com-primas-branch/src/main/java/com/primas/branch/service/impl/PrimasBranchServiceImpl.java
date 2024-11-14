package com.primas.branch.service.impl;


import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.primas.branch.dto.PrimasBranchMasterDto;
import com.primas.branch.entity.PrimasBranchMasterEntity;
import com.primas.branch.exception.PrimasBranchAlreadyExistException;
import com.primas.branch.exception.PrimasBranchCustomException;
import com.primas.branch.exception.ResourceNotFoundException;
import com.primas.branch.repository.PrimasBranchRepository;
import com.primas.branch.service.PrimasBranchService;
import com.primas.branch.util.PrimasBranchConstants;

@Service
public class PrimasBranchServiceImpl implements PrimasBranchService {

	private PrimasBranchRepository primasBranchRepository;

	private ModelMapper mapper;

	public PrimasBranchServiceImpl(PrimasBranchRepository primasBranchRepository, ModelMapper mapper) {
		//super();
		this.primasBranchRepository = primasBranchRepository;
		this.mapper = mapper;
	}


	//@Override
	public PrimasBranchMasterDto createBranch(PrimasBranchMasterDto primasBranchMasterDto) {
		// Convert DTO to Entity

				Optional<PrimasBranchMasterEntity> optionalBranch = primasBranchRepository.findByBranchCode(primasBranchMasterDto.getBranchCode());

				System.out.println("optionalBranch : " + optionalBranch);

				if(optionalBranch.isPresent()) {
					throw new PrimasBranchCustomException(primasBranchMasterDto.getBranchCode() +
							PrimasBranchConstants.HYPEN +
							PrimasBranchConstants.SPACE
							+ PrimasBranchConstants.BRANCH_ALREADY_EXIST_MSG, PrimasBranchConstants.BRANCH_ALREADY_EXIST_CODE);
				}

				PrimasBranchMasterEntity primasBranchMasterEntity = mapToEntity(primasBranchMasterDto);

				primasBranchRepository.save(primasBranchMasterEntity);
				// Convert entity to DTO
				PrimasBranchMasterDto branchResponse = mapToDTO(primasBranchMasterEntity);

				System.out.println(" branchResponse : " + branchResponse);
		return branchResponse;
	}

	//@Override
	public PrimasBranchMasterDto getBranchById(Long id) {
		PrimasBranchMasterEntity primasBranchMasterEntity = primasBranchRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException(PrimasBranchConstants.BRANCH,PrimasBranchConstants.SMALL_ID,id));
		return mapToDTO(primasBranchMasterEntity);
	}

	public PrimasBranchMasterDto updateBranch(PrimasBranchMasterDto primasBranchMasterDto, Long id) {
		// get post by id from the data base
	
		System.out.println("Enteringing into updateBranch in serviceimpl");

		Optional<PrimasBranchMasterEntity> optionalBranch = primasBranchRepository.findByBranchCode(primasBranchMasterDto.getBranchCode());

		System.out.println("optionalBranch : " + optionalBranch);
	
		if(optionalBranch.isPresent()) {
			throw new PrimasBranchAlreadyExistException(primasBranchMasterDto.getBranchCode() +
					PrimasBranchConstants.HYPEN +
					PrimasBranchConstants.SPACE
					+ PrimasBranchConstants.BRANCH_ALREADY_EXIST_MSG);
		}

		PrimasBranchMasterEntity primasBranchMasterEntity = primasBranchRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(PrimasBranchConstants.BRANCH, PrimasBranchConstants.SMALL_ID, id));

		primasBranchMasterEntity.setUnitCode(primasBranchMasterDto.getUnitCode());
		primasBranchMasterEntity.setStateCode(primasBranchMasterDto.getStateCode());
		primasBranchMasterEntity.setBranchCode(primasBranchMasterDto.getBranchCode());
		primasBranchMasterEntity.setBranchDescription(primasBranchMasterDto.getBranchDescription());
	
		PrimasBranchMasterEntity updatedPrimasBranchMasterEntity = primasBranchRepository.save(primasBranchMasterEntity);
		return mapToDTO(updatedPrimasBranchMasterEntity);
	}
	
	@Override
	public void deleteBranch(Long id) {
		PrimasBranchMasterEntity primasBranchMasterEntity = 
				primasBranchRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(PrimasBranchConstants.BRANCH,PrimasBranchConstants.SMALL_ID,id));
		primasBranchRepository.delete(primasBranchMasterEntity);
	}
	
	
	//Convert DTO to Entity
	private PrimasBranchMasterEntity mapToEntity(PrimasBranchMasterDto primasBranchMasterDto) {
		PrimasBranchMasterEntity primasBranchMasterEntity = mapper.map(primasBranchMasterDto, PrimasBranchMasterEntity.class);
		return primasBranchMasterEntity;
	}
	
	// Convert Entity into DTO
	private PrimasBranchMasterDto mapToDTO(PrimasBranchMasterEntity primasBranchMasterEntity) {
		PrimasBranchMasterDto primasBranchMasterDto = mapper.map(primasBranchMasterEntity, PrimasBranchMasterDto.class);
		return primasBranchMasterDto;
	}
}
