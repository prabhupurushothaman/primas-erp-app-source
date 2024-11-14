package com.primas.city.entity;

import java.io.Serializable;

import com.primas.city.util.PrimasCityConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = PrimasCityConstants.PRIMAS_CITY_MASTER)
public class PrimasCityMasterEntity implements Serializable   {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = PrimasCityConstants.TXN_ID)
	private long id;

	@Column(name = PrimasCityConstants.COUNTRY_CODE, nullable = false)
	private String countryCode;

	@Column(name = PrimasCityConstants.STATE_CODE, nullable = false)
	private String stateCode;

	@Column(name = PrimasCityConstants.CITY_CODE, nullable = false)
	private String cityCode;


	@Column(name = PrimasCityConstants.CITY_DESCRIPTION, nullable = false)
	private String cityDescription;
}
