package com.grupo1.grupo1.negocio.entidades;

import javax.persistence.Embeddable;

@Embeddable
public class Hora {
  // Tempo que o corredor levou para percorrer a distancia
  private int horas;
  private int minutos;
  private int segundos;

  public Hora(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  protected Hora() {
  }

  public int getHoras() {
    return horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  @Override
  public String toString() {
    return horas + ":" + minutos + ":" + segundos;
  }
}
