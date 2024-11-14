package com.primas.city.service;

import com.primas.city.dto.PrimasCityMasterDto;

public interface PrimasCityService {
	PrimasCityMasterDto createCity(PrimasCityMasterDto primasCityMasterDto);
	
	PrimasCityMasterDto getCityById(Long id);

	PrimasCityMasterDto updateCity(PrimasCityMasterDto primasCityMasterDto, Long id);

	void deleteCity(Long id);

}
