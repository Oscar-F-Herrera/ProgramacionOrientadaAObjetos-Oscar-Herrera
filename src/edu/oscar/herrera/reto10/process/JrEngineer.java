package edu.oscar.herrera.reto10.process;

import edu.oscar.herrera.reto10.ui.Programmer;

/**
 * Esta es la clase base de los objetos de tipo JrEngineer, hereda de la clase empleado e implementa la interfaz programmer
 */
public class JrEngineer extends Empleado implements Programmer {

    //Atributos
    private String lenguajesConocidos;

    /**
     * Este es constructor default del objeto JrEngineer
     */
    public JrEngineer() {
    }

    /**
     * Este es el constructor completo del JrEngineer, que hereda variables de la clase empleado
     * @param lenguajesConocidos Los nombres de los lenguajes de programación que conoce
     */
    public JrEngineer(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, String lenguajesConocidos) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial);
        this.lenguajesConocidos = lenguajesConocidos;
    }

    /**
     * Método que muestra la forma de trabajar del JrEngineer
     */
    @Override
    public void trabajar(){
        System.out.println("Se estresa buscando soluciones");
    }

    /**
     * Método que muestra la forma de programar del JrEngineer
     */
    @Override
    public void programar() {
        System.out.println("Programa como puede");
    }



    //Getters y Setters
    public String getLenguajesConocidos() {
        return lenguajesConocidos;
    }

    public void setLenguajesConocidos(String lenguajesConocidos) {
        this.lenguajesConocidos = lenguajesConocidos;
    }
}
