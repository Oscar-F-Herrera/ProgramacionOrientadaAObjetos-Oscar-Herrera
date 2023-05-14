package edu.oscar.herrera.retoFinal.process;

import edu.oscar.herrera.retoFinal.ui.CLI;

import java.util.Objects;

/**
 * En esta clase se llevan a cabo los procesos lógicos del juego
 * @author Oscar Herrera
 */
public class LogicaDelJuego {
    /**
     * Este método ejecuta las peleas entre el jugador y los enemigos
     * @param jugador El jugador
     * @param enemigo El enemigo
     */
    public static void pelear(Jugador jugador, Enemigo enemigo){
        byte desicion;

        do {
            desicion = CLI.menuDeAtaque(enemigo);
            if (desicion == 1){
                jugador.atacar(enemigo);
                CLI.introduzcaParaContinuar();
            } else{
                if (!Objects.equals(enemigo.nombre, "Mago")){
                    System.out.println("Huyes exitosamente");
                    break;
                } else {
                    System.out.println("¡No puedes huir de tu destino!");
                    CLI.introduzcaParaContinuar();
                }
            }
            if (enemigo.vidaActual <= 0){
                break;
            }

            desicion = CLI.menuDeDefensa(enemigo);
            switch (desicion) {
                case 1:
                    enemigo.atacarCubierto(jugador);
                    CLI.introduzcaParaContinuar();
                    break;
                case 2:
                    if (enemigo.decision == 0){
                        enemigo.atacar(jugador);
                        CLI.introduzcaParaContinuar();
                    } else {
                        System.out.println("Al esquivar el ataque con exito no recibes daño");
                        CLI.introduzcaParaContinuar();
                    }
                    break;
                default:
                    if (enemigo.decision == 1){
                        enemigo.atacar(jugador);
                        CLI.introduzcaParaContinuar();
                    } else {
                        System.out.println("Al esquivar el ataque con exito no recibes daño");
                        CLI.introduzcaParaContinuar();
                    }
                    break;
            }
        } while (jugador.vidaActual > 0 && enemigo.vidaActual > 0);
    }
}
