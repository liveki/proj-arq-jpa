package com.grupo1.grupo1.adaptadores.repositorios;

import com.grupo1.grupo1.negocio.entidades.Corredor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CorredorH2BD_ITF extends CrudRepository<Corredor, String> {
  List<Corredor> findAll();
}
