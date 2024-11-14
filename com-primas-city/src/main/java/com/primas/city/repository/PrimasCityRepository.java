package com.primas.city.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primas.city.entity.PrimasCityMasterEntity;

@Repository
public interface PrimasCityRepository extends JpaRepository<PrimasCityMasterEntity, Long> {

	// PrimasUnitMasterEntity findByName(String name);

	Optional<PrimasCityMasterEntity> findByCountryCode(String countryCode);

	Optional<PrimasCityMasterEntity> findByStateCode(String stateCode);

	Optional<PrimasCityMasterEntity> findByCityCode(String cityCode);
}
