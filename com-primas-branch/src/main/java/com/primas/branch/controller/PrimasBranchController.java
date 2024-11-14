package com.primas.branch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primas.branch.dto.PrimasBranchMasterDto;
import com.primas.branch.service.PrimasBranchService;
import com.primas.branch.util.PrimasBranchConstants;

import jakarta.validation.Valid;

@RestController
@RequestMapping(PrimasBranchConstants.REQUEST_MAPPING)
public class PrimasBranchController implements PrimasBranchConstants{

	private PrimasBranchService primasBranchService;

	public PrimasBranchController(PrimasBranchService primasStateService) {
		super();
		this.primasBranchService = primasStateService;
	}

	//http://localhost:1015/api/branches/1
	@GetMapping(GET_MAPPING_WELCOME_BRANCH)
	public String welcomeUnit() {
		return WELCOME_TEXT;
	}

	// Create Country
	/*
	 http://localhost:1015/api/branches
	 {
    	"unitCode" : "U001",
    	"stateCode" : "S001",
    	"branchCode" : "B001",
    	"branchDescription" : "Branch 1"
	}
	 
	 * */
	@PostMapping
	public ResponseEntity<PrimasBranchMasterDto> createBranch(@Valid @RequestBody PrimasBranchMasterDto primasBranchMasterDto) {
		return new ResponseEntity<>(primasBranchService.createBranch(primasBranchMasterDto), HttpStatus.CREATED);
	}

	//get country by id
	/*
	
	  http://localhost:1015/api/branches/1
	 * */
	@GetMapping(GET_MAPPING_ID)
	public ResponseEntity<PrimasBranchMasterDto> getBranchById(@PathVariable(name = SMALL_ID) long id){
		return ResponseEntity.ok(primasBranchService.getBranchById(id));
	}

	// Delete Unit
	//http://localhost:1015/api/branches/2
	@DeleteMapping(MAPPING_ID)
	public ResponseEntity<String> deleteBranch(@PathVariable(name = SMALL_ID) long id) {
		primasBranchService.deleteBranch(id);
		return new ResponseEntity<>(DELETE_BRANCH_SUCCESS_MSG,HttpStatus.OK);
	}

	/*
	 http://localhost:1015/api/branch/1
	 {
    	"unitCode" : "U001",
    	"stateCode" : "S001",
    	"branchCode" : "B001",
    	"branchDescription" : "Branch 1"
	}
	 
	 * */
	
	@PutMapping(MAPPING_ID)
	public ResponseEntity<PrimasBranchMasterDto> updateBranch(@Valid @RequestBody PrimasBranchMasterDto primasBranchMasterDto, @PathVariable(name = SMALL_ID) long id) {
		PrimasBranchMasterDto primasBranchMasterResponse = primasBranchService.updateBranch(primasBranchMasterDto, id);
		return new ResponseEntity<>(primasBranchMasterResponse, HttpStatus.OK);
	}

}
