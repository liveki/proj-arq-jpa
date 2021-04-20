package com.grupo1.grupo1.adaptadores.repositorios;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;

public interface EstatisticaH2BD_ITF extends CrudRepository<Evento, Long> {
  List<Evento> findByDistancia(int distancia);
}
