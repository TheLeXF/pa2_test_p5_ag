package com.uce.edu.matricula.service;

import com.uce.edu.matricula.repository.modelo.Matricula;

public interface IMatriculaService {
	public Matricula informacion(String noMat);
	public void agregar (Matricula matricula);
	public void actualizar(Matricula matricula);
	public void borrar(String noMat);
}
