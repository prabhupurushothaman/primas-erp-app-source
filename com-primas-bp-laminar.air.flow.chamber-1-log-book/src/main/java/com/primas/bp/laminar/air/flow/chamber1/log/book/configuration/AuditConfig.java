package com.primas.bp.laminar.air.flow.chamber1.log.book.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.primas.bp.laminar.air.flow.chamber1.log.book.service.impl.AuditorAwareImpl;

@Configuration
@EnableJpaAuditing
public class AuditConfig {
	
	@Bean
	public AuditorAware<String> auditorAware() {
		//return (AuditorAware<String>) new AuditorAwareImpl();
		return new AuditorAwareImpl();
	}
}
