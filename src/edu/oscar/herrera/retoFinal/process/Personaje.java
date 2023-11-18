package edu.oscar.herrera.retoFinal.process;

/**
 * Esta es la clase base para la creación de personajes
 * @author Oscar Herrera
 */
public abstract class Personaje {
    public String nombre;
    public int vida;
    public int vidaActual;
    public int nivelDeAtaque;
    public int nivelDeDefensa;

    /**
     * Este es el constructor del personaje
     * @param nombre El nombre del personaje
     * @param vida La vida del personaje
     * @param vidaActual La vida actual del personaje
     * @param nivelDeAtaque El nivel de ataque del personaje
     * @param nivelDeDefensa El nivel de defensa del personaje
     */
    public Personaje(String nombre, int vida, int vidaActual, int nivelDeAtaque, int nivelDeDefensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaActual = vidaActual;
        this.nivelDeAtaque = nivelDeAtaque;
        this.nivelDeDefensa = nivelDeDefensa;
    }

    /**
     * Método abstracto que será establecido por las clases hijas
     * @param personaje El personaje a atacar
     */
    public abstract void atacar(Personaje personaje);
}