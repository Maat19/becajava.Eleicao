package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
	@JoinColumn (name ="CanditadoId")
	private Canditado Canditado;

	
	@ManyToOne
	@JoinColumn (name ="EleitorId")
	private Eleitor Eleitor;

	

}
