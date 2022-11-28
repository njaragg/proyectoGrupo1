package cl.generation.web.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "lugares_atencion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LugarAtencion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String modalidad;

	@NotNull
	private String lugar;
	
	@NotNull
	private Long lugaresId;

}
