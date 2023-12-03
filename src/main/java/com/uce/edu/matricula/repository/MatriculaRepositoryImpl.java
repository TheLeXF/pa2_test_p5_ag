package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	public static List<Matricula> base = new ArrayList<Matricula>();

	@Override
	public Matricula seleccionar(String noMat) {
		for (Matricula mat : base) {
			if (mat.getNoMatricula().equals(noMat)) {
				Matricula temp = new Matricula();
				temp.setNoMatricula(mat.getNoMatricula());
				temp.setCedula(mat.getCedula());
				temp.setPlaca(mat.getPlaca());
				temp.setFechaMatricula(mat.getFechaMatricula());
				temp.setValorMatricula(mat.getValorMatricula());
				return temp;
			}
		}
		return null;
	}

	public Matricula seleccionarEliminar(String noMat) {
		for (Matricula mat : base) {
			if (mat.getNoMatricula().equals(noMat)) {
				return mat;
			}
		}
		return null;
	}

	@Override
	public void insertar(Matricula matricula) {
		base.add(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		this.eliminar(matricula.getNoMatricula());
		this.insertar(matricula);
	}

	@Override
	public void eliminar(String noMat) {
		Matricula temp = this.seleccionarEliminar(noMat);
		base.remove(temp);
	}

}
