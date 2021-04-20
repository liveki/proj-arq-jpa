package com.grupo1.grupo1.negocio.entidades;

import javax.persistence.Embeddable;

@Embeddable
public class Data {
  // Data do evento

  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  protected Data() {
  }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + ano;
  }
}
