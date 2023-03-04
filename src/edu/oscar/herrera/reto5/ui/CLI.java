package edu.oscar.herrera.reto5.ui;

import edu.oscar.herrera.reto5.process.ObtenerPalabras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase contiene el metodo para mostrarle el juego al usuario
 *
 * @author Oscar Herrera
 */
public class CLI {
    /**
     * Muestra al usuario el menu de dificultad y su progreso en el juego
     */
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> letrasAgregadas = new ArrayList<>();
        ArrayList<Integer> posicionesDescubiertas = new ArrayList<>();

        String palabraADecifrar = "";
        String letraIntroducida;
        int dificultad = 5;

        while (dificultad != 0){
            letrasAgregadas.clear();
            posicionesDescubiertas.clear();

            System.out.println("Seleccione una dificultad");
            System.out.println("1) Facil");
            System.out.println("2) Media");
            System.out.println("3) Dificil");
            System.out.println("0) Salir");
            dificultad = scanner.nextInt();

            switch (dificultad){
                case 1:
                    palabraADecifrar = ObtenerPalabras.palabraFacil();
                    break;
                case 2:
                    palabraADecifrar = ObtenerPalabras.palabraMedia();
                    break;
                case 3:
                    palabraADecifrar = ObtenerPalabras.palabraDificil();
                    break;
            }

            while (posicionesDescubiertas.size() != palabraADecifrar.length()) {
                System.out.println("Introduce una letra");
                letraIntroducida = scanner.next().toUpperCase();

                if (letrasAgregadas.contains(letraIntroducida)) {
                    System.out.println("Ya introduciste esa letra");
                    continue;
                }

                boolean letraEncontrada = false;
                for (int i = 0; i < palabraADecifrar.length(); i++) {
                    if (palabraADecifrar.charAt(i) == letraIntroducida.charAt(0)) {
                        letraEncontrada = true;
                        posicionesDescubiertas.add(i);
                    }
                }

                if (letraEncontrada) {
                    letrasAgregadas.add(letraIntroducida);

                    for (int i = 0; i < palabraADecifrar.length(); i++) {
                        if (posicionesDescubiertas.contains(i)) {
                            System.out.print(palabraADecifrar.charAt(i));
                        } else {
                            System.out.print("X");
                        }
                    }
                    System.out.println();
                } else {
                    letrasAgregadas.add(letraIntroducida);
                    System.out.println("Intentalo de nuevo");
                }
            }
            System.out.println("Si quiere salir, introdusca 0, de lo contrario, introdusca 1");
            dificultad = scanner.nextInt();
        }
    }
}
