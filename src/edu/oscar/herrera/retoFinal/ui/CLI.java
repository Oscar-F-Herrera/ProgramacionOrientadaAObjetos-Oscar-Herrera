package edu.oscar.herrera.retoFinal.ui;

import edu.oscar.herrera.retoFinal.process.Enemigo;
import edu.oscar.herrera.retoFinal.process.Jugador;
import edu.oscar.herrera.retoFinal.process.LogicaDelJuego;

import java.util.Scanner;

/**
 * Esta clase muestra todo el juego en la consola
 * @author Oscar Herrera
 */
public class CLI {

    //Variables globales
    static Scanner scanner = new Scanner(System.in);
    static Jugador jugador = new Jugador("",20,20,1,1,0,0,
            0,0,0,10,0);
    static boolean terminarJuego = false;
    static byte input = 0;
    static byte eleccionEnemigo;



    //Juego

    /**
     * Este método es la base en donde se ejecutan los demás métodos
     */
    public static void jugar(){
        menuDeInicio();
        do {
            menuPrincipal();
        }while (!terminarJuego);
        scanner.close();
    }



    //Partes del juego

    /**
     * Este método imprime el menú al inicio del juego
     */
    public static void menuDeInicio(){
        imprimirTitulo("Bienvenido\n" + "Elige una opción:");
        byte seleccion = obtenerSeleccion("1) Jugar \n" + "2) Salir",(byte) 2);

        if (seleccion == 1){
            limpiarConsola();
            Historia.introduccion();
            jugador.nombre = introducirNombre();
        } else {
            scanner.close();
            System.exit(0);
        }
    }

    /**
     * Este método imprime el menú principal
     */
    public static void menuPrincipal(){
        limpiarConsola();
        imprimirTitulo("Menú");
        System.out.println("Toma una decisión");
        input = obtenerSeleccion("1) Explorar el pueblo\n" + "2) Explorar el bosque\n"
                + "3) Construir casas\n" + "4) Enfrentar al Mago\n" + "5) Ver estadísticas\n"
                + "6) Salir del juego",(byte)6);
        switch (input) {
            case 1:
                explorarElPueblo();
                break;
            case 2:
                explorarElBosque();
                break;
            case 3:
                construirCasas();
                break;
            case 4:
                pelearContraElMago();
                break;
            case 5:
                verEstadisticas();
                break;
            default:
                System.out.println("Saliendo del juego...");
                terminarJuego = true;
                break;
        }
    }

    /**
     * Este método imprime el menú del pueblo
     */
    public static void explorarElPueblo(){
        boolean enElPueblo = true;

        do {
            limpiarConsola();
            imprimirTitulo("Explorar el Pueblo");
            System.out.println("Toma una decisión");
            input = obtenerSeleccion("1) Tienda\n" + "2) Cazarrecompensas\n" + "3) Regresar",(byte)3);
            switch (input) {
                case 1:
                    menuTienda();
                    break;
                case 2:
                    menuCazarrecompensas();
                    break;
                default:
                    System.out.println("Saliendo del pueblo...");
                    introduzcaParaContinuar();
                    enElPueblo = false;
                    break;
            }
        }while (enElPueblo);
    }

