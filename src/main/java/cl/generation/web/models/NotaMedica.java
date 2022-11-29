package cl.generation.web.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	
}
