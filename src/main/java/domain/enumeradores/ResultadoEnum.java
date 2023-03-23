package domain.enumeradores;

public enum ResultadoEnum {

  GANADOR("Ganador"), PERDEDOR("Perdedor"), EMPATE("Empate");

  private final String resultado;

  private ResultadoEnum(String resultado) {
    this.resultado = resultado;
  }

  public String getResultado() {
    return resultado;
  }

}
