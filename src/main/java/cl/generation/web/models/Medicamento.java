package cl.generation.web.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // bigint

	private String nombre;

	// ********************MEDICAMENTOS-FICHA MEDICA**************************************************
	@JsonIgnore
	@ManyToMany(mappedBy = "medicamentos", fetch = FetchType.LAZY)
	private List<FichaMedica> fichasMedicas;
	
	// ***********************************************************************************************
	
	
	//******************************MEDICAMENTOS-NOTA MEDICA******************************************
	
	@JsonIgnore
	@ManyToMany(mappedBy = "medicamentos",fetch = FetchType.LAZY)
	private List<NotaMedica> notasMedicas;
		
	//************************************************************************************************

}
