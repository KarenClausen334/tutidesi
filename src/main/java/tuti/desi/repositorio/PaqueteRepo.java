package tuti.desi.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tuti.desi.accesoDatos.Ciudad;
import tuti.desi.accesoDatos.Paquete;

public interface PaqueteRepo extends JpaRepository <Paquete, Long> {
	
	
	// JPQL: Buscar por origen y destino
    @Query("SELECT p FROM Paquete p WHERE p.origen = :origen AND p.destino = :destino")
    List<Paquete> findByOrigenAndDestino(Ciudad origen, Ciudad destino);

}
