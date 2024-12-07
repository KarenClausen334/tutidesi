package tuti.desi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.desi.accesoDatos.Ciudad;

@Repository
public interface CiudadRepo extends JpaRepository <Ciudad, Long> {

}
