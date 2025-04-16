/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.conversormonedas;

/**
 *
 * @author Unicauca
 */


import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String apiKey = "0c86eee08f80a9bb48a3f786"; 

        // Obtener tasas desde la API
        Map<String, Double> tasas = APIClient.obtenerTasasDesdeAPI(apiKey);
        if (tasas == null) {
            System.out.println("No se pudo obtener las tasas. Cerrando programa.");
            return;
        }

        int opcion;
        do {
            // Mostrar menú y obtener opción
            MenuHandler.mostrarMenu();
            opcion = MenuHandler.leerOpcion(scanner);

            // Si la opción es válida, realizar conversión
            if (opcion >= 1 && opcion <= 6) {
                double valor = MenuHandler.leerValor(scanner);
                ConversorMonedas.realizarConversion(opcion, valor, tasas);
            } else if (opcion != 7) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el conversor.");
    }
}
