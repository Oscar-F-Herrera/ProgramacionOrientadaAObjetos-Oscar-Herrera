package edu.oscar.herrera.reto9.ayudantes.process;

import edu.oscar.herrera.reto9.ayudantes.ui.CLI;

import java.util.Random;

/**
 * Esta clase es la base para crear objetos de tipo Ayudante
 */
public class Ayudante {
    private int cantidadDeOjos;
    private String colorDePiel;
    private String altura;
    private int nivelDeCreacion;
    private int nivelDeReparacion;
    private int nivelDeDestruccion;

    /**
     * Este es el constructor de los ayudantes, genera atributos aleatorios
     */
    public Ayudante(){
        this.cantidadDeOjos = random.nextInt(1,3);
        this.colorDePiel = generarPielAleatoria();
        this.altura = generarAlturaAleatoria();
        this.nivelDeCreacion = random.nextInt(1,6);
        this.nivelDeReparacion = random.nextInt(1,6);
        this.nivelDeDestruccion = random.nextInt(1,6);
    }

    Random random = new Random();

    /**
     * Este método elige un color de piel
     * @return Regresa un color de piel aleatorio
     */
    private String generarPielAleatoria(){
        String[] colorDePiel = {"Amarillo", "Morado"};

        return colorDePiel[random.nextInt(0,2)];
    }

    /**
     * Este método elige una altura
     * @return Regresa una altura aleatoria
     */
    private String generarAlturaAleatoria(){
        String[] colorDePiel = {"Mediano", "Alto"};

        return colorDePiel[random.nextInt(0,2)];
    }

    /**
     * Este método se llama a los metodos del CLI para imprimir datos
     */
    public void mostrarDatos(){
        CLI.mostrarCantidadOjos(cantidadDeOjos);
        CLI.mostrarColorDePiel(colorDePiel);
        CLI.mostrarAltura(altura);
        CLI.mostrarNivelDeCreacion(nivelDeCreacion);
        CLI.mostrarNivelDeReparacion(nivelDeReparacion);
        CLI.mostrarNivelDeDestruccion(nivelDeDestruccion);
    }

    public int getNumeroDeOjos() {
        return cantidadDeOjos;
    }

    public void setNumeroDeOjos(int numeroDeOjos) {
        this.cantidadDeOjos = numeroDeOjos;
    }

    public String getColorDePiel() {
        return colorDePiel;
    }

    public void setColorDePiel(String colorDePiel) {
        this.colorDePiel = colorDePiel;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getNivelDeCreacion() {
        return nivelDeCreacion;
    }

    public void setNivelDeCreacion(int nivelDeCreacion) {
        this.nivelDeCreacion = nivelDeCreacion;
    }

    public int getNivelDeReparacion() {
        return nivelDeReparacion;
    }

    public void setNivelDeReparacion(int nivelDeReparacion) {
        this.nivelDeReparacion = nivelDeReparacion;
    }

    public int getNivelDeDestruccion() {
        return nivelDeDestruccion;
    }

    public void setNivelDeDestruccion(int nivelDeDestruccion) {
        this.nivelDeDestruccion = nivelDeDestruccion;
    }
}
