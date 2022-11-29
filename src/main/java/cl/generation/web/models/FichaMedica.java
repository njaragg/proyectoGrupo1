package cl.generation.web.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="fichas_medicas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FichaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //bigint
	

	private String alergias;
	
	//deberia tener tambien la llave foranea de grupo sanguineo, medicamentos

}
