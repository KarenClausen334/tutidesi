package tuti.desi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository; // Correcto import para JpaRepository
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional; // Asegúrate de usar jakarta.transaction
import tuti.desi.accesoDatos.Camion;
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
}