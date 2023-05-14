package edu.oscar.herrera.retoFinal.process;

/**
 * Esta es la clase base para el objeto del jugador que hereda atributos y métodos de la clase Personaje
 * @author Oscar Herrera
 */
public class Jugador extends Personaje{
    public int nivel;
    public int oro;
    public int materiales;
    public int hadasRescatadas;
    public int hadasConCasa;
    public int hadasParaSigNivel;
    public int casasConstruidas;

    /**
     * Este es el constructor del objeto del jugador
     * @param nivel El nivel actual del jugador
     * @param oro La cantidad de oro que posee el jugador
     * @param materiales La cantidad de materiales que posee el jugador
     * @param hadasRescatadas La cantidad de hadas que ha rescatado el jugador
     * @param hadasConCasa La cantidad de hadas que tienen casa
     * @param hadasParaSigNivel La cantidad de hadas que faltan para que el jugador suba de nivel
     * @param casasConstruidas La cantidad de casas que el jugador ha construido
     */
    public Jugador(String nombre, int vida, int vidaActual, int nivelDeAtaque, int nivelDeDefensa,
                   int nivel, int oro, int materiales, int hadasRescatadas, int hadasConCasa,
                   int hadasParaSigNivel, int casasConstruidas) {
        super(nombre, vida, vidaActual, nivelDeAtaque, nivelDeDefensa);
        this.nivel = nivel;
        this.oro = oro;
        this.materiales = materiales;
        this.hadasRescatadas = hadasRescatadas;
        this.hadasConCasa = hadasConCasa;
        this.hadasParaSigNivel = hadasParaSigNivel;
        this.casasConstruidas = casasConstruidas;
    }

    /**
     * Método mediante el cual el jugador ataca a los enemigos
     * @param enemigo El enemigo a atacar
     */
    @Override
    public void atacar(Personaje enemigo) {

        System.out.println("Atacas al " + enemigo.nombre);
        if (this.nivelDeAtaque > enemigo.nivelDeDefensa){
            enemigo.vidaActual -= (this.nivelDeAtaque - enemigo.nivelDeDefensa);
            System.out.println("Haces " + (this.nivelDeAtaque - enemigo.nivelDeDefensa) + " de daño");
        } else {
            enemigo.vidaActual--;
            System.out.println("Haces 1 de daño");
        }
    }
}
