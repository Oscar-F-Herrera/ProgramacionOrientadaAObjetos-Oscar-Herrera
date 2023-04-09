package edu.oscar.herrera.reto10.process;

import edu.oscar.herrera.reto10.ui.Interviewer;

/**
 *  * Esta es la clase base de los objetos de tipo Manager, hereda de la clase empleado e implementa la interfaz interviewer
 */
public class Manager extends Empleado implements Interviewer {

    //Atributos
    private int presupuesto;

    /**
     * Este es el constructor default del objeto Manager
     */
    public Manager() {
    }

    /**
     * Este es el constructor completo del objeto Manager
     * @param presupuesto El presupuesto con el que cuenta el Gerente
     */
    public Manager(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int presupuesto) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial);
        this.presupuesto = presupuesto;
    }

    /**
     * Muestra la manera de trabajar del Manager
     */
    @Override
    public void trabajar(){
        System.out.println("Verifica que los empleados hagan su trabajo");
    }

    /**
     * Muestra la forma de entrevistar del Manager
     */
    @Override
    public void interview() {
        System.out.println("Te pregunta de tu vida");
    }



    //Getters y Setters
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
