package edu.oscar.herrera.reto12.process;

/**
 *  * Esta es la clase base de los objetos de tipo CEO que heredan de la clase Manager
 */
public class CEO extends Manager {

    //Atributos
    private int tiempoAlMando;

    /**
     * Este es el constructor default del objeto CEO
     */
    public CEO() {
    }

    /**
     * Este es el constructor completo del objeto CEO
     * @param tiempoAlMando El tiempo que lleva la persona en ese puesto
     */
    public CEO(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int presupuesto, int tiempoAlMando) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial, presupuesto);
        this.tiempoAlMando = tiempoAlMando;
    }

    /**
     * Muestra la forma de trabajar del CEO
     */
    @Override
    public void trabajar(){
        System.out.println("Dirige a la empresa");
    }

    /**
     * Muestra la forma de entrevistar del CEO
     */
    @Override
    public void interview() {
        System.out.println("Te pregunta como te ves dentro de la empresa");
    }



    //Getters y Setters
    public int getTiempoAlMando() {
        return tiempoAlMando;
    }

    public void setTiempoAlMando(int tiempoAlMando) {
        this.tiempoAlMando = tiempoAlMando;
    }
}
