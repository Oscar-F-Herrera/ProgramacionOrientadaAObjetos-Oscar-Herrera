package edu.oscar.herrera.reto10.process;

/**
 * Esta es la clase base para la creacion de empleados
 */
public abstract class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroTelefono;
    private int numeroSeguroSocial;

    /**
     * Este es el constructor default del objeto Empleado
     */
    public Empleado() {
    }

    /**
     * Este es el constructor completo del objeto empleado
     *
     * @param nombre El nombre del empleado
     * @param apellido El apellido del empleado
     * @param edad La edad del empleado
     * @param numeroTelefono El número de teléfono del empleado
     * @param numeroSeguroSocial El número de seguro social del empleado
     */
    public Empleado(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    /**
     * Método abstracto trabajar que será establecido por las clases hijas
     */
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
