package edu.oscar.herrera.reto10.process;

public abstract class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroTelefono;
    private int numeroSeguroSocial;

    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    //Metodos
    public abstract void trabajar();



    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
}
