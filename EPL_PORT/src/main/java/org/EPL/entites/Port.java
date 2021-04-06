package org.EPL.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Port {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long PORCOD;
	private String PORNOM;
	private int CODSTA;
	
	@ManyToOne
	private Escale esc;
	
	
}
