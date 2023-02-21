package edu.oscar.herrera.reto4.process;

import java.util.ArrayList;

/**
 * En esta clase se realizan los métodos para obtener los mejores trimestres ya sea por sabor de café o en general
 *
 * @author Oscar Herrera
 */
public class ReporteVentas {

    /**
     * Este método calcula el trimestre que más vendió por cada sabor de café
     *
     * @param tabla La tabla de ventas proveniente del CLI
     *
     * @return Regresa los trimestres con más ventas por sabor
     */
    public static ArrayList<Integer> calcularMejorTrimestrePorSabor(int [][] tabla){

        ArrayList<Integer> trimestrePorSabor = new ArrayList<>();

        int index = 0;

        for (int i = 0; i < tabla.length; i++) {

            int max = 0;

            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j] > max){
                    index = j;
                    max = tabla[i][j];
                }
            }
            trimestrePorSabor.add(index);
        }
        return trimestrePorSabor;
    }

    /**
     * Este método calcula cual es el trimestre que vendió más cafés
     *
     * @param tabla La tabla de ventas proveniente del CLI
     *
     * @return Regresa el trimestre que vendió más cafés
     */
    public static int calcularMejorTrimestreEnVentas(int[][] tabla) {

        int index = 0;
        int mejorTrimestre = 0;

        for (int i = 0; i < tabla.length; i++) {

            int suma = 0;

            for (int j = 0; j < tabla.length; j++){
                suma += tabla[j][i];
            }

            if (suma > mejorTrimestre){
                mejorTrimestre = suma;
                index = i;
            }
        }
        return index;
    }
}
