package edu.oscar.herrera.reto2.boletos.process;

public class CalcularCostos {



    /**
     * Realiza una suma al costo total dependiendo del boleto que el usuario escogió
     *
     * @param boleto el tipo de boleto
     * @param cifra la cifra a sumar
     *
     * @return el total de la suma
     */
    public static double calcularPrecio(String boleto, double cifra){
        switch (boleto) {
            case "A":
                cifra += 100;
                break;
            case "N":
                cifra += 70;
                break;
            case "I":
                cifra += 50;
                break;
            case "B":
                cifra += 70;
                break;
        }
        return cifra;
    }

    /**
     * Aumenta en uno el boleto que el usuario haya seleccionado
     *
     * @param boleto el tipo de boleto
     *
     * @param bA cantidad de boletos de adulto
     * @param bN cantidad de boletos de niño
     * @param bI cantidad de boletos de INAPAM
     * @param bB cantidad de boletos de adulto mayor
     */
    public static void aumentarCantidad(String boleto, int bA, int bN, int bI, int bB){
        switch (boleto) {
            case "A":
                bA++;
                break;
            case "N":
                bN++;
                break;
            case "I":
                bI++;
                break;
            case "B":
                bB++;
                break;
        }

        System.out.println("Usted ha seleccionado: " + bA + " de adulto, " + bN + " de niño, " + bI + " de INAPAM y " + bB + " de adulto mayor");
    }
}
