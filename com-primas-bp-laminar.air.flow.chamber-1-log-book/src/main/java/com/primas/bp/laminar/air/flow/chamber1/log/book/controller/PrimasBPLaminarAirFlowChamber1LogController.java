package com.primas.bp.laminar.air.flow.chamber1.log.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.primas.bp.laminar.air.flow.chamber1.log.book.dto.PrimasBPLaminarAirFlowChamber1LogDto;
import com.primas.bp.laminar.air.flow.chamber1.log.book.payload.BPLaminarAifFlowChamber1LogResponse;
import com.primas.bp.laminar.air.flow.chamber1.log.book.service.PrimasBPLaminarAirFlowChamber1LogService;
import com.primas.bp.laminar.air.flow.chamber1.log.book.util.PrimasBpLaminarAirFlowChamber1LogBookConstants;

import jakarta.validation.Valid;

@RestController
@RequestMapping(PrimasBpLaminarAirFlowChamber1LogBookConstants.REQUEST_MAPPING)
public class PrimasBPLaminarAirFlowChamber1LogController implements PrimasBpLaminarAirFlowChamber1LogBookConstants{

	private PrimasBPLaminarAirFlowChamber1LogService primasBPLaminarAirFlowChamber1LogService;

	public PrimasBPLaminarAirFlowChamber1LogController(PrimasBPLaminarAirFlowChamber1LogService primasBPLaminarAirFlowChamber1LogService) {
		super();
		this.primasBPLaminarAirFlowChamber1LogService = primasBPLaminarAirFlowChamber1LogService;
	}

	//http://localhost:1037/welcome-bp-laminator-air-flow-chamber-1-log
	//http://localhost:1037/api/bp/laminator/air/flow/chamber1-log/welcome-bp-laminator-air-flow-chamber-1-log
	@GetMapping(GET_MAPPING_BP_LAMINATOR_AIR_FLOW_CHAMBER_1_LOG)
	public String welcomeBpLaminarAirFlowChamber1Log() {
		//return WELCOME_TEXT;
		return "BP Laminar Air Flow Chamber 1 Log";
	}

	// Create Mrnd Shaker 3 Log
	/*
	 
	 //http://localhost:1037/api/bp/laminator/air/flow/chamber1-log
	 //http://localhost:1037/api/bp/laminator/air/flow/chamber1-log
{
    	"date" : "date01",
    	"time" : "time 01",
    	"flask" : "flask 01",
    	"uvDirection" : "UV Direction 01",
    	"action" : "action 01",
    	"empCode" : "empCode 01"
	}
	 * */
	@PostMapping
	public ResponseEntity<PrimasBPLaminarAirFlowChamber1LogDto> createBpLaminarAirFlowChamber1Log(@Valid @RequestBody PrimasBPLaminarAirFlowChamber1LogDto primasBPLaminarAirFlowChamber1LogDto) {
		System.out.println("Entering into createBpLaminarAirFlowChamber1Log in Controller");
		return new ResponseEntity<>(primasBPLaminarAirFlowChamber1LogService.createBpLaminarAirFlowChamber1Log(primasBPLaminarAirFlowChamber1LogDto), HttpStatus.CREATED);
	}
	
	// Get All BP Laminar Air Flow Chamber 1 Logs

	//http://localhost:1037/api/bp/laminator/air/flow/chamber1-log
	@GetMapping
	public BPLaminarAifFlowChamber1LogResponse getAllBpLaminarAirFlowChamber1Logs(
			@RequestParam(value = PrimasBpLaminarAirFlowChamber1LogBookConstants.PAGE_NUMBER, defaultValue = PrimasBpLaminarAirFlowChamber1LogBookConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
			@RequestParam(value = PrimasBpLaminarAirFlowChamber1LogBookConstants.PAGE_SIZE, defaultValue = PrimasBpLaminarAirFlowChamber1LogBookConstants.DEFAULT_PAGE_SIZE, required=false) int pageSize,
			@RequestParam(value = PrimasBpLaminarAirFlowChamber1LogBookConstants.SORT_BY, defaultValue = PrimasBpLaminarAirFlowChamber1LogBookConstants.DEFAULT_SORT_BY, required = false) String sortBy,
			@RequestParam(value = PrimasBpLaminarAirFlowChamber1LogBookConstants.SORT_DIRECTION, defaultValue = PrimasBpLaminarAirFlowChamber1LogBookConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir
	){
		return primasBPLaminarAirFlowChamber1LogService.getAllBpLaminarAirFlowChamber1Logs(pageNo, pageSize, sortBy, sortDir);
	}
	/*
	 
	  http://localhost:1037/api/bp/laminator/air/flow/chamber1-log/1
	 * */
	@GetMapping(GET_MAPPING_ID)
	public ResponseEntity<PrimasBPLaminarAirFlowChamber1LogDto> getBpLaminarAirFlowChamber1LogById(@PathVariable(name = SMALL_ID) long id){
		return ResponseEntity.ok(primasBPLaminarAirFlowChamber1LogService.getBpLaminarAirFlowChamber1LogById(id));
	}

	// Delete Bp Laminar Air Flow Chamber 1r 3 Log
	//http://localhost:1037/api/bp/laminator/air/flow/chamber1-log/1
	@DeleteMapping(MAPPING_ID)
	public ResponseEntity<String> deleteBpLaminarAirFlowChamber1Log(@PathVariable(name = SMALL_ID) long id) {
		primasBPLaminarAirFlowChamber1LogService.deleteBpLaminarAirFlowChamber1Log(id);
		return new ResponseEntity<>(DELETE_BP_LAMINAR_AIR_FLOW_CHAMBER_1_SUCCESS_MSG,HttpStatus.OK);
	}

	
	 //http://localhost:1037/api/bp/laminator/air/flow/chamber1-log/1

	/*{
    	"date" : "date001",
    	"time" : "time 01",
    	"flask" : "flask 01",
    	"uvDuration" : "uv Direction  01",
    	"action" : "action 01",
    	"empCode" : "empCode 01"
	}
*/
	 
	 
	//Put - Update
	@PutMapping(MAPPING_ID)
	public ResponseEntity<PrimasBPLaminarAirFlowChamber1LogDto> updateBpLaminarAirFlowChamber1Log(@Valid @RequestBody PrimasBPLaminarAirFlowChamber1LogDto primasBPLaminarAirFlowChamber1LogDto, @PathVariable(name = SMALL_ID) long id) {
		PrimasBPLaminarAirFlowChamber1LogDto primasMrndShaker3LogResponse = primasBPLaminarAirFlowChamber1LogService.updateBpLaminarAirFlowChamber1Log(primasBPLaminarAirFlowChamber1LogDto, id);
		return new ResponseEntity<>(primasMrndShaker3LogResponse, HttpStatus.OK);
	}
}
