package com.uce.edu.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.modelo.Propietario;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public Propietario informacion(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionar(cedula);
	}

	@Override
	public void agregar(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);

	}

	@Override
	public void actualizar(Propietario propietario) {
		this.propietarioRepository.actualizar(propietario);

	}

	@Override
	public void borrar(String cedula) {
		this.propietarioRepository.eliminar(cedula);
	}

}
