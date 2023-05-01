package edu.oscar.herrera.reto12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * En esta clase se ejecutan todos los procesos del reto 12
 */
public class Pruebas {
    /**
     * Este método llama a los otros métodos
     */
    public static void main(String[] args) {
        //Leer el archivo y almacenar en un arraylist
        ArrayList<String> empleados = leerYAlmacenarEmpleados();

        //Imprimir empleados entre 20 y 25
        System.out.println("\n" + "Los empleados cuya edad está entre los 20 y 25 años son:");
        imprimirEntre20Y25(empleados);

        //Imprimir los primeros 10 alfabéticamente
        System.out.println("\n" + "Los primeros 10 empleados en orden alfabético son:");
        imprimirPrimeros10Alfabeticamente(empleados);

        //Imprimir la edad promedio
        System.out.println("\n" + "La edad promedio es de:");
        imprimirEdadPromedio(empleados);

        //Imprime el último empleado primero por orden de edad y luego por orden alfabético
        System.out.println("\n" + "El último empleado es:");
        imprimirUltimoEmpleado(empleados);
    }

    /**
     * Este método lee los datos de un archivo y almacena cada línea en un espacio de la lista
     * @return Regresa un arraylist con cada línea del archivo
     */
    public static ArrayList<String> leerYAlmacenarEmpleados() {
        ArrayList<String> listaDeEmpleados = new ArrayList<>();

        Path filePath = Paths.get("src/edu/oscar/herrera/reto12/ListaReto12");

        try {
            listaDeEmpleados = (ArrayList<String>) Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String empleado : listaDeEmpleados) {
            System.out.println(empleado);
        }
        return listaDeEmpleados;
    }

    /**
     * Este método imprime solo a los empleados cuya edad esté entre los 20 y 25 años
     * @param lista La lista de empleados
     */
    public static void imprimirEntre20Y25(ArrayList<String> lista) {
        lista.stream()
                .filter(string -> {
                    int edad = Integer.parseInt(string.split(";")[2]);
                    return edad >= 20 && edad <= 25;
                })
                .forEach(System.out::println);
    }

    /**
     * Este método imprime solo a los primeros 10 empleados en orden alfabético
     * @param lista La lista de empleados
     */
    public static void imprimirPrimeros10Alfabeticamente(ArrayList<String> lista) {
        lista.stream()
                .sorted(Comparator.comparing(string -> string.split(";")[1]))
                .limit(10)
                .forEach(System.out::println);
    }

    /**
     * Este método imprime la edad promedio de todos los empleados
     * @param lista La lista de empleados
     */
    public static void imprimirEdadPromedio(ArrayList<String> lista){
        double edadPromedio = lista.stream()
                .mapToInt(string -> Integer.parseInt(string.split(";")[2]))
                .average()
                .orElse(0.0);
        System.out.println(edadPromedio + " años");
    }

    /**
     * Este método imprime al último empleado primero por orden de edad y luego por orden alfa
     * @param lista
     */
    public static void imprimirUltimoEmpleado(ArrayList<String> lista){
        String ultimoEmpleado = lista.stream()
                .sorted(Comparator.comparingInt((String edad) -> Integer.parseInt(edad.split(";")[2]))
                        .thenComparing(string -> string.split(";")[1])
                )
                .reduce((first, second) -> second)
                .orElse(null);
        System.out.println(ultimoEmpleado);
    }
}
