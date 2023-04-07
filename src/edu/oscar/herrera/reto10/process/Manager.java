package edu.oscar.herrera.reto10.process;

public class Manager extends Empleado implements Interviewer {

    //Atributos
    private int presupuesto;

    //Constructores
    public Manager() {
    }

    public Manager(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int presupuesto) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial);
        this.presupuesto = presupuesto;
    }

    //Metodos
    @Override
    public void trabajar(){

    }

    @Override
    public void interview() {

    }



    //Getters y Setters
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
