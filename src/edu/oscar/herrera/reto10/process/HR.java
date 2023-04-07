package edu.oscar.herrera.reto10.process;

public class HR extends Empleado implements Interviewer {

    //Atributos
    private int numeroDeEmpleadosContratados;

    //Constructores
    public HR() {
    }

    public HR(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int numeroDeEmpleadosContratados) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial);
        this.numeroDeEmpleadosContratados = numeroDeEmpleadosContratados;
    }

    //Metodos
    @Override
    public void trabajar(){

    }

    @Override
    public void interview() {

    }



    //Getters y Setters
    public int getNumeroDeEmpleadosContratados() {
        return numeroDeEmpleadosContratados;
    }

    public void setNumeroDeEmpleadosContratados(int numeroDeEmpleadosContratados) {
        this.numeroDeEmpleadosContratados = numeroDeEmpleadosContratados;
    }
}
