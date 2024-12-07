package tuti.desi.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.desi.accesoDatos.Flota;

@Repository
public interface FlotaRepo extends JpaRepository <Flota, Long>{
	
	List<Flota> findByNombre(String nombre);
}

