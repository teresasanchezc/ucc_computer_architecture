package decimal_to_binary;

import java.util.Scanner;

public class pgmDecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Convertidor de Numeros 🔢Decimales a Binarios");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner obj = new Scanner(System.in);
        int numero, residuo, binario = 0, exp = 0;
        System.out.println("Escriba un numero entero por favor ➡️: ");
        numero = obj.nextInt();

        // proceso
        while (numero != 0) {
            residuo = numero % 2;
            binario += residuo * Math.pow(10, exp);
            exp++;
            numero /= 2;
        }
        System.out.println("El numero convertido a Binario es: " + binario + "✅👍");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hasta Luego 🤙🤙🤙");

    }
}