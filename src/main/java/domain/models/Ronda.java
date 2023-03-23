package domain.models;

import java.util.List;

public class Ronda {

  private String numero;
  private List<Partido> partidos;
  public int puntos;

  public Ronda() {
  }

  public Ronda(String numero,
      List<Partido> partidos,
      int puntos) {
    this.numero = numero;
    this.partidos = partidos;
    this.puntos = puntos;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public List<Partido> getPartidos() {
    return partidos;
  }

  public void setPartidos(List<Partido> partidos) {
    this.partidos = partidos;
  }

  public int getPuntos() {
    return puntos;
  }

  public void setPuntos(int puntos) {
    this.puntos = puntos;
  }
}
