package edu.oscar.herrera.reto12.process;

import edu.oscar.herrera.reto12.ui.Interviewer;

/**
 * Esta es la clase base de los objetos de tipo SrEngineer, hereda de la clase JrEngineer e implementa la interfaz interviewer
 */
public class SrEnginner extends JrEngineer implements Interviewer {

    //Atributos
    private int tiempoEnLaEmpresa;

    /**
     * Este es constructor default del objeto SrEngineer
     */
    public SrEnginner() {
    }

    /**
     * Este es el constructor completo del SrEngineer, que hereda variables de la clase JrEngineer
     * @param tiempoEnLaEmpresa La cantidad de años que el ingeniero tiene en la empresa
     * @param rFC el RFC del ingeniero
     */

    public SrEnginner(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, String lenguajesConocidos, String rFC, int tiempoEnLaEmpresa) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial, lenguajesConocidos, rFC);
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    /**
     * Método que muestra la manera de trabajar del SrEngineer
     */
    @Override
    public void trabajar(){
        System.out.println("Trabaja relajado");
    }

    /**
     * Método que muestra la manera de programar del SrEngineer
     */
    @Override
    public void programar() {
        System.out.println("Programa como quiere");
    }

    /**
     * Método que muestra la manera de entrevistar del SrEngineer
     */
    @Override
    public void interview() {
        System.out.println("Te pide que le soluciones un problema de polimorfismo");
    }



    //Getters y Setters
    public int getTiempoEnLaEmpresa() {
        return tiempoEnLaEmpresa;
    }

    public void setTiempoEnLaEmpresa(int tiempoEnLaEmpresa) {
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }
}
