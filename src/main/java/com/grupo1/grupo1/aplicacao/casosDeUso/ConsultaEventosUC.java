package com.grupo1.grupo1.aplicacao.casosDeUso;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Evento;
import com.grupo1.grupo1.negocio.servicos.ServicoEvento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaEventosUC {
  private ServicoEvento servicoEvento;

  @Autowired
  public ConsultaEventosUC(ServicoEvento servicoEvento) {
    this.servicoEvento = servicoEvento;
  }

  public List<Evento> run() {
    return servicoEvento.todos();
  }

}
