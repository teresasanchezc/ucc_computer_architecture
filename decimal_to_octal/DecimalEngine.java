package decimal_to_octal;

public class DecimalEngine {
    public boolean validarDecimal(int decimal) {
        // Decimal pasa la validación con el hecho de que sea entero
        System.out.println("❌ El dato ingresado no es un numero Octal ❌");
        return true;
    }

    public String decimalAOctal(int decimal) {
        int residuo;
        String octal = "";
        char[] caracteresOctales = { '0', '1', '2', '3', '4', '5', '6', '7' };
        while (decimal > 0) {
            residuo = decimal % 8;
            char caracter = caracteresOctales[residuo];
            octal = caracter + octal;
            decimal = decimal / 8;
        }
        return octal;
    }
}