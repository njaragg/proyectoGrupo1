package cl.generation.web.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipos_especialidades")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoEspecialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreEspecialidad;
	private String tipo;

	//****************************** TIPO ESPECIALIDAD-NOTA MEDICA************************************
	@JsonIgnore //faltaba este JSONIGNORE
	@OneToMany
	(mappedBy = "tipos_especialidades",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<NotaMedica> notas_Medicas;
	
	//************************************************************************************************

	
	//****************************** TIPO ESPECIALIDAD-ESPECIALISTAS**********************************
	@JsonIgnore
	@OneToMany(mappedBy = "tipos_especialidades",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Especialista> especialistas;

	//************************************************************************************************
}
