package edu.oscar.herrera.reto9.pelota.process;

/**
 * Esta clase es la base para crear objetos de tipo pelota
 */
public class Pelota {
    public String color;
    private int rapidez;
    private int poder;

    /**
     * Este es el constructor de los objetos de tipo pelota
     * @param color El color de la pelota
     * @param rapidez La rapidez de la pelota
     * @param poder El poder de la pelota
     */
    public Pelota(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    /**
     * Este método disminuye en 1 la rapidez de la pelota
     */
    public void disminuirRapidez(){
        this.rapidez -= 1;
    }

    /**
     * Este método aumenta en 1 el poder de la pelota
     */
    public void aumentarPoder(){
        this.poder += 1;
    }

    /**
     * Este método obtiene la rapidez de la pelota
     * @return Regresa la rapidez de la pelota
     */
    public int getRapidez() {
        return rapidez;
    }

    /**
     * Este método obtiene el poder de la pelota
     * @return Regresa el poder de la pelota
     */
    public int getPoder() {
        return poder;
    }
}
