/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.conversormonedas;

/**
 *
 * @author Unicauca
 */


import java.util.Scanner;

public class MenuHandler {

    public static void mostrarMenu() {
        System.out.println("\n=== Conversor de Monedas ===");
        System.out.println("""
        1) Dolar --> Peso Argentino
        2) Peso Argentino --> Dolar
        3) Dolar --> Real Brasilero
        4) Real Brasileño → Dolar
        5) Dolar --> Peso Colombiano
        6) Peso Colombiano --> Dolar
        7) Salir
        """);
    }

    public static int leerOpcion(Scanner scanner) {
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public static double leerValor(Scanner scanner) {
        System.out.print("Ingrese el valor a convertir: ");
        return scanner.nextDouble();
    }
}
