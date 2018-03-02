package com.ivson.festa.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.festa.model.Convidado;
import com.ivson.festa.repository.ConvidadoRepository;

@RestController
@CrossOrigin("${origem.permitida}")
public class ConvidadoResource {

	@Autowired
	private ConvidadoRepository convidadoRepository;

	@GetMapping("/convidados")
	public List<Convidado> listar() {
		return convidadoRepository.findAll();
	}

	@PostMapping("/convidados")
	public Convidado adicionar(@RequestBody @Valid Convidado convidado) {
		return convidadoRepository.save(convidado);
	}
}
