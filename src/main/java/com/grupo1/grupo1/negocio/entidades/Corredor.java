package com.grupo1.grupo1.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corredor {
  @Id
  private String cpf;
  private String nome;
  private int diaDn;
  private int mesDn;
  private int anoDn;
  private String genero;

  public Corredor(String cpf, String nome, int diaDn, int mesDn, int anoDn, String genero) {
    this.cpf = cpf;
    this.nome = nome;
    this.diaDn = diaDn;
    this.mesDn = mesDn;
    this.anoDn = anoDn;
    this.genero = genero;
  }

  protected Corredor() {
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }

  public int getDiaDn() {
    return diaDn;
  }

  public int getMesDn() {
    return mesDn;
  }

  public int getAnoDn() {
    return anoDn;
  }

  public String getGenero() {
    return genero;
  }

}