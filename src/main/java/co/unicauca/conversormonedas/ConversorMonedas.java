package co.unicauca.conversormonedas;

import java.util.Map;

public class ConversorMonedas {

    public static void realizarConversion(int opcion, Double valor, Map<String, Double> tasas) {
        double resultado;
        switch (opcion) {
            case 1: // USD → ARS
                resultado = valor * tasas.get("ARS");
                System.out.printf("%.2f USD = %.2f ARS\n", valor, resultado);
                break;
            case 2: // ARS → USD
                resultado = valor / tasas.get("ARS");
                System.out.printf("%.2f ARS = %.2f USD\n", valor, resultado);
                break;
            case 3: // USD → BRL
                resultado = valor * tasas.get("BRL");
                System.out.printf("%.2f USD = %.2f BRL\n", valor, resultado);
                break;
            case 4: // BRL → USD
                resultado = valor / tasas.get("BRL");
                System.out.printf("%.2f BRL = %.2f USD\n", valor, resultado);
                break;
            case 5: // USD → COP
                resultado = valor * tasas.get("COP");
                System.out.printf("%.2f USD = %.2f COP\n", valor, resultado);
                break;
            case 6: // COP → USD
                resultado = valor / tasas.get("COP");
                System.out.printf("%.2f COP = %.2f USD\n", valor, resultado);
                break;
            default:
                System.out.println("Conversión no implementada.");
        }
    }
}
