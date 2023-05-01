package edu.oscar.herrera.reto12.process;

import edu.oscar.herrera.reto12.ui.Interviewer;

/**
 *  * Esta es la clase base de los objetos de tipo HR, hereda de la clase empleado e implementa la interfaz interviewer
 */
public class HR extends Empleado implements Interviewer {

    //Atributos
    private int numeroDeEmpleadosContratados;

    /**
     * Este es el constructor default del objeto HR
     */
    public HR() {
    }

    /**
     * Este es el constructor completo del objeto HR
     * @param numeroDeEmpleadosContratados El número de empleados que ha contratado recursos humanos
     */
    public HR(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int numeroDeEmpleadosContratados) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial);
        this.numeroDeEmpleadosContratados = numeroDeEmpleadosContratados;
    }

    /**
     * Muestra la forma en la que trabaja el HR
     */
    @Override
    public void trabajar(){
        System.out.println("Hace cosas de recursos humanos");
    }

    /**
     * Muestra la forma de entrevistar del HR
     */
    @Override
    public void interview() {
        System.out.println("Te pregunta sobre tus objetivos");
    }



    //Getters y Setters
    public int getNumeroDeEmpleadosContratados() {
        return numeroDeEmpleadosContratados;
    }

    public void setNumeroDeEmpleadosContratados(int numeroDeEmpleadosContratados) {
        this.numeroDeEmpleadosContratados = numeroDeEmpleadosContratados;
    }
}
