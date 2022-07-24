package io.github.gleysongomes.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.gleysongomes.biblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
