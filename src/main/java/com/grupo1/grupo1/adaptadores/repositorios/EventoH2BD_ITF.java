package com.grupo1.grupo1.adaptadores.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;

import org.springframework.data.repository.CrudRepository;

public interface EventoH2BD_ITF extends CrudRepository<Evento, Long> {
  List<Evento> findAll();

  List<Evento> findByDistancia(int distancia);

  List<Evento> findByAno(int ano);
}
