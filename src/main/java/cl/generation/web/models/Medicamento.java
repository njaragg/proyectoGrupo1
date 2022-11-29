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
@Table(name="medicamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //bigint
	
	
	private String nombre;
	
	//deberia tener llaves foraneas relacionadas con nota medica y ficha medica
	
	

}
