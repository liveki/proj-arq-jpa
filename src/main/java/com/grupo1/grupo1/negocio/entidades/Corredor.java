package com.grupo1.grupo1.negocio.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Corredor {
  @Id
  private String cpf;
  private String nome;
  private int diaDn;
  private int mesDn;
  private int anoDn;
  private String genero;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "corredor_id")
  private List<Evento> eventos;

  public Corredor(String cpf, String nome, int diaDn, int mesDn, int anoDn, String genero, List<Evento> eventos) {
    this.cpf = cpf;
    this.nome = nome;
    this.diaDn = diaDn;
    this.mesDn = mesDn;
    this.anoDn = anoDn;
    this.genero = genero;
    this.eventos = eventos;
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

  public List<Evento> getEventos() {
    return eventos;
  }

  public void setEventos(List<Evento> eventos) {
    this.eventos = eventos;
  }

}