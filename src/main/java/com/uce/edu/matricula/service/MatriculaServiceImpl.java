package com.uce.edu.matricula.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.matricula.repository.IMatriculaRepository;
import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.IVehiculoRepository;
import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public Matricula informacion(String noMat) {
		// TODO Auto-generated method stub
		return matriculaRepository.seleccionar(noMat);
	}

	@Override
	public void agregar(Matricula matricula) {
		this.matriculaRepository.insertar(matricula);

	}

	@Override
	public void actualizar(Matricula matricula) {
		this.matriculaRepository.actualizar(matricula);

	}

	@Override
	public void borrar(String noMat) {
		this.matriculaRepository.eliminar(noMat);
	}
	
	public void valorMatricula(String placa) {
		Vehiculo vehiculo = this.vehiculoRepository.seleccionar(placa);
		Matricula mat = new Matricula();
		BigDecimal precio = vehiculo.getPrecio();
		
		if (vehiculo.getTipo().equalsIgnoreCase("pesado")) {
			
			BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.15));
			mat.setValorMatricula(valorMatricula);
			this.actualizar(mat);
			
		}else if (vehiculo.getTipo().equalsIgnoreCase("liviano")){
			BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.10));
			mat.setValorMatricula(valorMatricula);
			this.actualizar(mat);
		}
	}
}
