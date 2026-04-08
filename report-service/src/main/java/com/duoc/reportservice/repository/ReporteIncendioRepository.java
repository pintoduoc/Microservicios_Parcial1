package com.duoc.reportservice.repository;

import com.duoc.reportservice.model.ReporteIncendio;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReporteIncendioRepository extends JpaRepository<ReporteIncendio, Long> {
	List<ReporteIncendio> findByEstado(ReporteIncendio.Estado estado);
	List<ReporteIncendio> findByLatitudAndLongitud(Double latitud, Double longitud);
}
