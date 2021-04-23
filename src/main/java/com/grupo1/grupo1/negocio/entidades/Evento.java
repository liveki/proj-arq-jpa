package com.grupo1.grupo1.negocio.entidades;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;

  @Embedded
  private Data data;

  @Embedded
  private Hora hora;

  // Distancia percorrida
  private int distancia; // metros

  private String corredor_id;

  public Evento(Long id, String nome, Data data, int distancia, Hora hora, String corredor_id) {
    this.id = id;
    this.nome = nome;
    this.data = data;
    this.distancia = distancia;
    this.hora = hora;
    this.corredor_id = corredor_id;
  }

  protected Evento() {
  }

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Data getData() {
    return data;
  }

  public Hora getHora() {
    return hora;
  }

  public int getDistancia() {
    return distancia;
  }

  public String getCorredor_id() {
    return corredor_id;
  }

  public void setCorredor_id(String corredor_id) {
    this.corredor_id = corredor_id;
  }

  @Override
  public String toString() {
    return "Evento [distancia=" + distancia + ", Hora=" + hora + ", id=" + id + ", Data=" + data + ", nome=" + nome
        + "]";
  }
}