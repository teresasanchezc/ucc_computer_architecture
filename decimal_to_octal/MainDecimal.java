package decimal_to_octal;

import java.util.Scanner;

public class MainDecimal {
    public static void main(String[] args) {
        String imprimir;
        String resultado;
        int numero;
        DecimalEngine engine = new DecimalEngine();

        Scanner capturar = new Scanner(System.in);
        System.out.println("Conversor Decimal a Octal ");
        System.out.println("-----------------------------");
        System.out.println("Ingrese un número decimal 📥");
        System.out.println("-----------------------------");

        numero = capturar.nextInt();
        capturar.close();

        imprimir = engine.validarDecimal(numero) ? "si" : "no";
        resultado = engine.decimalAOctal(numero);

        System.out.println("-----------------------------------------");
        if (imprimir.equals("si")) {
            System.out.println("✅El resultado es: " + resultado);
        } else {
            System.out.println("⛔El numero: " + numero + " No es un numero Decimal.");
        }
        System.out.println("-----------------------------------------");
    }
}