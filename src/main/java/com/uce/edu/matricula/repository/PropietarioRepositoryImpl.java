package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	public static List<Propietario> base = new ArrayList<Propietario>();

	@Override
	public Propietario seleccionar(String cedula) {
		for (Propietario pro : base) {
			if (pro.getCedula().equals(cedula)) {
				Propietario temp = new Propietario();
				temp.setNombre(pro.getNombre());
				temp.setApellido(pro.getApellido());
				temp.setCedula(pro.getCedula());
				temp.setFechaNacimiento(pro.getFechaNacimiento());
				return temp;

			}
		}
		return null;
	}

	public Propietario seleccionarEliminar(String cedula) {
		for (Propietario pro : base) {
			if (pro.getCedula().equals(cedula)) {
				return pro;
			}
		}
		return null;
	}

	@Override
	public void insertar(Propietario propietario) {
		base.add(propietario);

	}

	@Override
	public void actualizar(Propietario propietario) {
		this.eliminar(propietario.getCedula());
		this.insertar(propietario);

	}

	@Override
	public void eliminar(String cedula) {
		Propietario pro = this.seleccionarEliminar(cedula);
		base.remove(pro);
	}

}
