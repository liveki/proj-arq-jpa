package com.grupo1.grupo1.adaptadores.configuradores;

import com.grupo1.grupo1.aplicacao.servicos.EstatisticaDesconsidera;
import com.grupo1.grupo1.aplicacao.servicos.EstatisticaNormal;
import com.grupo1.grupo1.aplicacao.servicos.ICalculoEstatistica;
import com.grupo1.grupo1.negocio.repositorios.IEstatisticaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorCalculoEstatistica {
  private IEstatisticaRepository eventoRep;

  @Autowired
  public ConfiguradorCalculoEstatistica(IEstatisticaRepository eventoRep) {
    this.eventoRep = eventoRep;
  }

  @Bean
  @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "original", matchIfMissing = true)
  public ICalculoEstatistica opcaoRegraClassica() {
    return new EstatisticaNormal(eventoRep);
  }

  @Bean
  @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "desconsidera")
  public ICalculoEstatistica opcaoDesconsidera() {
    return new EstatisticaDesconsidera(eventoRep);
  }
}
