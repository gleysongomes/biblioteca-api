CREATE TABLE `tb_livro` (
  `cd_livro` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `titulo` varchar(100) NOT NULL,
  `dt_cadastro` datetime NOT NULL,
  `dt_atualizacao` datetime,
  `fl_ativo` boolean NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_livro(titulo, dt_cadastro, fl_ativo) VALUES ('Livro A', sysdate(), TRUE);
INSERT INTO tb_livro(titulo, dt_cadastro, fl_ativo) VALUES ('Livro B', sysdate(), TRUE);
INSERT INTO tb_livro(titulo, dt_cadastro, fl_ativo) VALUES ('Livro C', sysdate(), TRUE);
INSERT INTO tb_livro(titulo, dt_cadastro, fl_ativo) VALUES ('Livro D', sysdate(), TRUE);
INSERT INTO tb_livro(titulo, dt_cadastro, fl_ativo) VALUES ('Livro E', sysdate(), TRUE);

