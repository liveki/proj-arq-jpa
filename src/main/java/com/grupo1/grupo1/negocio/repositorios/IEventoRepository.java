package com.grupo1.grupo1.negocio.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;

public interface IEventoRepository {
  List<Evento> todos();

  boolean cadastra(Evento evento);

  List<Evento> findByDistancia(int distancia);

  List<Evento> findByAno(int ano);
}
