package com.primas.bp.laminar.air.flow.chamber1.log.book.payload;

import java.util.List;

import com.primas.bp.laminar.air.flow.chamber1.log.book.dto.PrimasBPLaminarAirFlowChamber1LogDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BPLaminarAifFlowChamber1LogResponse {
	
	private List<PrimasBPLaminarAirFlowChamber1LogDto> content;
	private int pageNo;
	private int pageSize;
	private long totalElements;
	private int totalPages;
	private boolean last;

}
