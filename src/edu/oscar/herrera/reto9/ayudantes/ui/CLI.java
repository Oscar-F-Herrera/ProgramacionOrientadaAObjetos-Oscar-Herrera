package edu.oscar.herrera.reto9.ayudantes.ui;

import edu.oscar.herrera.reto9.ayudantes.process.Ayudante;

/**
 * En esta clase se encuentran algunos métodos que imprimen información a la consola
 */
public class CLI {
    /**
     * Esté metodo crea 5 objetos de tipo Ayudante y manda a llamar a su función mostrarDatos
     */
    public static void mostrarDatosDeAyudantes() {
        Ayudante ayudante1 = new Ayudante();
        Ayudante ayudante2 = new Ayudante();
        Ayudante ayudante3 = new Ayudante();
        Ayudante ayudante4 = new Ayudante();
        Ayudante ayudante5 = new Ayudante();

        ayudante1.mostrarDatos();
        System.out.println();
        ayudante2.mostrarDatos();
        System.out.println();
        ayudante3.mostrarDatos();
        System.out.println();
        ayudante4.mostrarDatos();
        System.out.println();
        ayudante5.mostrarDatos();
    }

    /**
     * Imprime la cantidad de ojos que tiene el ayudante
     * @param cantidadDeOjos La cantidad de ojos
     */
    public static void mostrarCantidadOjos(int cantidadDeOjos){
        System.out.println("La cantidad de ojos es de: " + cantidadDeOjos);
    }

    /**
     * Imprime el color de piel que tiene el ayudante
     * @param colorDePiel El color de piel
     */
    public static void mostrarColorDePiel(String colorDePiel){
        System.out.println("El color de piel es: " + colorDePiel);
    }

    /**
     * Imprime la altura del ayudante
     * @param altura La altura
     */
    public static void mostrarAltura(String altura){
        System.out.println("La altura es: " + altura);
    }

    /**
     * Imprime el nivel de creación del ayudante
     * @param nivelDeCreacion El nivel de creación
     */
    public static void mostrarNivelDeCreacion(int nivelDeCreacion){
        System.out.println("El nivel de creación es de: " + nivelDeCreacion);
    }

    /**
     * Imprime el nivel de reparación del ayudante
     * @param nivelDeReparacion El nivel de reparación
     */
    public static void mostrarNivelDeReparacion(int nivelDeReparacion){
        System.out.println("El nivel de creación es de: " + nivelDeReparacion);
    }

    /**
     * Imprime el nivel de destrucción del ayudante
     * @param nivelDeDestruccion El nivel de destrucción
     */
    public static void mostrarNivelDeDestruccion(int nivelDeDestruccion){
        System.out.println("El nivel de creación es de: " + nivelDeDestruccion);
    }
}
