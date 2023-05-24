package decimal_to_hexadecimal;

import java.util.Scanner;

public class MainDecimalHexa {

    public static void main(String[] args) {

        String imprimir;
        String resultado;
        int numero;
        DecimalEngineHexa engine = new DecimalEngineHexa();

        Scanner capturar = new Scanner(System.in);
        System.out.println("|---------------------------------------");
        System.out.println("| Decimal a Hexadecimal 🖥️              ");
        System.out.println("| Lenguaje: Java                         ");
        System.out.println("| Author: Teresa Sánchez 🤙🏽              ");
        System.out.println("Conversor Decimal a Hexadecimal");
        System.out.println("-----------------------------");
        System.out.println("Ingrese un número Decimal 📥");
        System.out.println("-----------------------------");

        numero = capturar.nextInt();
        capturar.close();

        imprimir = engine.validarDecimal(numero) ? "si" : "no";
        resultado = engine.decimalAHexadecimal(numero);

        System.out.println("-----------------------------------------");
        if (imprimir.equals("si")) {
            System.out.println("✅El resultado es: " + resultado);
        } else {
            System.out.println("⛔El numero: " + numero + " No es Decimal.");
        }
        System.out.println("-----------------------------------------");
    }
}