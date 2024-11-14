package com.primas.bp.laminar.air.flow.chamber1.log.book.service;

import com.primas.bp.laminar.air.flow.chamber1.log.book.dto.PrimasBPLaminarAirFlowChamber1LogDto;
import com.primas.bp.laminar.air.flow.chamber1.log.book.payload.BPLaminarAifFlowChamber1LogResponse;

public interface PrimasBPLaminarAirFlowChamber1LogService {
	PrimasBPLaminarAirFlowChamber1LogDto createBpLaminarAirFlowChamber1Log(PrimasBPLaminarAirFlowChamber1LogDto primasMrndShaker3Dto);
	BPLaminarAifFlowChamber1LogResponse getAllBpLaminarAirFlowChamber1Logs(int pageNo, int pageSize, String sortBy, String sortDir);
	PrimasBPLaminarAirFlowChamber1LogDto getBpLaminarAirFlowChamber1LogById(Long id);
	void deleteBpLaminarAirFlowChamber1Log(Long id);
	PrimasBPLaminarAirFlowChamber1LogDto updateBpLaminarAirFlowChamber1Log(PrimasBPLaminarAirFlowChamber1LogDto primasMrndShaker3LogDto, Long id);
}