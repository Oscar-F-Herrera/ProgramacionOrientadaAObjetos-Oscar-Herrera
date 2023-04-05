package edu.oscar.herrera.reto9.pelota.ui;

import edu.oscar.herrera.reto9.pelota.process.Pelota;

/**
 * Dentro de esta clase hay un metodo que muestra los resultados del programa
 */
public class CLI {
    /**
     * Este método crea un objeto del tipo pelota y luego muestra sus atributos antes y después de cambiarlos
     */
    public static void mostrarResultados(){
        Pelota miPelota = new Pelota("Rojo", 5,5);

        System.out.println("Los atributos de la pelota son:");
        System.out.println("Color: " + miPelota.color);
        System.out.println("Rapidez: " + miPelota.getRapidez());
        System.out.println("Poder: " + miPelota.getPoder());
        System.out.println();
        System.out.println("Disminuir Rapidez");
        miPelota.disminuirRapidez();
        System.out.println("La Rapidez es ahora de: " + miPelota.getRapidez());
        System.out.println();
        System.out.println("Aumentar Poder");
        miPelota.aumentarPoder();
        System.out.println("El poder es ahora de: " + miPelota.getPoder());
    }
}
