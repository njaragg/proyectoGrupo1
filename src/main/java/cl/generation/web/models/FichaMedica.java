package cl.generation.web.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fichas_medicas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FichaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // bigint

	private String alergias;
	
	//*********************************************RELACIONES***********************************************************************

	//*************************************FICHA MEDICA-ANTECEDENTESM***************************************************************

	@OneToMany(mappedBy = "fichasMedicas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AntecedentesM> antecedentesM;

	//******************************************************************************************************************************

	
	
	//**************************************FICHA MEDICA-MEDICAMENTOS***************************************************************

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "medicamentos_fichaMedica", // nombre de la tabla relacional
			joinColumns = @JoinColumn(name = "fichaMedica_id"), inverseJoinColumns = @JoinColumn(name = "medicamento_id"))
	private List<Medicamento> medicamentos;

	//******************************************************************************************************************************


	
	//***************************************FICHA MEDICA-USUARIO*******************************************************************
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="usuario_id")
	private Usuario usuario;

	//******************************************************************************************************************************

}

