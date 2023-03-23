package domain.models;

import domain.enumeradores.ResultadoEnum;

public class Partido {

  private Equipo equipoLocal;
  private Equipo equipoVisitante;
  private int golesLocal;
  private int golesVisitante;
  public ResultadoEnum resultado;

  public Partido() {
  }

  public Partido(Equipo equipoLocal,
      Equipo equipoVisitante,
      int golesLocal,
      int golesVisitante,
      ResultadoEnum resultado) {
    this.equipoLocal = equipoLocal;
    this.equipoVisitante = equipoVisitante;
    this.golesLocal = golesLocal;
    this.golesVisitante = golesVisitante;
    this.resultado = resultado;
  }

  public Equipo getEquipoLocal() {
    return equipoLocal;
  }

  public void setEquipoLocal(Equipo equipoLocal) {
    this.equipoLocal = equipoLocal;
  }

  public Equipo getEquipoVisitante() {
    return equipoVisitante;
  }

  public void setEquipoVisitante(Equipo equipoVisitante) {
    this.equipoVisitante = equipoVisitante;
  }

  public int getGolesLocal() {
    return golesLocal;
  }

  public void setGolesLocal(int golesLocal) {
    this.golesLocal = golesLocal;
  }

  public int getGolesVisitante() {
    return golesVisitante;
  }

  public void setGolesVisitante(int golesVisitante) {
    this.golesVisitante = golesVisitante;
  }

  public ResultadoEnum getResultado() {
    return resultado;
  }

  public void setResultado(ResultadoEnum resultado) {
    this.resultado = resultado;
  }
}
