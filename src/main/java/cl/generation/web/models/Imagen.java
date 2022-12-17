package cl.generation.web.models;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="imagenes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Imagen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //bigint
	
	private String nombre;
	
	@Lob
	private Blob data;
	
	//******************************IMAGEN-NOTA MEDICA******************************************
	@JsonIgnore 
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="notaMedica_id")
	private NotaMedica notasMedicas;
	
	//******************************************************************************************
}
