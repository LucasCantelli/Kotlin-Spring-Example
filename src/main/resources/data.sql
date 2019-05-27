DROP TABLE IF EXISTS people;
DROP TABLE IF EXISTS equipe;

CREATE TABLE people (
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
  people_id INT
);

INSERT INTO equipe (nome) VALUES
  ('Shield');

INSERT INTO people (nome, equipe_id) VALUES
  ('Yudi', 1);