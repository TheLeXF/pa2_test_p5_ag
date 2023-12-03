package com.uce.edu.matricula.service;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo informacion(String placa);
	public void agregar (Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void borrar(String placa);

}
