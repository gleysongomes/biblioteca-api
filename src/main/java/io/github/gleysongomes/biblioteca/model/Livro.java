package io.github.gleysongomes.biblioteca.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "tb_livro")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Column(name = "cd_livro")
	private Long cdLivro;

	@Column(nullable = false)
	private String titulo;

	@Column(name = "dt_cadastro", nullable = false)
	private Date dtCadastro;

	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;

	@Column(name = "fl_ativo", nullable = false)
	private Boolean flAtivo;
}
