package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.eleicao.app.model.Municipio;
import br.eleicao.app.repository.MunicipioRepository;


@RestController
@RequestMapping("/municipios")
public class MunicipioController {

	final MunicipioRepository _municipioRepository;
	
	public MunicipioController (MunicipioRepository municipioRepository) {
		_municipioRepository = municipioRepository;
	}
	
	@PostMapping //INSERINDO MUNICIPIOS NOVOS
	public ResponseEntity inserir (@RequestBody Municipio municipio) {
		_municipioRepository.save(municipio);		
		return ResponseEntity.status(HttpStatus.CREATED).body("Municipio salvo com sucesso");
	}
	
	@GetMapping //PEGANDO TODOS OS DADOS
	public ResponseEntity listar() {
		Iterable<Municipio> municipios = _municipioRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(municipios);
	}
	
	@GetMapping(path = "/{id}") //PEGANDO SOMENTE UM DADO
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Municipio> municipio = _municipioRepository.findById(id);
	    return ResponseEntity.status(HttpStatus.OK).body(municipio);
	}
	
	 @PutMapping(path = "/{id}") //Atualizando Dados
	    public ResponseEntity atualizar(@RequestBody Municipio municipio, @PathVariable Long id) {
	    	municipio.setId(id);
			_municipioRepository.save(municipio);		
	        return ResponseEntity.status(HttpStatus.OK).body("Município atualizado com sucesso!");
	    }

	 @DeleteMapping (path = "/{id}")
	 	public ResponseEntity deletar (@PathVariable Long id) {
		 _municipioRepository.deleteById(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	 }
	 
	 

}	

