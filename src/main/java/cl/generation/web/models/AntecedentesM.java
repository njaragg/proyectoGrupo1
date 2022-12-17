package cl.generation.web.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name= "antecedentes_morbidos")
public class AntecedentesM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@Size(min=3, max=200)
	private String antecedentesM;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt; //INSERSION DE UN REGISTRO
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt; //MODIFICAR UN REGISTRO

	public AntecedentesM() {
		super();
	}

	public AntecedentesM(Long id, @NotNull @Size(min = 3, max = 200) String antecedentesM, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.antecedentesM = antecedentesM;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAntecedentesM() {
		return antecedentesM;
	}

	public void setAntecedentesM(String antecedentesM) {
		this.antecedentesM = antecedentesM;
	}
	
	
	// relacion con tabla fichaMedica ManyToOne-----------------
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="fichaMedica_id")
	private FichaMedica fichasMedicas;
	
	//----------------------------------------------------------
	
}
