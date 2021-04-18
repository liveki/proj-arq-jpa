DROP TABLE corredores IF EXISTS;
DROP TABLE eventos IF EXISTS;

CREATE TABLE corredores (
  cpf VARCHAR(255),
  nome VARCHAR(255),
  genero VARCHAR(255),
  diaDn int,
  mesDn int,
  anoDn int,
  PRIMARY KEY(cpf)
);

CREATE TABLE eventos(
  id int AUTO_INCREMENT,
  nome VARCHAR(255),
  dia int,
  mes int,
  ano int,
  distancia int,
  horas int,
  minutos int,
  segundos int,
  PRIMARY KEY(id)
);