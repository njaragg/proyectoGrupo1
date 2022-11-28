package cl.generation.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario")
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

	@NotNull
	@Size(min = 3, max = 15, message = "Error en el ingreso del nombre") // validamos tamaño mínimo y máximo de ese
																			// atributo
	private String nombre;

	@NotNull
	@Size(min = 2, max = 15, message = "Error en el ingreso del apellido")
	private String apellido;

	@NotNull
	private String rut;

	@NotNull
	private String correo;

	@NotNull
	private int telefono;

	@NotNull
	private Date fechaNac;

	@NotNull
	private String sexo;

	@NotNull
	private String genero;

	@NotNull
	private String prevision;

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

}