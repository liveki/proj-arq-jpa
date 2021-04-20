package com.grupo1.grupo1.adaptadores.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;

import org.springframework.data.repository.CrudRepository;

public interface ServicoEstatistica_ITF extends CrudRepository<Evento, Long> {
  List<Evento> findByDataAno(int ano);
}
