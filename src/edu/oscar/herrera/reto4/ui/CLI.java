package edu.oscar.herrera.reto4.ui;

import edu.oscar.herrera.reto4.process.ReporteVentas;
import java.util.ArrayList;

/**
 * En esta clase se encuentran los datos de la tabla y el método para mostrar los resultados
 *
 * @author Oscar Herrera
 */
public class CLI {
    static String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
    static String[] trimestres = {"Enero-Marzo", "Abril-Junio", "Julio-Septiembre", "Octubre-Diciembre"};

    static int[][] tabla = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

    /**
     * Envia la tabla a los métodos de la clase ReporteVentas e imprime los resultados
     */
    public static void mostrarResultados(){

        for (int i = 0; i < sabores.length; i++) {
            ArrayList<Integer> trimestrePorSabor = ReporteVentas.calcularMejorTrimestrePorSabor(tabla);
            System.out.println("El mejor trimestre para " + sabores[i] + " fue: " + trimestres[trimestrePorSabor.get(i)]);
        }

        System.out.println();

        System.out.println("El trimestre que más vendió fue: " +
                trimestres[ReporteVentas.calcularMejorTrimestreEnVentas(tabla)]);
    }
}
