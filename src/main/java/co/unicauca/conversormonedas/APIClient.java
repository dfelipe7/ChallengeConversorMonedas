/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.conversormonedas;

/**
 *
 * @author Unicauca
 */

import java.net.http.*;
import java.net.URI;
import java.util.Map;
import com.google.gson.*;

public class APIClient {

    public static Map<String, Double> obtenerTasasDesdeAPI(String apiKey) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertimos JSON a objeto usando Gson
            JsonObject jsonObj = JsonParser.parseString(response.body()).getAsJsonObject();

            if (!jsonObj.get("result").getAsString().equals("success")) {
                System.err.println("Error: respuesta no exitosa de la API.");
                return null;
            }

            JsonObject conversionRates = jsonObj.getAsJsonObject("conversion_rates");
            Gson gson = new Gson();
            return gson.fromJson(conversionRates, Map.class);

        } catch (Exception e) {
            System.err.println("Error al obtener tasas: " + e.getMessage());
            return null;
        }
    }
}
