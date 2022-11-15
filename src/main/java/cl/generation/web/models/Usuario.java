package cl.generation.web.models;


import java.util.Date;

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

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //bigint
	
	@NotNull
	private String password;
	
	@Transient
	private String password2;
	
	@NotNull
	@Size(min=3, max=15, message="Error en el ingreso del nombre") // validamos tamaño mínimo y máximo de ese atributo
	private String nombre;
	
	@NotNull
	@Size(min=2, max=15, message="Error en el ingreso del apellido")
	private String Apellido;
	
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
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt; //INSERSION DE UN REGISTRO
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt; //MODIFICAR UN REGISTRO


	//Constructores
	

	public Usuario() {
		super();
	}


	public Usuario(Long id, @NotNull String password, String password2,
			@NotNull @Size(min = 3, max = 15, message = "Error en el ingreso del nombre") String nombre,
			@NotNull @Size(min = 2, max = 15, message = "Error en el ingreso del apellido") String apellido,
			@NotNull String rut, @NotNull String correo, @NotNull int telefono, @NotNull Date fechaNac,
			@NotNull String sexo, @NotNull String genero, @NotNull String prevision, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.password = password;
		this.password2 = password2;
		this.nombre = nombre;
		Apellido = apellido;
		this.rut = rut;
		this.correo = correo;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.genero = genero;
		this.prevision = prevision;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getPrevision() {
		return prevision;
	}


	public void setPrevision(String prevision) {
		this.prevision = prevision;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	@PrePersist		//Agrega la columna la fecha antes de insertar
    protected void onCreate(){
        this.createdAt = new Date();
	}
  
	@PreUpdate		//El registro ya existe, entonces actualiza el atributo
	protected void onUpdate(){
	 this.updatedAt = new Date();
 }

	
	
	
}