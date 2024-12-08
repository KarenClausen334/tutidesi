package tuti.desi.servicios;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> 95c730d (agrego)
import org.springframework.beans.factory.annotation.Autowired;
import tuti.desi.accesoDatos.Ciudad;
import tuti.desi.excepciones.Excepcion;
import tuti.desi.repositorio.CiudadRepo;

public class CiudadService {

<<<<<<< HEAD
    @Autowired
    private CiudadRepo ciudadRepo;

}
=======
	@Autowired
    private CiudadRepo ciudadRepo;

    // Agregar una nueva ciudad
    public void agregarCiudad(String nombre) throws Excepcion {
        if (ciudadRepo.findByNombre(nombre).isPresent()) {
            throw new Excepcion("La ciudad con nombre '" + nombre + "' ya existe.");
        }

        Ciudad ciudad = new Ciudad();
        ciudad.setNombre(nombre);
        ciudadRepo.save(ciudad);
    }

    // Obtener todas las ciudades
    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadRepo.findAll();
    }

    // Buscar ciudad por ID
    public Ciudad buscarPorId(Long id) throws Excepcion {
        return ciudadRepo.findById(id)
                .orElseThrow(() -> new Excepcion("No se encontró la ciudad con ID " + id));
    }

    // Buscar ciudad por nombre
    public Optional<Ciudad> buscarPorNombre(String nombre) {
        return ciudadRepo.findByNombre(nombre);
    }

    // Actualizar una ciudad
    public void actualizarCiudad(Long id, String nuevoNombre) throws Excepcion {
        Ciudad ciudad = ciudadRepo.findById(id)
                .orElseThrow(() -> new Excepcion("No se encontró la ciudad con ID " + id));

        if (ciudadRepo.findByNombre(nuevoNombre).isPresent()) {
            throw new Excepcion("Ya existe una ciudad con el nombre '" + nuevoNombre + "'.");
        }

        ciudad.setNombre(nuevoNombre);
        ciudadRepo.save(ciudad);
    }

    // Eliminar una ciudad por ID
    public void eliminarCiudad(Long id) throws Excepcion {
        if (!ciudadRepo.existsById(id)) {
            throw new Excepcion("No se encontró la ciudad con ID " + id);
        }

        ciudadRepo.deleteById(id);
    }
}
>>>>>>> 95c730d (agrego)
