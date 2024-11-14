package com.primas.bp.laminar.air.flow.chamber1.log.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primas.bp.laminar.air.flow.chamber1.log.book.entity.PrimasBPLaminarAirFlowChamber1LogEntity;

@Repository
public interface PrimasBPLaminarAirFlowChamber1LogRepository extends JpaRepository<PrimasBPLaminarAirFlowChamber1LogEntity, Long>{


	Optional<PrimasBPLaminarAirFlowChamber1LogEntity> findByDate(String date);
}
