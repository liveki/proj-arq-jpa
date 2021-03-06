package com.grupo1.grupo1.aplicacao.casosDeUso;

import com.grupo1.grupo1.aplicacao.dtos.EstatisticasDTO;
import com.grupo1.grupo1.aplicacao.servicos.ServicoEstatistica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaEstatisticasUC {
  private ServicoEstatistica servicoEstatistica;

  @Autowired
  public ConsultaEstatisticasUC(ServicoEstatistica servicoEstatistica) {
    this.servicoEstatistica = servicoEstatistica;
  }

  public EstatisticasDTO run(int distancia) {
    return servicoEstatistica.calculaEstatisticas(distancia);
  }
}
