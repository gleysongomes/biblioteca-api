package io.github.gleysongomes.biblioteca.resource;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.github.gleysongomes.biblioteca.model.Livro;
import io.github.gleysongomes.biblioteca.service.LivroService;

@RestController
@RequestMapping(path = "/livros", produces = MediaType.APPLICATION_JSON_VALUE)
public class LivroResource {

	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<Livro> listar() {
		return livroService.findAll();
	}

	@PostMapping
	public ResponseEntity<Livro> criar(@RequestBody Livro livro, HttpServletResponse response) {
		livro.setDtCadastro(new Date());
		livro = livroService.save(livro);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{cdLivro}")
				.buildAndExpand(livro.getCdLivro()).toUri();

		response.setHeader(HttpHeaders.LOCATION, uri.toASCIIString());

		return ResponseEntity.created(uri).body(livro);
	}

	@GetMapping("/{cdLivro}")
	public ResponseEntity<Livro> buscarPeloCodigo(@PathVariable Long cdLivro) {
		return livroService.findById(cdLivro).map(livro -> ResponseEntity.ok(livro))
				.orElse(ResponseEntity.notFound().build());
	}

}
