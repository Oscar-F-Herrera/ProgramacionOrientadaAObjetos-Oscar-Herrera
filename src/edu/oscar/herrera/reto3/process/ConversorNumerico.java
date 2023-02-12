package edu.oscar.herrera.reto3.process;

/**
 * Esta clase contiene metodos para convertir números de una base numérica a otra
 *
 * @author Oscar Herrera
 */

public class ConversorNumerico {

    /**
     * Convierte el número decimal introducido por el usuario a su base binaria
     *
     * @param decimal El número introducido por el usuario
     *
     * @return Envia el número decimal en su base binaria
     */
    public static String convertirDecimalABinario(String decimal){

        int numeroBase = Integer.parseInt(decimal);
        String numeroBinario = "";

        if (numeroBase == 0){
            return "0";
        }

        while (numeroBase > 0){
            numeroBinario = (numeroBase % 2) + numeroBinario;
            numeroBase /= 2;
        }

        return numeroBinario;
    }

    /**
     * Convierte el número decimal introducido por el usuario a su base octal
     *
     * @param decimal El número introducido por el usuario
     *
     * @return Envia el número decimal en su base octal
     */
    public static String convertirDecimalAOctal(String decimal){

        int numeroBase = Integer.parseInt(decimal);
        String numeroOctal = "";

        if (numeroBase == 0){
            return "0";
        }

        while (numeroBase > 0){
            numeroOctal = (numeroBase % 8) + numeroOctal;
            numeroBase /= 8;
        }

        return numeroOctal;
    }

    /**
     * Convierte el número decimal introducido por el usuario a su base hexadecimal
     *
     * @param decimal El número introducido por el usuario
     *
     * @return Envia el número introducido en su base hexadecimal
     */
    public static String convertirDecimalAHexadecimal(String decimal){

        String conversionHexadecimal = "0123456789ABCDEF";

        int numeroBase = Integer.parseInt(decimal);
        char caracter;
        String numeroHexadecimal = "";

        while (numeroBase > 0) {
            caracter = conversionHexadecimal.charAt(numeroBase % 16);
            numeroHexadecimal = caracter + numeroHexadecimal;
            numeroBase /= 16;
        }

        return numeroHexadecimal;
    }

    /**
     * Convierte el número binario introducido por el usuario a su base decimal
     *
     * @param binario El número introducido por el usuario
     *
     * @return Envia el número introducido en su base decimal
     */
    public static String convertirBinarioADecimal(String binario){

        int numeroDecimal = 0;
        int numeroBase = Integer.parseInt(binario);
        int exponente = 0;
        String resultado = "";

        if (numeroBase == 0){
            return "0";
        }

        while (numeroBase > 0){
            numeroDecimal += (numeroBase % 10) * Math.pow(2, exponente);
            numeroBase /= 10;
            exponente++;
        }
        resultado = String.valueOf(numeroDecimal);

        return resultado;
    }

    /**
     * Convierte el número octal introducido por el usuario a su base decimal
     *
     * @param octal El número introducido por el usuario
     *
     * @return Envia el número introducido en su base decimal
     */
    public static String convertirOctalADecimal(String octal){

        int numeroDecimal = 0;
        int numeroBase = Integer.parseInt(octal);
        int exponente = 0;
        String resultado = "";

        if (numeroBase == 0){
            return "0";
        }

        while (numeroBase > 0){
            numeroDecimal += (numeroBase % 10) * Math.pow(8, exponente);
            numeroBase /= 10;
            exponente++;
        }
        resultado = String.valueOf(numeroDecimal);

        return resultado;
    }

    /**
     * Convierte el número hexadecimal introducido por el usuario a su base decimal
     *
     * @param hexadecimal El número introducido por el usuario
     *
     * @return Envia el número introducido en su base decimal
     */
    public static String convertirHexadecimalADecimal(String hexadecimal){

        String listaHexadecimal = "0123456789ABCDEF";

        int numeroDecimal = 0;
        String resultado = "";

        hexadecimal = hexadecimal.toUpperCase();

        for (int i = 0; i < hexadecimal.length(); i++){
            char caracter = hexadecimal.charAt(i);
            int digito = listaHexadecimal.indexOf(caracter);

            numeroDecimal = (16 * numeroDecimal) + digito;
        }
        resultado = String.valueOf(numeroDecimal);

        return resultado;
    }
}
