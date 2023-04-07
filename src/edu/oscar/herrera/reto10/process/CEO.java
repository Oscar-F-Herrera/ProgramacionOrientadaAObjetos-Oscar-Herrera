package edu.oscar.herrera.reto10.process;

public class CEO extends Manager{

    //Atributos
    private int tiempoAlMando;

    //Constructores
    public CEO() {
    }

    public CEO(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int presupuesto, int tiempoAlMando) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial, presupuesto);
        this.tiempoAlMando = tiempoAlMando;
    }

    //Metodos
    @Override
    public void trabajar(){

    }

    @Override
    public void interview() {

    }



    //Getters y Setters
    public int getTiempoAlMando() {
        return tiempoAlMando;
    }

    public void setTiempoAlMando(int tiempoAlMando) {
        this.tiempoAlMando = tiempoAlMando;
    }
}
