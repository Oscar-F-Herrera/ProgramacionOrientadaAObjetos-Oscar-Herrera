package edu.oscar.herrera.reto6.ui;

import edu.oscar.herrera.reto6.process.Juego;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase contiene el metodo para mostrarle el juego al usuario
 *
 * @author Oscar Herrera
 */
public class CLI {

    static boolean cerrarJuego = false;

    /**
     * Muestra al usuario el menu de dificultad y su progreso en el juego
     */
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        String palabra;
        String continuar;

        byte dificultad = -1;

        while (!cerrarJuego){
            System.out.println("Bienvenido al juego de adivinar palabras");
            System.out.println("Seleccione una dificultad");
            System.out.println("1) Facil - 4 letras");
            System.out.println("2) Media - 8 letras");
            System.out.println("3) Dificil - 12 letras");
            System.out.println("Introdusca 0 en cualquier momento para cerrar el juego");

            while (true){
                try {
                    dificultad = scanner.nextByte();
                    if (dificultad >= 0 &&  dificultad <= 3){
                        scanner.nextLine();
                        break;
                    }else {
                        System.out.println("Introdusca una opcion valida");
                    }
                }catch (Exception e){
                    scanner.nextLine();
                    System.out.println("Introdusca una opcion valida");
                }
            }

            if (dificultad == 0){
                System.out.println("Gracias por jugar");
                System.out.println("Cerrando el juego...");
                break;
            }

            palabra = Juego.generarPalabra(dificultad);
            Juego.ejecutarJuego(palabra);

            if (Juego.letraIntroducida.equals("0")){
                System.out.println("Gracias por jugar");
                System.out.println("Cerrando el juego...");
                break;
            }

            System.out.println("¿Desea volver a jugar? Teclee 0 para no o cualquier tecla para si");
            continuar = scanner.nextLine();
            if (continuar.equals("0")){
                System.out.println("Gracias por jugar");
                System.out.println("Cerrando el juego...");
                cerrarJuego = true;
            }
        }
    }

    /**
     * Con este metodo se revisa lo que el usuario ingrese para comprobar que sea una sola letra
     *
     * @return Regresa la letra ingresada por el usuario
     */
    public static String obtenerLetra(){
        Scanner scanner = new Scanner(System.in);

        String letraIntroducida = "";

        System.out.println("Introdusca una letra");

        while (true){
            letraIntroducida = scanner.next().toLowerCase();

            if (letraIntroducida.length() > 1){
                System.out.println("Introdusca solo un caracter");
            } else if(letraIntroducida.charAt(0) == '0'){
                break;
            } else if (letraIntroducida.charAt(0) < 'a' || letraIntroducida.charAt(0) > 'z'){
                System.out.println("Caracter invalido, por favor introdusca una letra");
            } else {
                break;
            }
        }
        return letraIntroducida;
    }

    /**
     * Imprime las letras ya descubiertas y las que no las reemplaza con una X
     *
     * @param palabraADecifrar La palabra a descifrar
     * @param posicionesDescubiertas Una lista que contiene las pocisiones de la palabra que ya se descubrieron
     */
    public static void imprimirProgreso(String palabraADecifrar, ArrayList posicionesDescubiertas){
        for (int i = 0; i < palabraADecifrar.length(); i++) {
            if (posicionesDescubiertas.contains(i)) {
                System.out.print(palabraADecifrar.charAt(i));
            } else {
                System.out.print("X");
            }
        }
        System.out.println();
    }

    /**
     * Imprime un mensaje indicando que la letra que se introdujo no se encuentra en la palabra
     */
    public static void imprimirletraIncorrecta(){
        System.out.println("La letra que introdujo no se encuentra en la palabra. Intente con otra");
    }

    /**
     * Imprime un mensaje indicando que la letra que se introdujo ya fue introducida antes
     */
    public static void imprimirletraRepetida(){
        System.out.println("Ya introdujo esa letra, por favor introdusca otra");
    }
}
