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

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //bigint
	
	@NotNull
	@Size(min=3, max=15, message="Error en el ingreso den nombre") // validamos tamaño mínimo y máximo de ese atributo

	private String nombre;
	
	@NotNull
	private String correo;
	
	@NotNull
	private String password;
	
	@Transient
	private String password2;
	
	private String nick;
	
	@Range(min=40, max=300,message="Peso fuera de rango")
	private Float peso;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt; //INSERSION DE UN REGISTRO
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt; //MODIFICAR UN REGISTRO
	
	

	    
	
	
	
	//CONSTRUCTORES NUEVOS
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

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	// //CONSTRUCTORES ANTIGUOS
	public Usuario() {
		super();
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
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
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
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