package infrastructure.adapters.input;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LectorArchivosJSON {
  private final String rutaArchivo;

  public LectorArchivosJSON(String rutaArchivo) {
    this.rutaArchivo = rutaArchivo;
  }

  public List<JSONObject> leer() throws IOException {
    List<JSONObject> objetos = new ArrayList<>();
    JSONParser parser = new JSONParser();
    try (FileReader reader = new FileReader(rutaArchivo)) {
      JSONArray jsonArray = null;
      try {
        jsonArray = (JSONArray) parser.parse(reader);
      } catch (ParseException e) {
        throw new RuntimeException(e);
      }
      for (Object obj : jsonArray) {
        JSONObject jsonObject = (JSONObject) obj;
        objetos.add(jsonObject);
      }
    }
    return objetos;
  }

}
