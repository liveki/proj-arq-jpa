package com.grupo1.grupo1.negocio.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;

public interface IEstatisticaRepository {
  List<Evento> findByDistancia(int distancia);
}
