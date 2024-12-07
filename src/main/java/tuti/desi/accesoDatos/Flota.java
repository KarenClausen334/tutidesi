package tuti.desi.accesoDatos;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "flota")
public class Flota {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long Id;
	
	@OneToMany
	private List<Camion> camiones;


	public Flota() {
	}

	public Flota(Long id, List<Camion> camiones) {
		Id = id;
		this.camiones = camiones;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public List<Camion> getCamiones() {
		return camiones;
	}

	public void setCamiones(List<Camion> camiones) {
		this.camiones = camiones;
	}

	@Override
	public String toString() {
		return "Flota [Id=" + Id + ", camiones=" + camiones + "]";
	}

	

}
