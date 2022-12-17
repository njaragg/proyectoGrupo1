package cl.generation.web.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="especialistas")
public class Especialista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max=15, message="Error en el ingreso del nombre")
	private String nombre;
	
	@NotNull
	@Size(min=2, max=15, message="Error en el ingreso del apellido")
	private String apellido;
	
	@NotNull
	private String titulo_profesional;

	public Especialista() {
		super();
	}

	public Especialista(Long id,
			@NotNull @Size(min = 3, max = 15, message = "Error en el ingreso del nombre") String nombre,
			@NotNull @Size(min = 2, max = 15, message = "Error en el ingreso del apellido") String apellido,
			@NotNull String titulo_profesional) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo_profesional = titulo_profesional;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo_profesional() {
		return titulo_profesional;
	}

	public void setTitulo_profesional(String titulo_profesional) {
		this.titulo_profesional = titulo_profesional;
	}
	
	//******************************ESPECIALISTA-NOTA MEDICA************************************
	
	@JsonIgnore
	@OneToMany(mappedBy = "especialistas",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<NotaMedica> notas_medicas;

	//******************************************************************************************

	
	//******************************ESPECIALISTA-TIPO ESPECIALIDAD******************************
	
	@ManyToOne
	@JoinColumn(name="tipoespecialidad_id")
	private TipoEspecialidad tipos_especialidades;

	//******************************************************************************************

}