    /**
     * Este método imprime el menú del bosque
     */
    public static void explorarElBosque(){
        boolean buscando = true;

        do {
            limpiarConsola();
            imprimirTitulo("Bosque");
            System.out.println("Enfrentate a ogros para liberar hadas");
            System.out.println("Elige una dificultad");
            input = obtenerSeleccion("1) Facil\n" + "2) Normal\n" + "3) Dificil\n"
                    + "4) Regresar",(byte)4);
            switch (input){
                case 1:
                    Enemigo facil = new Enemigo("Ogro",5 + jugador.nivel,
                            5 + jugador.nivel,1 + jugador.nivel, 2 + jugador.nivel);
                    LogicaDelJuego.pelear(jugador, facil);
                    if (jugador.vidaActual <= 0){
                        System.out.println("Lastima... Intentalo otra vez con más fuerza");
                        jugador.vidaActual = jugador.vida;
                        introduzcaParaContinuar();
                    } else if (facil.vidaActual <= 0){
                        limpiarConsola();
                        System.out.println("Derrotaste al ogro, liberaste 1 hada");
                        jugador.hadasRescatadas++;
                        introduzcaParaContinuar();
                    } else {
                        introduzcaParaContinuar();
                    }
                    break;
                case 2:
                    Enemigo normal = new Enemigo("Ogro",10 + jugador.nivel,
                            10 + jugador.nivel,2 + jugador.nivel, 4 + jugador.nivel);
                    LogicaDelJuego.pelear(jugador, normal);
                    if (jugador.vidaActual <= 0){
                        System.out.println("Lastima... Intentalo otra vez con más fuerza");
                        jugador.vidaActual = jugador.vida;
                    } else if (normal.vidaActual <= 0){
                        limpiarConsola();
                        System.out.println("Derrotaste al Ogro, liberaste 2 hadas");
                        jugador.hadasRescatadas += 2;
                        introduzcaParaContinuar();
                    } else {
                        introduzcaParaContinuar();
                    }
                case 3:
                    Enemigo dificil = new Enemigo("Ogro",15 + jugador.nivel,
                            15 + jugador.nivel,3 + jugador.nivel, 6 + jugador.nivel);
                    LogicaDelJuego.pelear(jugador, dificil);
                    if (jugador.vidaActual <= 0){
                        System.out.println("Lastima... Intentalo otra vez con más fuerza");
                        jugador.vidaActual = jugador.vida;
                    } else if (dificil.vidaActual <= 0){
                        limpiarConsola();
                        System.out.println("Derrotaste al ogro, liberaste 3 hadas");
                        jugador.hadasRescatadas += 3;
                        introduzcaParaContinuar();
                    } else {
                        introduzcaParaContinuar();
                    }
                    break;
                default:
                    System.out.println("Volviendo al menú...");
                    buscando = false;
                    introduzcaParaContinuar();
            }
        }while (buscando);
    }

    /**
     * Este método imprime el menú de construcción
     */
    public static void construirCasas(){
        boolean construyendo = true;

        do {
            limpiarConsola();
            imprimirTitulo("Construir casas");
            System.out.println("Tienes " + jugador.materiales + " materiales");
            System.out.println("Hay " + jugador.hadasRescatadas + " hadas rescatadas");
            System.out.println("Hay " + (jugador.hadasRescatadas - jugador.hadasConCasa) + " hadas sin casa");
            System.out.println("Tienes " + jugador.casasConstruidas + " casas construidas");
            System.out.println("Tienes " + (jugador.casasConstruidas - jugador.hadasConCasa) + " casas disponibles");
            System.out.println("Toma una decisión:");
            input = obtenerSeleccion("1) Construir una casa\n" + "2) Alojar a un hada\n"
                    + "3) Regresar",(byte)3);
            switch (input) {
                case 1:
                    crearCasa();
                    break;
                case 2:
                    alojarHada();
                    break;
                default:
                    System.out.println("Volviendo al menú...");
                    introduzcaParaContinuar();
                    construyendo = false;
                    break;
            }
        }while (construyendo);
    }

