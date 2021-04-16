package com.grupo1.grupo1.aplicacao.servicos;

import com.grupo1.grupo1.aplicacao.dtos.EstatisticasDTO;

public interface ICalculoEstatistica {
  EstatisticasDTO calculaEstatisticas(int distancia);
}
