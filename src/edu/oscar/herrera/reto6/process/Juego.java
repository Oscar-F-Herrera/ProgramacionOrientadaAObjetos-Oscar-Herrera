package edu.oscar.herrera.reto6.process;

import edu.oscar.herrera.reto6.ui.CLI;

import java.util.ArrayList;
import java.util.Random;

/**
 * En esta clase se ejectutan todos los proceso relacionados con el juego
 *
 * @author Oscar Herrera
 */
public class Juego {

    public static String letraIntroducida = "";

    /**
     * Este método asigna una palabra dependiendo de la dificultad seleccionada
     *
     * @param dificultad La dificultad que seleccionó el usuario ya sea facil, medio o dificil
     *
     * @return Regresa una palabra aleatoria de la lista referente a la dificultad
     */
    public static String generarPalabra(byte dificultad){
        Random random = new Random();

        String[] facil = {"alfa", "beta", "frio", "mano", "pala"};
        String[] media = {"fantasma", "explorar", "universo", "descanzo", "sbubabub"};
        String[] dificil = {"programacion", "electricidad", "enciclopedia", "adolescentes", "bachillerato"};

        String palabraADescifrar = "";

        switch (dificultad){
            case 1:
                palabraADescifrar = facil[random.nextInt(facil.length)];
                break;
            case 2:
                palabraADescifrar = media[random.nextInt(media.length)];
                break;
            case 3:
                palabraADescifrar = dificil[random.nextInt(dificil.length)];
                break;
        }

        return palabraADescifrar;
    }

    /**
     * En este método se ejecuta el juego
     *
     * @param palabraADecifrar La palabra que se va a descifrar
     */
    public static void ejecutarJuego(String palabraADecifrar){
        ArrayList<String> letrasAgregadas = new ArrayList<>();
        ArrayList<Integer> posicionesDescubiertas = new ArrayList<>();

        while (posicionesDescubiertas.size() != palabraADecifrar.length()) {

            letraIntroducida = CLI.obtenerLetra();

            if (letraIntroducida.equals("0")) {
                break;
            } else if (letrasAgregadas.contains(letraIntroducida)) {
                CLI.imprimirletraRepetida();
                continue;
            }

            boolean letraEncontrada = false;
            for (int i = 0; i < palabraADecifrar.length(); i++) {
                if (palabraADecifrar.charAt(i) == letraIntroducida.charAt(0)) {
                    letraEncontrada = true;
                    posicionesDescubiertas.add(i);
                }
            }

            letrasAgregadas.add(letraIntroducida);

            if (letraEncontrada) {

                CLI.imprimirProgreso(palabraADecifrar, posicionesDescubiertas);

            } else {

                CLI.imprimirletraIncorrecta();

            }
        }

        if (posicionesDescubiertas.size() == palabraADecifrar.length()){
            System.out.println("Felicidades, ha descubierto la palabra");
        }
    }
}
