package edu.oscar.herrera.reto2.piramide.ui;

import edu.oscar.herrera.reto2.piramide.process.Piramide;

import java.util.Scanner;

public class CLI {

    /**
     * Le pide un número al usuario y genera una piramide de ese tamaño
     */
    public static void obtenerDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la pirámide: ");
        int tamaño = scanner.nextInt(); scanner.nextLine();

        Piramide.crearPiramide(tamaño);
    }
}
