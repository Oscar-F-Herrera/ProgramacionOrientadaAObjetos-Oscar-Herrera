package edu.oscar.herrera.reto11.ui;

import edu.oscar.herrera.reto11.process.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.file.Path;
import java.util.List;

/**
 * En esta clase se crean varios objetos y se imprimen los métodos
 */
public class CLI {
    /**
     * Este método crea inges y llama a otros métodos
     */
    public static void mostrarMenu(){
        //Guardar Inges en el archivo de texto

        ArrayList<Empleado> primerLista = new ArrayList<>();

        primerLista.add(new JrEngineer("A","A",29,1000000,1000000,"Python","AAAA0001"));
        primerLista.add(new JrEngineer("B","B",27,2000000,2000000,"Java","BBBB0002"));
        primerLista.add(new JrEngineer("C","C",29,3000000,3000000,"Javascript","CCCC0003"));
        primerLista.add(new JrEngineer("D","D",18,4000000,4000000,"C++","DDDD0004"));
        primerLista.add(new JrEngineer("E","E",26,5000000,5000000,"C","EEEE0005"));
        primerLista.add(new JrEngineer("F","F",19,6000000,6000000,"C#","FFFF0006"));
        primerLista.add(new JrEngineer("G","G",26,7000000,7000000,"PHP","GGGG0007"));
        primerLista.add(new JrEngineer("H","H",29,8000000,8000000,"Java","HHHH0008"));
        primerLista.add(new JrEngineer("I","I",19,9000000,9000000,"Python","IIII0009"));
        primerLista.add(new JrEngineer("J","J",21,1234567,1234567,"C++","JJJJ0010"));

        try{
            FileWriter writer = new FileWriter("src/edu/oscar/herrera/reto11/ui/Lista.txt");
            for (Empleado i:primerLista) {
                writer.write(i + "\n");
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //Leer los Inges del Archivo de texto y guardarlos en un arraylist

        ArrayList<String> segundaLista = new ArrayList<>();

        Path path = Paths.get("src/edu/oscar/herrera/reto11/ui/Lista.txt");

        try {
            List<String> lineasDelArchivo = Files.readAllLines(path);

            for (String line : lineasDelArchivo) {
                segundaLista.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //Imprimir inges mayores de 20
        imprimirMayorA20(segundaLista);
    }

    /**
     * Este método imprime al empleado si su edad es mayor a 20
     * @param lista La lista de empleados
     */
    public static void imprimirMayorA20(ArrayList<String> lista){
        for (String empleado : lista) {
            String[] atributos = empleado.split(";");
            int edad = Integer.parseInt(atributos[3]);
            if (edad > 20) {
                System.out.println(empleado);
            }
        }
    }
}
