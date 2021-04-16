package com.grupo1.grupo1.negocio.servicos;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;
import com.grupo1.grupo1.negocio.repositorios.IEventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoEvento {
  private IEventoRepository eventoRep;

  @Autowired
  public ServicoEvento(IEventoRepository eventoRep) {
    this.eventoRep = eventoRep;
  }

  public List<Evento> todos() {
    return eventoRep.todos();
  }

  public void cadastra(Evento evento) {
    eventoRep.cadastra(evento);
  }

}
