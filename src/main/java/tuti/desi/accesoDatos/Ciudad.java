package tuti.desi.accesoDatos;


<<<<<<< HEAD
=======
import jakarta.persistence.Column;
>>>>>>> 95c730d (agrego)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {
<<<<<<< HEAD

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Valor de la clave primaria autogenerado por la base de datos (generalmente usando AUTO_INCREMENT)
	private Long id;
	
	private String nombre;
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
>>>>>>> 95c730d (agrego)

	@ManyToOne
	private Provincia provincia;

	public Ciudad() {
	}

	public Ciudad(Long id, String nombre, Provincia provincia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.provincia = provincia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombre=" + nombre + ", provincia=" + provincia + "]";
	}

}
