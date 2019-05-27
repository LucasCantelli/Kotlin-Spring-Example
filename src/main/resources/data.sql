DROP TABLE IF EXISTS pessoa;
DROP TABLE IF EXISTS equipe;

CREATE TABLE pessoa (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250),
  idade VARCHAR(250),
  sexo VARCHAR(250),
  usuario VARCHAR(250),
  senha VARCHAR(250),
  cpf VARCHAR(250),
  email VARCHAR(250),
  rg VARCHAR(250),
  cargo VARCHAR(250),
  endereco VARCHAR(250),
  equipe_id INT
);

CREATE TABLE equipe (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250),
  pessoa_id INT
);

INSERT INTO equipe (nome) VALUES
  ('Shield');

INSERT INTO pessoa (nome, equipe_id) VALUES
  ('Yudi', 1);