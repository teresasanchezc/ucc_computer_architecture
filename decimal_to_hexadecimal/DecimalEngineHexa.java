
package decimal_to_hexadecimal;

public class DecimalEngineHexa {

    public boolean validarDecimal(int decimal) {
        // Decimal pasa la validación con el hecho de que sea entero
        return true;
    }

    public String decimalAHexadecimal(int decimal) {
        int residuo;
        String hexadecimal = "";
        char[] caracteresHexadecimales = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
                'F' };
        while (decimal > 0) {
            residuo = decimal % 16;
            char caracterHexadecimal = caracteresHexadecimales[residuo];
            hexadecimal = caracterHexadecimal + hexadecimal;
            decimal = decimal / 16;
        }
        return hexadecimal;
    }
}