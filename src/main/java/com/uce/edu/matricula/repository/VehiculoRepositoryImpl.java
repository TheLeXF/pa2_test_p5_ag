package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
	public static List<Vehiculo>base= new ArrayList<Vehiculo>();

	@Override
	public Vehiculo seleccionar(String placa) {
		for (Vehiculo vehiculo:base) {
			if (vehiculo.getPlaca().equals(placa));
			Vehiculo temp= new Vehiculo();
			temp.setMarca(vehiculo.getMarca());
			temp.setPlaca(vehiculo.getPlaca());
			temp.setPrecio(vehiculo.getPrecio());
			temp.setTipo(vehiculo.getTipo());
			return temp;
		}
		return null;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		base.add(vehiculo);

	}
	public Vehiculo seleccionarEliminar(String placa) {
		for(Vehiculo vehiculo:base) {
			if (vehiculo.getPlaca().equals(placa)) {
				return vehiculo;
			}
		}
		return null;
	}
	
	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
		

	}

	@Override
	public void eliminar(String placa) {
		Vehiculo temp =this.seleccionar(placa);
		base.remove(temp);
	}

}
