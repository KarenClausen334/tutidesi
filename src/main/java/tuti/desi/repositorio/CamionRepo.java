package tuti.desi.repositorio;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository; // Correcto import para JpaRepository
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional; // Asegúrate de usar jakarta.transaction
import tuti.desi.accesoDatos.Camion;
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import tuti.desi.accesoDatos.Camion;
import tuti.desi.accesoDatos.Ciudad;
import tuti.desi.accesoDatos.Flota;
>>>>>>> 95c730d (agrego)
@Repository
public interface CamionRepo extends JpaRepository<Camion, Long> {  

    @Query("UPDATE Camion c SET c.flota.id = :idFlota WHERE c.id = :idCamion")
    @Modifying
    @Transactional
    void agregarCamionAFlota(Long idFlota, Long idCamion);

    @Query("DELETE Camion c SET c.flota.id = :idFlota WHERE c.id = :idCamion")
    @Modifying
    @Transactional
    void eliminarCamionDeLaFlota(Long idFlota, Long idCamion);
<<<<<<< HEAD
}
=======
    

    // Buscar camiones por ciudad
    List<Camion> findByCiudad(Ciudad ciudad);

    // Buscar camiones por flota
    List<Camion> findByFlota(Flota flota);
}
>>>>>>> 95c730d (agrego)
