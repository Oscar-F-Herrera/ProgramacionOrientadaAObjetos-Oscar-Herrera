package edu.oscar.herrera.reto1.process;

public class Calculadora {

    /**
     * suma los números
     *
     * @param num1 número a sumar
     * @param num2 número que suma
     * @return regresa la suma de los números
     *
     */

    public static int sumarNumeros(int num1, int num2){
        return num1 + num2;
    }

    /**
     * resta al primer número
     *
     * @param num1 número a restar
     * @param num2 número que resta
     * @return regresa la resta del primer número
     *
     */

    public static int restarNumeros(int num1, int num2){
        return num1 - num2;
    }

    /**
     * multiplica los números
     *
     * @param num1 número a multiplicar
     * @param num2 número que multiplica
     * @return regresa la multiplicación de los números
     *
     */

    public static int multiplicarNumeros(int num1, int num2){
        return num1 * num2;
    }

    /**
     * divide el primer número
     *
     * @param num1 número a dividir
     * @param num2 número que divide
     * @return regresa la división del primer número
     */

    public static int dividirNumeros(int num1, int num2){
        return num1 / num2;
    }

    /**
     * residuo de dividir el primer número
     *
     * @param num1 número a dividir
     * @param num2 número que divide
     * @return regresa el residuo de la división
     */

    public static int residuo(int num1, int num2){
        return num1 % num2;
    }
}
