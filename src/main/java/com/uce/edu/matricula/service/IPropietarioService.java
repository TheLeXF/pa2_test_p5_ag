package com.uce.edu.matricula.service;

import com.uce.edu.matricula.repository.modelo.Propietario;

public interface IPropietarioService {
	
	public Propietario informacion(String cedula);
	public void agregar (Propietario propietario);
	public void actualizar(Propietario propietario);
	public void borrar(String cedula);
}
