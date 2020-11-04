package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Voto;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaRepository;

@SpringBootApplication
public class EleicaoApplication  implements CommandLineRunner{

	//Criando proprietade da interface do Municipio
	final MunicipioRepository _municipioRepository;
	final CandidatoRepository _candidatoRepository;
	final EleitorRepository _eleitorRepository;
	final VotoRepository _votoRepository;
	final ZonaRepository _zonaRepository;
	
	
	
	
	//Alimentando a propriedade com a construção da classe
	
	public EleicaoApplication (MunicipioRepository municipioRepository, 
			CandidatoRepository candidatoRepository, 
			EleitorRepository eleitorRepository, 
			VotoRepository votoRepository,
			ZonaRepository zonaRepository) {
		
		this._municipioRepository = municipioRepository;
		this._candidatoRepository = candidatoRepository;
		this._eleitorRepository = eleitorRepository;
		this._votoRepository = votoRepository;
		this._zonaRepository = zonaRepository;
	}

	
	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	
		//ZONA ELEITORAL	
		
		//INSERT 
//		Zona zona = new Zona();
//		zona.setNome("Escola Junior");
//		_zonaRepository.save(zona);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");
//		
//		zona = new Zona();
//		zona.setNome("Faculdade Senior");
//		_zonaRepository.save(zona);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");
		
		
		//Deletando uma Zona Eleitoral
//		Zona zona = new Zona();		
//		zona.setId(new Long(1));
//		_zonaRepository.delete(zona);;
//		System.out.println("Zona Eleitoral deletado com sucesso!");
		
		//Atualizando uma Zona Eleitoral
//		Zona zona = new Zona();
//		zona.setId(new Long(1));
//		zona.setNome("Faculdade 8 de Julho");
//		_zonaRepository.save(zona);				
//		System.out.println("Zona Eleitoral atualizado com sucesso!");	
		
		
		//Selecionando apenas UMa Zona Eleitoral
//		Optional<Zona> zona = _zonaRepository.findById(new Long(1));
//		System.out.println("Zona Eleitoral: " + zona.get().getNome());
				
				
		//Selecionando todas as Zonas Eleitorais
//		Iterable<Zona> zona = _zonaRepository.findAll(); 	
//		for(Zona z : zona) {
//		System.out.println("Zonas Eleitorais: " + z.getNome());
//		}
		

		
		
		
		
		//Eleitor
		
//		INSERT
//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("João");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor salvo com sucesso!");
//		
//		eleitor = new Eleitor();
//		eleitor.setNome("Marcos");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor salvo com sucesso!");
		
		
		//Deletando um Eleitor
//		Eleitor eleitor = new Eleitor();		
//		eleitor.setId(new Long(1));
//		_eleitorRepository.delete(eleitor);;
//		System.out.println("Eleitor deletado com sucesso!");
//		
		
		//Atualizando um Eleitor
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(1));
//		eleitor.setNome("Luana");
//		_eleitorRepository.save(eleitor);				
//		System.out.println("Eleitor atualizado com sucesso!");	
		
		
		//Selecionando apenas UM Eleitor
//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(1));
//		System.out.println("Eleitor: " + eleitor.get().getNome());
				
				
		//Selecionando todos os Eleitores
//		Iterable<Eleitor> eleitor = _eleitorRepository.findAll(); 	
//		for(Eleitor e : eleitor) {
//		System.out.println("Eleitores: " + e.getNome());
//		}
		

		
		
		
		//CANDITADO
		
		//INSERT 
		
		
//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setId(1L);
//		candidato.setNumero("12345");
//		candidato.setNome("Joana");
//		candidato.setTipo("Veradora");
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidado salvo com sucesso!");
//		
//		candidato = new Candidato();
//		municipio.setId(1L);
//		candidato.setNumero("12345");
//		candidato.setNome("Luis");
//		candidato.setTipo("Prefeito");	
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidado salvo com sucesso!");
		
		//Deletando um Candidato
//		Candidato candidato = new Candidato();		
//		candidato.setId(new Long(2));
//		_candidatoRepository.delete(candidato);;
//		System.out.println("Candidato deletado com sucesso!");
		
		//Atualizando um Candidato
//		Candidato candidato = new Candidato();
//		candidato.setId(new Long(3));
//		candidato.setNumero("12345");
//		candidato.setNome("João");
//		candidato.setTipo("Prefeito");
//		_candidatoRepository.save(candidato);			
//		System.out.println("Candidato atualizado com sucesso!");
		
		//Selecionando apenas UM Candidato
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(1));
//		System.out.println("Candidato: " + candidato.get().getNome());
		
		
		//Selecionando todos os Candidatos
//		Iterable<Candidato> candidato = _candidatoRepository.findAll(); 		
//			for(Candidato c : candidato) {
//			System.out.println("Candidatos: " + c.getNome());
//		}
		
		
		
		//MUNICIPIO
		//Salvar Município (Insert)
		//Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Sorocaba");
//		municipio.setPopulacao(140000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//	
//		municipio = new Municipio();
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(1400000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		

		
//		municipio = new Municipio();
//		municipio.setNome("Campinas");
//		municipio.setPopulacao(200000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("São Bernardo");
//		municipio.setPopulacao(300000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
		
		
		
		
		
		//Deletando um município
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(2));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
//		
		
		
		
		
		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(3)); // essa função faz a atualização
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
//		
//		
		
		
			

		
		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(1));
//		System.out.println("Município: " + municipio.get().getNome());
		
		
		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll(); //Iterable usa para pegar todos os dados		
//			for(Municipio m : municipios) {
//				System.out.println("Município: " + m.getNome());
//		}
		
//		Iterable<Municipio> municipio = _municipioRepository.findAll(); 		
//			for(Municipio p : municipio) {
//				System.out.println("População: " + p.getPopulacao());
//		
//	}

}
}

