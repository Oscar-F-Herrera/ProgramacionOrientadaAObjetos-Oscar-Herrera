package edu.oscar.herrera.reto5.process;

import java.util.Random;

/**
 * Esta clase contiene metodos para obtener una palabra de una lista dependiendo la dificultad
 *
 * @author Oscar Herrera
 */
public class ObtenerPalabras {
    /**
     * Obtiene una palabra de 4 letras
     *
     * @return Una palabra de 4 letras de la lista
     */
    public static String palabraFacil(){
        String[] facil = {"ALFA", "BETA", "FRIO", "MANO", "PALA"};
        Random random = new Random();

        return facil[random.nextInt(facil.length)];
    }

    /**
     * Obtiene una palabra de 8 letras
     *
     * @return Una palabra de 8 letras de la lista
     */
    public static String palabraMedia(){
        String[] media = {"FANTASMA", "EXPLORAR", "UNIVERSO", "DESCANZO", "SBUBABUB"};
        Random random = new Random();

        return media[random.nextInt(media.length)];
    }

    /**
     * Obtiene una palabra de 12 letras
     *
     * @return Una palabra de 12 letras de la lista
     */
    public static String palabraDificil(){
        String[] dificil = {"PROGRAMACION", "ELECTRICIDAD", "ENCICLOPEDIA", "ADOLESCENTES", "BACHILLERATO"};
        Random random = new Random();

        return dificil[random.nextInt(dificil.length)];
    }
}
