package tuti.desi.servicios;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

@Service
public class FlotaService {
	
		
		
}
	
	
=======
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.Flota;
import tuti.desi.repositorio.FlotaRepo;

@Service
public class FlotaService {
	
	@Autowired
    private FlotaRepo flotaRepositorio;

    // Crear una nueva flota
    public void agregarFlota(String nombre, String descripcion) {
        Flota flota = new Flota();
        flota.setNombre(nombre);
        flotaRepositorio.save(flota);
    }

    // Obtener todas las flotas
    public List<Flota> obtenerTodasLasFlotas() {
        return flotaRepositorio.findAll();
    }

    // Buscar flota por ID
    public Optional<Flota> buscarFlotaPorId(Long id) {
        return flotaRepositorio.findById(id);
    }

    // Buscar flotas por nombre
    public List<Flota> buscarFlotasPorNombre(String nombre) {
        return flotaRepositorio.findByNombre(nombre);
    }

}
>>>>>>> 95c730d (agrego)

