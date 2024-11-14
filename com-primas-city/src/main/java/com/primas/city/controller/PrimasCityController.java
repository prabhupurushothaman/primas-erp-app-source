package com.primas.city.controller;

import org.springframework.beans.factory.annotation.Value;
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

import com.primas.city.dto.PrimasCityMasterDto;
import com.primas.city.service.PrimasCityService;
import com.primas.city.util.PrimasCityConstants;

import jakarta.validation.Valid;

@RestController
@RequestMapping(PrimasCityConstants.REQUEST_MAPPING)
public class PrimasCityController implements PrimasCityConstants{

	private PrimasCityService primasCityService;

//	 @Value("${welcome.unit.msg}") 
	 private String welcomeUnitMsg;

	public PrimasCityController(PrimasCityService primasCityService) {
		super();
		this.primasCityService = primasCityService;
	}

	//http://localhost:1014/api/cities/welcome-city
	@GetMapping(GET_MAPPING_WELCOME_CITY)
	public String welcomeCity() {
		return WELCOME_TEXT;
		//return welcomeUnitMsg;
	}

	// Create City
	/*
	 http://localhost:1014/api/cities
	 
	 {
    	"countryCode" : "CC01",
    	"stateCode" : "SC01",
    	"cityCode" : "C001",
    	"cityDescription" : "City 1"
	}
	 
	 * */
	@PostMapping
	public ResponseEntity<PrimasCityMasterDto> createCity(@Valid @RequestBody PrimasCityMasterDto primasCityMasterDto) {
		return new ResponseEntity<>(primasCityService.createCity(primasCityMasterDto), HttpStatus.CREATED);
	}

	//get post by id
	/*
	 
	  http://localhost:1014/api/cities/1
	 * */
	@GetMapping(GET_MAPPING_ID)
	public ResponseEntity<PrimasCityMasterDto> getCityById(@PathVariable(name = SMALL_ID) long id){
		return ResponseEntity.ok(primasCityService.getCityById(id));
	}

	// Delete City
	//http://localhost:1014/api/cities/2
	@DeleteMapping(MAPPING_ID)
	public ResponseEntity<String> deleteCity(@PathVariable(name = SMALL_ID) long id) {
		primasCityService.deleteCity(id);
		return new ResponseEntity<>(DELETE_CITY_SUCCESS_MSG,HttpStatus.OK);
	}

	/*
	 http://localhost:1014/api/cities/1
	{
		"countryCode" : "CC01",
	"stateCode" : "SC01",
	"cityCode" : "C001",
	"cityunitDescription" : "City 1"
	}
	 * */

	//Put - Update
	@PutMapping(MAPPING_ID)
	public ResponseEntity<PrimasCityMasterDto> updateCity(@Valid @RequestBody PrimasCityMasterDto primasCityMasterDto, @PathVariable(name = SMALL_ID) long id) {
		PrimasCityMasterDto primasCityMasterResponse = primasCityService.updateCity(primasCityMasterDto, id);
		return new ResponseEntity<>(primasCityMasterResponse, HttpStatus.OK);
	}

}
