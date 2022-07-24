package io.github.gleysongomes.biblioteca.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.gleysongomes.biblioteca.model.Livro;
import io.github.gleysongomes.biblioteca.repository.LivroRepository;
import io.github.gleysongomes.biblioteca.service.LivroService;

@Service
@Transactional
public class LivroServiceImpl implements LivroService {

	@Autowired
	private LivroRepository livroRepository;

	@Override
	public Livro save(Livro livro) {
		return livroRepository.save(livro);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Livro> findAll() {
		return livroRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Livro> findById(Long cdLivro) {
		return livroRepository.findById(cdLivro);
	}

}
