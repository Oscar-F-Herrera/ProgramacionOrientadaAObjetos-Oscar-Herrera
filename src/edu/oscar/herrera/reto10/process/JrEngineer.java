package edu.oscar.herrera.reto10.process;

public class JrEngineer extends Empleado implements Programmer {

    //Atributos
    private String lenguajesConocidos;

    //Constructores
    public JrEngineer() {
    }

    public JrEngineer(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, String lenguajesConocidos) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial);
        this.lenguajesConocidos = lenguajesConocidos;
    }

    //Metodos
    @Override
    public void trabajar(){
        System.out.println("Se estresa buscando soluciones");
    }

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
