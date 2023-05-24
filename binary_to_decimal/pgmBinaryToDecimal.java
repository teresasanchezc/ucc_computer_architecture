
import java.util.Scanner;

public class pgmBinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Convertidor de Numeros Binarios a 🔢Decimales");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner obj = new Scanner(System.in);
        int num, residuo, c = 0, decimal = 0;
        System.out.println("Escriba un numero binario por favor ➡️: ");
        num = obj.nextInt();

        // proceso
        while (num != 0) {
            residuo = num % 10;
            decimal += residuo * Math.pow(2, c);
            c++;
            num /= 10;
        }
        System.out.println("El numero convertido a decimal es: " + decimal + "✅👍");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hasta Luego 🤙🤙🤙");
    }
}