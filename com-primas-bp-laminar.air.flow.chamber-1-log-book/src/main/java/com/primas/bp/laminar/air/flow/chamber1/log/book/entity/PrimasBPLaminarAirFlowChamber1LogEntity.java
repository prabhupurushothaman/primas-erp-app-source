package com.primas.bp.laminar.air.flow.chamber1.log.book.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.primas.bp.laminar.air.flow.chamber1.log.book.audit.Auditable;
import com.primas.bp.laminar.air.flow.chamber1.log.book.util.PrimasBpLaminarAirFlowChamber1LogBookConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
//@MappedSuperclass
@Table(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.PRIMAS_BP_LAMINAR_AIR_FLOW_CHAMBER_1_3_LOG_BOOK)

public class PrimasBPLaminarAirFlowChamber1LogEntity extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.TXN_ID)
	private long id;

	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.DATE, nullable = false)
	@NotBlank(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.DATE_BLANK_MSG)
	private String date;

	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.TIME, nullable = false)
	@NotBlank(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.TIME_BLANK_MSG)
	private String time;

	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.FLASK, nullable = false)
	@NotBlank(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.FLASK_BLANK_MSG)
	private String flask;

	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.UV_DURATION, nullable = false)
	@NotBlank(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.UV_DURATION_BLANK_MSG)
	private String uvDuration;

	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.ACTION, nullable = false)
	@NotBlank(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.ACTION_BLANK_MSG)
	private String action;

	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.EMP_CODE, nullable = false)
	@NotBlank(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.EMP_CODE_BLANK_MSG)
	private String empCode;
	/*
	 * 
	 * @CreatedDate
	 * 
	 * @Column(name = "CreatedOn")
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private LocalDateTime createdOn;
	 */	
	//@CreatedDate
	 //private LocalDateTime createdDate;
	/*
	 * @CreatedBy
	 * 
	 * @Column(nullable = false, updatable = false) private String createdBy;
	 * 
	 * @CreatedDate
	 * 
	 * @Column(nullable = false, updatable = false) private LocalDateTime
	 * createdDate;
	 * 
	 * @LastModifiedBy
	 * 
	 * @Column(nullable = false) private String modifiedBy;
	 * 
	 * @LastModifiedDate
	 * 
	 * @Column(nullable = false) private LocalDateTime modifiedDate;
	 */
}