package io.github.gleysongomes.biblioteca.service;

import java.util.List;
import java.util.Optional;

import io.github.gleysongomes.biblioteca.model.Livro;

public interface LivroService {

	Livro save(Livro livro);

	List<Livro> findAll();

	Optional<Livro> findById(Long cdLivro);

}
