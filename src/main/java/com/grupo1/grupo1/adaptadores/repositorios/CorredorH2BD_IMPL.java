package com.grupo1.grupo1.adaptadores.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Corredor;
import com.grupo1.grupo1.negocio.repositorios.ICorredorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorredorH2BD_IMPL implements ICorredorRepository {
  private CorredorH2BD_ITF corredorRepository;

  @Autowired
  public CorredorH2BD_IMPL(CorredorH2BD_ITF corredorH2BD_ITF) {
    this.corredorRepository = corredorH2BD_ITF;
  }

  @Override
  public List<Corredor> todos() {
    return corredorRepository.findAll();
  }

  @Override
  public void removeTodos() {
    // Limpa a base de dados
    corredorRepository.deleteAll();
  }

  @Override
  public boolean cadastra(Corredor corredor) {
    // Então cadastra o novo "corredor único"
    corredorRepository.save(corredor);
    return true;
  }
}
