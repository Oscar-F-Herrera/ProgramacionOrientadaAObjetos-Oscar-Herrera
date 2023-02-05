package edu.oscar.herrera.reto2.piramide.process;

public class Piramide {

    /**
     * Crea una piramide de acuerdo al número que ingrese el usuario
     *
     * @param num el tamaño de la piramide
     */

    public static void crearPiramide(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                    System.out.print("* ");
            }
                System.out.println();
        }
    }
}
