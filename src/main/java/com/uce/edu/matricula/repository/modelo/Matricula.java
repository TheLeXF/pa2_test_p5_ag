package com.uce.edu.matricula.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component
public class Matricula {
	private String noMatricula;
	private Propietario cedula;
	private Vehiculo placa;
	private LocalDateTime fechaMatricula;
	private BigDecimal valorMatricula;

	public String getNoMatricula() {
		return noMatricula;
	}

	public void setNoMatricula(String noMatricula) {
		this.noMatricula = noMatricula;
	}

	public Propietario getCedula() {
		return cedula;
	}

	public void setCedula(Propietario cedula) {
		this.cedula = cedula;
	}

	public Vehiculo getPlaca() {
		return placa;
	}

	public void setPlaca(Vehiculo placa) {
		this.placa = placa;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	@Override
	public String toString() {
		return "Matricula [cedula=" + cedula + ", placa=" + placa + ", fechaMatricula=" + fechaMatricula
				+ ", valorMatricula=" + valorMatricula + "]";
	}

}
