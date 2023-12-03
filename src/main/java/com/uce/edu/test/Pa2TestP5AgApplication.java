package com.uce.edu.test;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.matricula.repository.IMatriculaRepository;
import com.uce.edu.matricula.repository.modelo.Vehiculo;
import com.uce.edu.matricula.service.IMatriculaService;
import com.uce.edu.matricula.service.IPropietarioService;
import com.uce.edu.matricula.service.IVehiculoService;

@SpringBootApplication
public class Pa2TestP5AgApplication implements CommandLineRunner{
	
	@Autowired
	private IMatriculaService matriculaService;
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2TestP5AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Chevrolet");
		v1.setPlaca("PCB1242");
		v1.setPrecio(new BigDecimal(15999.99));
		v1.setTipo("liviano");
		this.vehiculoService.agregar(v1);
		
		System.out.println("El Vehiculo: "+ this.vehiculoService.informacion(v1.getPlaca()));
		
	}

}
