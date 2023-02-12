package edu.oscar.herrera.reto3.ui;

import edu.oscar.herrera.reto3.process.ConversorNumerico;
import java.util.Scanner;

/**
 * Esta clase coontiene el metodo para mostrar un menu al usuario
 *
 * @author Oscar Herrera
 */

public class CLI {

    /**
     * Muestra al usuario en menú que le permite elegir el tipo de conversión que desee y tambien le permite cerrar el programa
     */
    public static void mostrarMenu(){

        Scanner scanner = new Scanner(System.in);

        int tipoDeConversion;

        String numeroAConvertir;
        String numeroConvertido;

        String continuar = "s";

        while (continuar.equals("s")) {

            System.out.println("------------------------------------------");
            System.out.println("|                  MENU                  |");
            System.out.println("------------------------------------------");
            System.out.println("\nSeleccione una de las siguientes opciones:\n");
            System.out.println("1) Convertir Decimal a Binario");
            System.out.println("2) Convertir Decimal a Octal");
            System.out.println("3) Convertir Decimal a Hexadecimal");
            System.out.println("4) Convertir Binario a Decimal");
            System.out.println("5) Convertir Octal a Decimal");
            System.out.println("6) Convertir Hexadecimal a Decimal");

            tipoDeConversion = scanner.nextInt();
            scanner.nextLine();

            while (tipoDeConversion < 1 || tipoDeConversion > 6) {
                System.out.println("Introdusca una opción válida");
                tipoDeConversion = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println();

            switch (tipoDeConversion) {
                case 1:
                    System.out.println("Convertir Decimal a Binario");
                    System.out.print("Introdusca el número a convertir: ");

                    numeroAConvertir = scanner.nextLine();

                    numeroConvertido = ConversorNumerico.convertirDecimalABinario(numeroAConvertir);

                    System.out.println("El resultado de la conversión es: " + numeroConvertido);
                    break;
                case 2:
                    System.out.println("Convertir Decimal a Octal");
                    System.out.print("Introdusca el número a convertir: ");

                    numeroAConvertir = scanner.nextLine();

                    numeroConvertido = ConversorNumerico.convertirDecimalAOctal(numeroAConvertir);

                    System.out.println("El resultado de la conversión es: " + numeroConvertido);
                    break;
                case 3:
                    System.out.println("Convertir Decimal a Hexadecimal");
                    System.out.print("Introdusca el número a convertir: ");

                    numeroAConvertir = scanner.nextLine();

                    numeroConvertido = ConversorNumerico.convertirDecimalAHexadecimal(numeroAConvertir);

                    System.out.println("El resultado de la conversión es: " + numeroConvertido);
                    break;
                case 4:
                    System.out.println("Convertir Binario a Decimal");
                    System.out.print("Introdusca el número a convertir: ");

                    numeroAConvertir = scanner.nextLine();

                    numeroConvertido = ConversorNumerico.convertirBinarioADecimal(numeroAConvertir);

                    System.out.println("El resultado de la conversión es: " + numeroConvertido);
                    break;
                case 5:
                    System.out.println("Convertir Octal a Decimal");
                    System.out.print("Introdusca el número a convertir: ");

                    numeroAConvertir = scanner.nextLine();

                    numeroConvertido = ConversorNumerico.convertirOctalADecimal(numeroAConvertir);

                    System.out.println("El resultado de la conversión es: " + numeroConvertido);
                    break;
                case 6:
                    System.out.println("Convertir Hexadecimal a Decimal");
                    System.out.print("Introdusca el número a convertir: ");

                    numeroAConvertir = scanner.nextLine();

                    numeroConvertido = ConversorNumerico.convertirHexadecimalADecimal(numeroAConvertir);

                    System.out.println("El resultado de la conversión es: " + numeroConvertido);
                    break;
            }
            System.out.println();

            System.out.println("¿Desea realizar otra conversión? s|n");
            continuar = scanner.nextLine();

            while (!continuar.equals("s") && !continuar.equals("n")){
                System.out.println("Introdusca una opción válida s|n");
                continuar = scanner.nextLine();
            }
            System.out.println();
        }
        System.out.println("Que tenga un buen día");
    }
}
