package br.eleicao.app.controller;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.ZonaRepository;


@RestController
@RequestMapping("/zonas")
public class ZonaController {

final ZonaRepository _zonaRepository;
	
	public ZonaController (ZonaRepository zonaRepository) {
		_zonaRepository = zonaRepository;
	}
	
	@PostMapping //INSERINDO MUNICIPIOS NOVOS
	public ResponseEntity inserir (@RequestBody Zona zona) {
		_zonaRepository.save(zona);		
		return ResponseEntity.status(HttpStatus.CREATED).body("Zona Eleitoral salvo com sucesso");
	}
	
	@GetMapping //PEGANDO TODOS OS DADOS
	public ResponseEntity listar() {
		Iterable<Zona> zonas = _zonaRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(zonas);
	}
	
	@GetMapping(path = "/{id}") //PEGANDO SOMENTE UM DADO
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Zona> zona = _zonaRepository.findById(id);
	    return ResponseEntity.status(HttpStatus.OK).body(zona);
	}
	
	 @PutMapping(path = "/{id}") //Atualizando Dados
	    public ResponseEntity atualizar(@RequestBody Zona zona, @PathVariable Long id) {
	    	zona.setId(id);
			_zonaRepository.save(zona);		
	        return ResponseEntity.status(HttpStatus.OK).body("Zona Eleitoral atualizado com sucesso!");
	    }
	
	 @DeleteMapping (path = "/{id}")
	 	public ResponseEntity deletar (@PathVariable Long id) {
		 _zonaRepository.deleteById(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	 }
	 
	 
}
