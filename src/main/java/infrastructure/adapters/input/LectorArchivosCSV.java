package infrastructure.adapters.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivosCSV {
  private final String rutaArchivo;

  public LectorArchivosCSV(String rutaArchivo) {
    this.rutaArchivo = rutaArchivo;
  }

  public List<String[]> leer() throws IOException {
    List<String[]> lineas = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(",");
        lineas.add(datos);
      }
    }
    return lineas;
  }
}
