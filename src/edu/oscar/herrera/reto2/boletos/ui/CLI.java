package edu.oscar.herrera.reto2.boletos.ui;

import java.util.Scanner;

import edu.oscar.herrera.reto2.boletos.process.CalcularCostos;
public class CLI {
    /**
     * Muestra al usuario un menú en donde primero indica que tipo de boleto desea, después le muestra el costo y finalmente le pregunta si desea otro
     */
    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);

        String tipo;
        String finalizar = "f";

        int bA = 0;
        int bN = 0;
        int bI = 0;
        int bB = 0;

        double precio = 0;

        while (!finalizar.equals("n")) {

            System.out.println("Bienvenido al parque de diversiones. Para comprar un boleto, introdusca el caracter correspondiente");
            System.out.println("\"A\" para adulto, tiene un costo de $100");
            System.out.println("\"N\" para niño, tiene un costo de $70");
            System.out.println("\"I\" si poseé una credencial del INAPAM, tiene un costo de $50");
            System.out.println("\"B\" para adulto mayor sin credencial, tiene un costo de $70");
            System.out.print("Introdusca el tipo de boleto: ");
            tipo = scanner.nextLine();
            System.out.println();

            while (!tipo.equals("A") && !tipo.equals("N") && !tipo.equals("I") && !tipo.equals("B")) {
                System.out.println("Introdusca una opción válida");
                System.out.println("\"A\" para adulto, tiene un costo de $100");
                System.out.println("\"N\" para niño, tiene un costo de $70");
                System.out.println("\"I\" si poseé una credencial del INAPAM, tiene un costo de $50");
                System.out.println("\"B\" para adulto mayor sin credencial, tiene un costo de $70");
                System.out.print("Introdusca el tipo de boleto: ");
                tipo = scanner.nextLine();
                System.out.println();
            }

            CalcularCostos.aumentarCantidad(tipo, bA, bN, bI, bB);

            precio = CalcularCostos.calcularPrecio(tipo, precio);
            System.out.println("El total a pagar es de: $" + precio);

            System.out.println("¿Desea otro boleto? s/n");
            finalizar = scanner.nextLine();

            while (!finalizar.equals("s") && !finalizar.equals("n")){
                System.out.println("Introdusca una opción válida s/n");
                finalizar = scanner.nextLine();
            }
            System.out.println();
        }

        System.out.println("Que tenga un buen día");
    }
}
