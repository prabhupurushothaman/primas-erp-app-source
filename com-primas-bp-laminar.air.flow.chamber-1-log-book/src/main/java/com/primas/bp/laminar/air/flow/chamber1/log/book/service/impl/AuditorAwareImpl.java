package com.primas.bp.laminar.air.flow.chamber1.log.book.service.impl;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.of("Prabhu"); //TODO: Pass the logged in user name dynamically
	}
}
