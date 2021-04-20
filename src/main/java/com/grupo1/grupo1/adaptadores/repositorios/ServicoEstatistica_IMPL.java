package com.grupo1.grupo1.adaptadores.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;
import com.grupo1.grupo1.negocio.repositorios.IServicoEstatisticaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoEstatistica_IMPL implements IServicoEstatisticaRepository {
  private ServicoEstatistica_ITF eventoRepository;

  @Autowired
  public ServicoEstatistica_IMPL(ServicoEstatistica_ITF estatisticaH2BD_ITF) {
    this.eventoRepository = estatisticaH2BD_ITF;
  }

  @Override
  public List<Evento> findByAno(int distancia) {
    return eventoRepository.findByDataAno(distancia);
  }
}
