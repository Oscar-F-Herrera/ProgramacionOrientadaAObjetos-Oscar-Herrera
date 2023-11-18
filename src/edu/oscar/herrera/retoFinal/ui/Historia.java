package edu.oscar.herrera.retoFinal.ui;

/**
 * Esta clase contiene la historia del juego
 * @author Oscar Herrera
 */
public class Historia {
    /**
     * Imprime la introducción al juego
     */
    public static void introduccion(){
        System.out.println("Desde hace mucho tiempo. Un poderoso mago ha atacado al pueblo");
        System.out.println("y ha causado caos en todas partes. Pero finalmente ha llegado");
        System.out.println("el día. La esperanza vuelve a surgir en forma de un guerrero.");
    }

    /**
     * Imprime el mensaje final del juego
     */
    public static void finalDelJuego(){
        System.out.println("¡Victoria épica! Tu valentía y habilidad han derrotado al malvado mago," +
                "\nliberando así al pueblo oprimido. Tus acciones han traído una nueva esperanza" +
                "\na estas personas que han sufrido tanto tiempo bajo la oscuridad. Eres un verdadero" +
                "\nhéroe y el pueblo te estará eternamente agradecido.\n");
        System.out.println("¡Felicidades " + CLI.jugador.nombre + " por esta hazaña heroica y por liberar al pueblo de su opresor!");
    }
}
