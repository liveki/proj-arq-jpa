package com.grupo1.grupo1.aplicacao.servicos;

import java.util.List;

import com.grupo1.grupo1.aplicacao.dtos.EstatisticasDTO;
import com.grupo1.grupo1.aplicacao.dtos.PerformanceDTO;
import com.grupo1.grupo1.negocio.entidades.Evento;
import com.grupo1.grupo1.negocio.repositorios.IServicoEstatisticaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoEstatistica {
  private IServicoEstatisticaRepository eventoRep;
  private ICalculoEstatistica calculoEstatistica;

  @Autowired
  public ServicoEstatistica(IServicoEstatisticaRepository eventoRepository, ICalculoEstatistica calculoEstatistica) {
    this.eventoRep = eventoRepository;
    this.calculoEstatistica = calculoEstatistica;
  }

  public EstatisticasDTO calculaEstatisticas(int distancia) {
    return calculoEstatistica.calculaEstatisticas(distancia);
  }

  public PerformanceDTO calculaAumentoPerformance(int distancia, int ano) {
    List<Evento> eventos = eventoRep.findByAno(ano);
    int indiceMaiorDif = 0;
    double maiorDif = -1.0;
    for (int i = 0; i < eventos.size() - 1; i++) {
      Evento e1 = eventos.get(i);
      Evento e2 = eventos.get(i + 1);
      double tempo1 = e1.getHora().getHoras() * 60 * 60 + e1.getHora().getMinutos() * 60.0 + e1.getHora().getSegundos();
      double tempo2 = e2.getHora().getHoras() * 60 * 60 + e2.getHora().getMinutos() * 60.0 + e2.getHora().getSegundos();
      if ((tempo1 - tempo2) > maiorDif) {
        maiorDif = tempo1 - tempo2;
        indiceMaiorDif = i;
      }
    }
    return new PerformanceDTO(eventos.get(indiceMaiorDif).getNome(), eventos.get(indiceMaiorDif + 1).getNome(),
        maiorDif);
  }
}
