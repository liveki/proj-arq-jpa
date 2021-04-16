package com.grupo1.grupo1.negocio.repositorios;

import java.util.List;

import com.grupo1.grupo1.negocio.entidades.Corredor;

public interface ICorredorRepository {
  List<Corredor> todos();

  void removeTodos();

  boolean cadastra(Corredor corredor);
}
