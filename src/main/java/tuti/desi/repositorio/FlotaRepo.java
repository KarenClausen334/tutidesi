package tuti.desi.repositorio;

import java.util.List;
<<<<<<< HEAD

import org.springframework.data.jpa.repository.JpaRepository;
=======
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 95c730d (agrego)
import org.springframework.stereotype.Repository;

import tuti.desi.accesoDatos.Flota;

@Repository
public interface FlotaRepo extends JpaRepository <Flota, Long>{
	
<<<<<<< HEAD
	List<Flota> findByNombre(String nombre);
=======
    // Encuentra una flota por su nombre
    List<Flota> findByNombre(String nombre);

    // Encuentra flotas activas
    @Query("SELECT f FROM Flota f WHERE f.activo = true")
    List<Flota> findFlotasActivas();

    // Encuentra flotas por un atributo personalizado, como el tipo
    List<Flota> findByTipo(String tipo);

    // Encuentra una flota específica por ID y valida que este activa
    @Query("SELECT f FROM Flota f WHERE f.id = :id AND f.activo = true")
    Optional<Flota> findByIdAndActivo(@Param("id") Long id);
    
    
>>>>>>> 95c730d (agrego)
}

