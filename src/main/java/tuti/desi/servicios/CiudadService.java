package tuti.desi.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import tuti.desi.accesoDatos.Ciudad;
import tuti.desi.excepciones.Excepcion;
import tuti.desi.repositorio.CiudadRepo;

public class CiudadService {

    @Autowired
    private CiudadRepo ciudadRepo;

}
