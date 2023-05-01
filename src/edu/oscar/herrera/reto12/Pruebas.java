package edu.oscar.herrera.reto12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        //Leer el archivo y almacenar en un arraylist
        ArrayList<String> empleados = leerYAlmacenarEmpleados();

        for (String empleado: empleados) {
            System.out.println(empleado);
        }
    }

    public static ArrayList<String> leerYAlmacenarEmpleados(){
        ArrayList<String> listaDeEmpleados = new ArrayList<>();

        Path filePath = Paths.get("src/edu/oscar/herrera/reto12/ListaReto12");

        try {
            listaDeEmpleados = (ArrayList<String>) Files.readAllLines(filePath);
        } catch (IOException e){
            e.printStackTrace();
        }

        return listaDeEmpleados;
    }
}