    /**
     * Este método imprime el menú de la batalla final
     */
    public static void pelearContraElMago(){
        limpiarConsola();
        imprimirTitulo("Enfrentase al mago");
        System.out.println("El destino te está llamando, el mago nivel 80 te espera");
        System.out.println("¿Quieres continuar?");
        input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);
        if (input == 1) {
            Enemigo mago = new Enemigo("Mago",100,100,35,35);
            LogicaDelJuego.pelear(jugador, mago);
            if (jugador.vidaActual <= 0){
                System.out.println("Lastima... Intentalo otra vez con más fuerza");
                jugador.vidaActual = jugador.vida;
                introduzcaParaContinuar();
            } else {
                limpiarConsola();
                Historia.finalDelJuego();
                terminarJuego = true;
            }
        } else {
            System.out.println("Volviendo al menú...");
            introduzcaParaContinuar();
        }
    }

    /**
     * Esté método imprime las estadísticas del jugador
     */
    public static void verEstadisticas(){
        limpiarConsola();
        imprimirTitulo("Estadísticas");
        System.out.println("Nombre: " + jugador.nombre);
        System.out.println("Nivel: " + jugador.nivel);
        System.out.println("Vida: " + jugador.vidaActual + "/" + jugador.vida);
        System.out.println("Oro: " + jugador.oro);
        System.out.println("Nivel de ataque: " + jugador.nivelDeAtaque);
        System.out.println("Nivel de defensa: " + jugador.nivelDeDefensa);
        System.out.println("Materiales: " + jugador.materiales);
        System.out.println("Hadas rescatadas: " + jugador.hadasRescatadas);
        System.out.println("Hadas con casa: " + jugador.hadasConCasa);
        System.out.println("Casas construidas: " + jugador.casasConstruidas);
        introduzcaParaContinuar();
    }



    //Menú Cazarrecompensas

    /**
     * Este método imprime el menú del modo cazarrecompensas
     */
    public static void menuCazarrecompensas(){
        boolean buscando = true;

        do {
            limpiarConsola();
            imprimirTitulo("Cazarrecompensas");
            System.out.println("Enfrentate a bandidos por oro");
            System.out.println("Elige una dificultad");
            input = obtenerSeleccion("1) Facil\n" + "2) Normal\n" + "3) Dificil\n"
                    + "4) Regresar",(byte)4);
            switch (input){
                case 1:
                    Enemigo facil = new Enemigo("Bandido",5 + jugador.nivel,
                            5 + jugador.nivel,1 + jugador.nivel, 2 + jugador.nivel);
                    LogicaDelJuego.pelear(jugador, facil);
                    if (jugador.vidaActual <= 0){
                        System.out.println("Lastima... Intentalo otra vez con más fuerza");
                        jugador.vidaActual = jugador.vida;
                        introduzcaParaContinuar();
                    } else if (facil.vidaActual <= 0){
                        limpiarConsola();
                        System.out.println("Derrotaste al bandido, ganaste 3 oro");
                        jugador.oro += 3;
                        introduzcaParaContinuar();
                    } else {
                        introduzcaParaContinuar();
                    }
                    break;
                case 2:
                    Enemigo normal = new Enemigo("Bandido",10 + jugador.nivel,
                            10 + jugador.nivel,2 + jugador.nivel, 4 + jugador.nivel);
                    LogicaDelJuego.pelear(jugador, normal);
                    if (jugador.vidaActual <= 0){
                        System.out.println("Lastima... Intentalo otra vez con más fuerza");
                        jugador.vidaActual = jugador.vida;
                        introduzcaParaContinuar();
                    } else if (normal.vidaActual <= 0){
                        limpiarConsola();
                        System.out.println("Derrotaste al bandido, ganaste 6 oro");
                        jugador.oro += 6;
                        introduzcaParaContinuar();
                    } else {
                        introduzcaParaContinuar();
                    }
                case 3:
                    Enemigo dificil = new Enemigo("Bandido",15 + jugador.nivel,
                            15 + jugador.nivel,3 + jugador.nivel, 6 + jugador.nivel);
                    LogicaDelJuego.pelear(jugador, dificil);
                    if (jugador.vidaActual <= 0){
                        System.out.println("Lastima... Intentalo otra vez con más fuerza");
                        jugador.vidaActual = jugador.vida;
                        introduzcaParaContinuar();
                    } else if (dificil.vidaActual <= 0){
                        limpiarConsola();
                        System.out.println("Derrotaste al bandido, ganaste 10 oro");
                        jugador.oro += 10;
                        introduzcaParaContinuar();
                    } else {
                        introduzcaParaContinuar();
                    }
                    break;
                default:
                    System.out.println("Volviendo al menú...");
                    buscando = false;
                    introduzcaParaContinuar();
            }
        }while (buscando);
    }



    //Menús de la tienda

    /**
     * Este método imprime el menú de la tienda
     */
    public static void menuTienda(){
        boolean comprando = true;

        do {
            limpiarConsola();
            imprimirTitulo("Tienda");
            System.out.println("Tienes " + jugador.oro + " oro");
            System.out.println("¿Qué deseas comprar?");
            input = obtenerSeleccion("1) Materiales (+1) Costo: 1 oro\n"
                    + "2) Poción de vida (Recuperas 3 puntos) Costo: 3 oro\n"
                    + "3) Aumento de Ataque (+1) Costo: 2 oro\n"
                    + "4) Aumento de Defensa (+1) Costo: 2 oro\n"
                    + "5) Regresar",(byte)5);

            switch (input){
                case 1:
                    comprarMateriales();
                    break;
                case 2:
                    comprarVida();
                    break;
                case 3:
                    comprarAtaque();
                    break;
                case 4:
                    comprarDefensa();
                    break;
                default:
                    System.out.println("Volviendo al menú del pueblo...");
                    introduzcaParaContinuar();
                    comprando = false;
                    break;
            }
        } while (comprando);
    }

    /**
     * Este método imprime el menú para comprar materiales
     */
    public static void comprarMateriales(){
        boolean comprandoMateriales = true;

        do {
            limpiarConsola();
            imprimirTitulo("Comprando materiales");
            System.out.println("Tienes " + jugador.materiales + " materiales");
            System.out.println("Tienes " + jugador.oro + " oro");
            System.out.println("¿Deseas comprar 1 material por 1 oro?");
            input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);

            if (input == 1) {
                if (jugador.oro > 0){
                    jugador.materiales++;
                    System.out.println("Has comprado 1 material");
                    jugador.oro--;
                    System.out.println("Oro restante: " + jugador.oro);
                    introduzcaParaContinuar();
                } else {
                    System.out.println("No tienes suficiente oro");
                    introduzcaParaContinuar();
                }
            } else {
                System.out.println("Volviendo al menú de la tienda...");
                introduzcaParaContinuar();
                comprandoMateriales = false;
            }
        } while (comprandoMateriales);
    }

    /**
     * Este método imprime el menú para comprar pociones de vida
     */
    public static void comprarVida(){
        boolean comprandoVida = true;

        do {
            limpiarConsola();
            imprimirTitulo("Recuperar vida");
            System.out.println("Tienes " + jugador.vidaActual + "/" + jugador.vida + " puntos de vida");
            System.out.println("Tienes " + jugador.oro + " oro");
            System.out.println("¿Deseas recuperar 3 puntos de vida por 3 oro?");
            input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);

            if (input == 1) {
                if (jugador.oro > 2 && jugador.vidaActual < jugador.vida){
                    jugador.vidaActual += 3;
                    if (jugador.vidaActual > jugador.vida){
                        jugador.vidaActual = jugador.vida;
                    }
                    System.out.println("Has recuperado vida");
                    jugador.oro -= 3;
                    System.out.println("Oro restante: " + jugador.oro);
                    introduzcaParaContinuar();
                } else {
                    System.out.println("No tienes suficiente oro o tu vida está al máximo");
                    introduzcaParaContinuar();
                }
            } else {
                System.out.println("Volviendo al menú de la tienda...");
                introduzcaParaContinuar();
                comprandoVida = false;
            }
        } while (comprandoVida);
    }

    /**
     * Este método imprime el menú para comprar aumentos de ataque
     */
    public static void comprarAtaque(){
        boolean aumentandoAtaque = true;

        do {
            limpiarConsola();
            imprimirTitulo("Aumentar ataque");
            System.out.println("Tu nivel de ataque actual es: " + jugador.nivelDeAtaque);
            System.out.println("Tienes " + jugador.oro + " oro");
            System.out.println("¿Deseas aumentar tu nivel de ataque en 1 por 2 oro?");
            input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);

            if (input == 1) {
                if (jugador.oro > 1){
                    jugador.nivelDeAtaque ++;
                    System.out.println("Has aumentado tu ataque");
                    jugador.oro -= 2;
                    System.out.println("Oro restante: " + jugador.oro);
                    introduzcaParaContinuar();
                } else {
                    System.out.println("No tienes suficiente oro");
                    introduzcaParaContinuar();
                }
            } else {
                System.out.println("Volviendo al menú de la tienda...");
                introduzcaParaContinuar();
                aumentandoAtaque = false;
            }
        } while (aumentandoAtaque);
    }

    /**
     * Este método imprime el menú para comprar aumentos de defensa
     */
    public static void comprarDefensa(){
        boolean aumentandoDefensa = true;

        do {
            limpiarConsola();
            imprimirTitulo("Aumentar defensa");
            System.out.println("Tu nivel de defensa actual es: " + jugador.nivelDeDefensa);
            System.out.println("Tienes " + jugador.oro + " oro");
            System.out.println("¿Deseas aumentar tu nivel de defensa en 1 por 2 oro?");
            input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);

            if (input == 1) {
                if (jugador.oro > 1){
                    jugador.nivelDeDefensa ++;
                    System.out.println("Has aumentado tu defensa");
                    jugador.oro -= 2;
                    System.out.println("Oro restante: " + jugador.oro);
                    introduzcaParaContinuar();
                } else {
                    System.out.println("No tienes suficiente oro");
                    introduzcaParaContinuar();
                }
            } else {
                System.out.println("Volviendo al menú de la tienda...");
                introduzcaParaContinuar();
                aumentandoDefensa = false;
            }
        } while (aumentandoDefensa);
    }





    //Menús de construcción

    /**
     * Este método imprime el menú para construir casas
     */
    public static void crearCasa(){
        boolean construyendo = true;

        do {
            limpiarConsola();
            imprimirTitulo("Crear casa");
            System.out.println("Tienes " + jugador.casasConstruidas + " casas construidas");
            System.out.println("Tienes " + jugador.materiales + " materiales");
            System.out.println("Cada casa cuesta 2 materiales");
            System.out.println("¿Deseas construir una casa?");
            input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);

            if (input == 1) {
                if (jugador.materiales >= 2){
                    System.out.println("\nHas construido una casa");
                    jugador.casasConstruidas++;
                    jugador.materiales -= 2;
                    introduzcaParaContinuar();
                } else {
                    System.out.println("\nNo tienes suficientes materiales");
                    introduzcaParaContinuar();
                }
            } else {
                System.out.println("Volviendo al menú de construcción...");
                introduzcaParaContinuar();
                construyendo = false;
            }
        } while (construyendo);
    }

    /**
     * Este método imprime el menú para alojar hadas
     */
    public static void alojarHada(){
        boolean alojando = true;

        do {
            limpiarConsola();
            imprimirTitulo("Alojar hada");
            System.out.println("Hay " + jugador.hadasConCasa + " hadas con casa");
            System.out.println("Hay " + (jugador.hadasRescatadas - jugador.hadasConCasa) + " hadas sin casa");
            System.out.println("Hay " + (jugador.casasConstruidas - jugador.hadasConCasa) + " casas disponibles");
            System.out.println("¿Deseas alojar a un hada?");
            input = obtenerSeleccion("1) Si\n" + "2) No",(byte)2);

            if (input == 1) {
                if ((jugador.hadasRescatadas - jugador.hadasConCasa) > 0
                        && (jugador.casasConstruidas - jugador.hadasConCasa) > 0){
                    System.out.println("\nHas alojado a un hada");
                    jugador.hadasConCasa++;
                    jugador.hadasParaSigNivel--;
                    if (jugador.hadasParaSigNivel == 0){
                        System.out.println("¡Has alojado 10 hadas, subes un nivel!");
                        jugador.nivel++;
                        jugador.vida++;
                        jugador.vidaActual++;
                        jugador.hadasParaSigNivel = 10;
                    }
                    introduzcaParaContinuar();
                } else {
                    System.out.println("\nNo tienes hadas que alojar o todas tus casas están ocupadas");
                    introduzcaParaContinuar();
                }
            } else {
                System.out.println("Volviendo al menú de construcción...");
                introduzcaParaContinuar();
                alojando = false;
            }
        } while (alojando);
    }





    //Métodos personalizados

    /**
     * Este método ter permite ingresar un nombre para el jugador
     * @return Regresa el nombre seleccionado
     */
    public static String introducirNombre(){
        String nombre;
        byte confirmar;

        do {
            System.out.println("Introduce su nombre: ");
            nombre = scanner.next();
            System.out.println("¿Su nombre es " + nombre + "?");
            confirmar = obtenerSeleccion("1) Si \n" + "2) No",(byte) 2);
        }while (confirmar != 1);
        return nombre;
    }

    /**
     * Este método simula el limpiar la consola
     */
    public static void limpiarConsola(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    /**
     * Este método ayuda a seleccionar entre varias opciones
     * @param instruccion Las opciones disponibles
     * @param numeroDeOpciones El número de opciones disponibles
     * @return Regresa la opción seleccionada
     */
    public static byte obtenerSeleccion(String instruccion, byte numeroDeOpciones){
        byte opcion;

        do {
            System.out.println(instruccion);
            try {
                opcion = Byte.parseByte(scanner.next());
            } catch (Exception e){
                opcion = -1;
                System.out.println("Introdusca un número válido");
            }
        } while (opcion < 1 || opcion > numeroDeOpciones);
        return opcion;
    }

    /**
     * Imprime un separador de texto
     */
    public static void imprimirSeparador(){
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Imprime un texto entre separadores
     * @param titulo El título a imprimir
     */
    public static void imprimirTitulo(String titulo){
        imprimirSeparador();
        System.out.println(titulo);
        imprimirSeparador();
    }

    /**
     * Detiene el proceso hasta que el usuario ingrese algo
     */
    public static void introduzcaParaContinuar(){
        System.out.println("Introduzca cualquier dígito para continuar...");
        scanner.next();
    }

    /**
     * Imprime el menú para el turno del jugador
     * @param enemigo El enemigo a atacar
     * @return Regresa la elección de atacar o huir
     */
    public static byte menuDeAtaque(Enemigo enemigo){
        limpiarConsola();
        imprimirTitulo("Tu turno");
        System.out.println("Tu vida: " + jugador.vidaActual + "/" + jugador.vida);
        System.out.println("Vida del " + enemigo.nombre + ": " + enemigo.vidaActual + "/" + enemigo.vida);
        input = obtenerSeleccion("1) Atacar\n" + "2) Huir",(byte)2);
        return input;
    }

    /**
     * Imprime el menú para que el jugador se defienda
     * @param enemigo El enemigo a atacar
     * @return Regresa la elección de atacar o huir
     */
    public static byte menuDeDefensa(Enemigo enemigo){
        limpiarConsola();
        imprimirTitulo("Turno del enemigo");
        eleccionEnemigo = enemigo.avisar();
        System.out.println("Tu vida: " + jugador.vidaActual + "/" + jugador.vida);
        System.out.println("Vida del " + enemigo.nombre + ": " + enemigo.vidaActual + "/" + enemigo.vida);
        System.out.println("¿Cómo te vas a defender?");
        input = obtenerSeleccion("1) Protegerse\n" + "2) Saltar\n" + "3) Agacharse",(byte)3);
        return input;
    }
}
