package edu.oscar.herrera.reto10.process;

public class SrEnginner extends JrEngineer implements Interviewer {

    //Atributos
    private int tiempoEnLaEmpresa;

    //Constructores

    public SrEnginner() {
    }

    public SrEnginner(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, String lenguajesConocidos, int tiempoEnLaEmpresa) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial, lenguajesConocidos);
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    //Metodos
    @Override
    public void trabajar(){
        System.out.println("Trabaja relajado");
    }

    @Override
    public void programar() {
        System.out.println("Programa como quiere");
    }

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
