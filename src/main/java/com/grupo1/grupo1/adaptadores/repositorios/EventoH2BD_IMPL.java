package com.grupo1.grupo1.adaptadores.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;
import com.grupo1.grupo1.negocio.repositorios.IEventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventoH2BD_IMPL implements IEventoRepository {
  private EventoH2BD_ITF eventoRepository;

  @Autowired
  public EventoH2BD_IMPL(EventoH2BD_ITF eventoH2BD_ITF) {
    this.eventoRepository = eventoH2BD_ITF;
  }

  @Override
  public List<Evento> todos() {
    return eventoRepository.findAll();
  }

  @Override
  public boolean cadastra(Evento evento) {
    System.out.print(evento);
    eventoRepository.save(evento);
    return true;
  }
}
