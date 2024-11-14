package com.primas.bp.laminar.air.flow.chamber1.log.book.audit;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.primas.bp.laminar.air.flow.chamber1.log.book.util.PrimasBpLaminarAirFlowChamber1LogBookConstants;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

//@Getter(AccessLevel.PROTECTED)
//@Setter(AccessLevel.PROTECTED)
@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U> {
	@CreatedBy
	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.CREATED_BY)
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.CREATED_DATE)
	private Date createdDate;

	@LastModifiedBy
	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.LAST_MODIFIED_BY)
	private String lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	@Column(name = PrimasBpLaminarAirFlowChamber1LogBookConstants.LAST_MODIFIED_DATE)
	private Date lastModifiedDate;
}
