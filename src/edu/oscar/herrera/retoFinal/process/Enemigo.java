package edu.oscar.herrera.retoFinal.process;

import java.util.Random;

/**
 * Esta es la clase base para los objetos enemigos que heredan atributos y métodos de la clase Personaje
 * @author Oscar Herrera
 */
public class Enemigo extends Personaje{

    byte decision;

    /**
     * Este es el constructor de los objetos de tipo enemigo
     */
    public Enemigo(String nombre, int vida, int vidaActual, int nivelDeAtaque, int nivelDeDefensa) {
        super(nombre, vida, vidaActual, nivelDeAtaque, nivelDeDefensa);
        this.decision = 0;
    }

    /**
     * Método mediante el cual el enemigo ataca al jugador
     * @param jugador Hace referencia al jugador
     */
    @Override
    public void atacar(Personaje jugador) {
        System.out.println("El " + this.nombre + " lanza un ataque");
        if (this.nivelDeAtaque > jugador.nivelDeDefensa) {
            jugador.vidaActual -= (this.nivelDeAtaque - jugador.nivelDeDefensa);
            System.out.println("Recibes " + (this.nivelDeAtaque - jugador.nivelDeDefensa) + " de daño");
        } else {
            jugador.vidaActual--;
            System.out.println("Recibes 1 de daño");
        }
    }

    /**
     * Método mediante el cual el enemigo hace la mitad de daño cuando el jugador se cubre
     * @param jugador Hace referencia al jugador
     */
    public void atacarCubierto(Personaje jugador){
        System.out.println("El " + this.nombre + " lanza un ataque");
        if ((this.nivelDeAtaque - jugador.nivelDeDefensa) / 2 > 0) {
            jugador.vidaActual -= ((this.nivelDeAtaque - jugador.nivelDeDefensa) / 2);
            System.out.println("Recibes " + ((this.nivelDeAtaque - jugador.nivelDeDefensa) / 2) + " de daño");
        } else {
            jugador.vidaActual--;
            System.out.println("Recibes 1 de daño");
        }
    }

    /**
     * Método mediante el cual el enemigo le avisa al jugador sobre su siguiente ataque
     * @return Regresa la decision del enemigo
     */
    public byte avisar(){
        Random random = new Random();
        this.decision = (byte) random.nextInt(0,2);
        if (decision == 0){
            System.out.println("Aire");
        } else {
            System.out.println("Tierra");
        }
        return decision;
    }
}
