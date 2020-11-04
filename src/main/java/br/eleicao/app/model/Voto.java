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
	private Candidato Canditado;

	
	@ManyToOne
	@JoinColumn (name ="EleitorId")
	private Eleitor Eleitor;

	@ManyToOne
	@JoinColumn (name ="ZonaId")
	private Zona Zona;
	
	
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Candidato getCanditado() {
		return Canditado;
	}


	public void setCanditado(Candidato canditado) {
		Canditado = canditado;
	}


	public Eleitor getEleitor() {
		return Eleitor;
	}


	public void setEleitor(Eleitor eleitor) {
		Eleitor = eleitor;
	}


	public Zona getZona() {
		return Zona;
	}


	public void setZona(Zona zona) {
		Zona = zona;
	}

	
	
	
	

}
