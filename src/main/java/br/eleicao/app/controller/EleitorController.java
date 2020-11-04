package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.eleicao.app.model.Eleitor;
import br.eleicao.app.repository.EleitorRepository;

@RestController
@RequestMapping("/eleitores")
public class EleitorController {
	
final EleitorRepository _eleitorRepository;
	
	public EleitorController (EleitorRepository eleitorRepository) {
		_eleitorRepository = eleitorRepository;
	}
	
	@PostMapping //INSERINDO MUNICIPIOS NOVOS
	public ResponseEntity inserir (@RequestBody Eleitor eleitor) {
		_eleitorRepository .save(eleitor);		
		return ResponseEntity.status(HttpStatus.CREATED).body("Eleitor salvo com sucesso");
	}
	
	@GetMapping //PEGANDO TODOS OS DADOS
	public ResponseEntity listar() {
		Iterable<Eleitor> eleitores = _eleitorRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(eleitores);
	}
	
	@GetMapping(path = "/{id}") //PEGANDO SOMENTE UM DADO
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Eleitor> eleitor = _eleitorRepository.findById(id);
	    return ResponseEntity.status(HttpStatus.OK).body(eleitor);
	}
	
	 @PutMapping(path = "/{id}") //Atualizando Dados
	    public ResponseEntity atualizar(@RequestBody Eleitor eleitor, @PathVariable Long id) {
	    	eleitor.setId(id);
			_eleitorRepository.save(eleitor);		
	        return ResponseEntity.status(HttpStatus.OK).body("Eleitor atualizado com sucesso!");
	    }

	 @DeleteMapping (path = "/{id}")
	 	public ResponseEntity deletar (@PathVariable Long id) {
		 _eleitorRepository.deleteById(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	 }
	 

}
