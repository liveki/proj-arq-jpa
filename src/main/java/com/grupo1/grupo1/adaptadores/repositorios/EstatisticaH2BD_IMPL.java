package com.grupo1.grupo1.adaptadores.repositorios;

import com.grupo1.grupo1.negocio.repositorios.IEstatisticaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grupo1.grupo1.negocio.entidades.Evento;

import java.util.List;

@Component
public class EstatisticaH2BD_IMPL implements IEstatisticaRepository {
  private EstatisticaH2BD_ITF eventoRepository;

  @Autowired
  public EstatisticaH2BD_IMPL(EstatisticaH2BD_ITF estatisticaH2BD_ITF) {
    this.eventoRepository = estatisticaH2BD_ITF;
  }

  @Override
  public List<Evento> findByDistancia(int distancia) {
    return eventoRepository.findByDistancia(distancia);
  }
}
