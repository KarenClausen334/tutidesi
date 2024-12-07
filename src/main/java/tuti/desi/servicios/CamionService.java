package tuti.desi.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.Camion;
import tuti.desi.accesoDatos.Ciudad;
import tuti.desi.accesoDatos.Flota;
import tuti.desi.repositorio.CamionRepo;
import tuti.desi.repositorio.FlotaRepo;

@Service
public class CamionService {

	@Autowired
	public FlotaRepo flotaRepositorio;
	
	@Autowired
	public CamionRepo camionRepositorio;
	
	public void agregarCamion (String patente, Ciudad ciudad, String marca, int modelo, Flota flota) {
		
		Camion camion = new Camion ();
		
		camion.setPatente(patente);
		camion.setCiudad(ciudad);
		camion.setMarca(marca);
		camion.setModelo(modelo);
		
		camionRepositorio.save(camion);  //llamamos al metodo save que recibe una entidad por parametro y la persiste en la BDD
	}

}
	
