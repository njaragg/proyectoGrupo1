package cl.generation.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="notas_medicas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class NotaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	private String descripcion;
	private String tratamiento;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date proximaFechaAtencion;
	private String examenesSolicitados;
	private String numeroSesion;
	private String diagnostico;
	
	//******************************NOTA MEDICA-USUARIOS**********************************************
	
	@ManyToOne
	@JoinColumn(name = "Usuarios_id")
	private Usuario usuarios;
	
	//************************************************************************************************
	
	
	
	//******************************NOTA MEDICA-TIPO ESPECIALIDAD*************************************
	
	@ManyToOne
	@JoinColumn(name = "tipos_especialidades_id")
	private TipoEspecialidad tipos_especialidades;
	
	//************************************************************************************************
	
	

	//******************************NOTA MEDICA-ESPECIALISTA******************************************
	
	@ManyToOne
	@JoinColumn(name="especialistas_id")
	private Especialista especialistas;
	
	//************************************************************************************************

	//******************************NOTA MEDICA-MEDICAMENTO******************************************
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name="medicamentos_notas",//nombre de la tabla relacional 
			joinColumns = @JoinColumn(name="nota_medica_id"),
			inverseJoinColumns = @JoinColumn(name="medicamento_id")
			)
	private List<Medicamento> medicamentos;
		
	//************************************************************************************************
	
	
	//******************************NOTA MEDICA-IMAGEN************************************************
	
	@OneToMany(mappedBy = "notasMedicas",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Imagen> imagenes;

		
	//************************************************************************************************
}
