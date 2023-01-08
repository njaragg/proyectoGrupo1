package cl.generation.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // bigint

	@NotNull
	private String password;

	@Transient
	private String password2;

	
	@Size(min = 3, max = 15, message = "Error en el ingreso del nombre") // validamos tamaño mínimo y máximo de ese
																			// atributo
	private String nombre;

	
	@Size(min = 2, max = 15, message = "Error en el ingreso del apellido")
	private String apellido;

	
	private String rut;

	
	private String correo;

	
	private int telefono;

	
	private Date fechaNac;


	private String sexo;

	
	private String genero;



	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt; // INSERSION DE UN REGISTRO

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt; // MODIFICAR UN REGISTRO
	

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate // actualiza el atributo, quedando siempre la ultima info
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	//******************************RELACIONES*******************************************
	
	
	//******************************USUARIO-PREVISION************************************
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "previsiones_id")
	private Prevision prevision;
	
	//***********************************************************************************
	
	
	
	//******************************USUARIO-NOTA MEDICA**********************************
	
	@OneToMany
	(mappedBy = "usuarios",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<NotaMedica> notas_Medicas;
	
	//***********************************************************************************
	
	
	
	//******************************USUARIO-FICHA MEDICA*********************************
	
	@OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private FichaMedica fichaMedica;
	
	//***********************************************************************************

	
}