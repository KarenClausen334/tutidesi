package tuti.desi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.desi.accesoDatos.Provincia;

@Repository
public interface ProvinciaRepo extends JpaRepository <Provincia, Long> {

}
