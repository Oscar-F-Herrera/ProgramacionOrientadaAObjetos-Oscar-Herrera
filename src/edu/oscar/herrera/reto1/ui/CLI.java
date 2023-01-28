package edu.oscar.herrera.reto1.ui;

import edu.oscar.herrera.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {

    /**
     * Muestra un Menú que indica al usuario que datos introducir y después los transfiere a la clase calculadora
     */

    public static void mostrarMenu(){

        System.out.println("Elige una opción");
        System.out.println("1 para sumar");
        System.out.println("2 para restar");
        System.out.println("3 para multiplicar");
        System.out.println("4 para dividir");
        System.out.println("5 para obtener el residuo de una división");

        Scanner scanner = new Scanner(System.in);

        int op = scanner.nextInt(); scanner.nextLine();

        while (op < 1 || op > 5){
            System.out.println("Introdusca una opción válida");
            op = scanner.nextInt(); scanner.nextLine();
        }

        System.out.println("Introduce el primer valor");
        int num1 = scanner.nextInt(); scanner.nextLine();
        System.out.println("Introduce el segundo valor");
        int num2 = scanner.nextInt(); scanner.nextLine();

        int resultado = 0;
        String operacion = "";

        switch (op){
            case 1:
                resultado = Calculadora.sumarNumeros(num1, num2);
                operacion = "+";
                break;
            case 2:
                resultado =Calculadora.restarNumeros(num1, num2);
                operacion = "-";
                break;
            case 3:
                resultado = Calculadora.multiplicarNumeros(num1, num2);
                operacion = "*";
                break;
            case 4:
                resultado = Calculadora.dividirNumeros(num1, num2);
                operacion = "/";
                break;
            case 5:
                resultado = Calculadora.residuo(num1, num2);
                operacion = "%";
                break;
        }

        System.out.printf("La operación queda de la siguiente manera: %d %s %d = %d", num1, operacion, num2, resultado);
    }
}

