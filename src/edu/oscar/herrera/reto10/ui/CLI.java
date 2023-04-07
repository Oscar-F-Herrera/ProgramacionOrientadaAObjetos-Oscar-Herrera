package edu.oscar.herrera.reto10.ui;

import edu.oscar.herrera.reto10.process.*;

public class CLI {
    public static void mostrarMenu(){
        JrEngineer jr1 = new JrEngineer("A", "Z", 20, 12345678, 97315438, "Java, C#");
        SrEnginner sr1 = new SrEnginner("B", "Y", 32, 87654321, 8357435, "PHP, C++, C, Java, C#", 5);
        Manager manager1 = new Manager("C", "X", 40, 11223344, 132542, 50000);
        CEO ceo1 = new CEO("D", "W", 50, 88776655, 13514, 500000, 8);
        HR hr1 = new HR("E", "V", 27, 24861357, 239784, 17);

        JrEngineer jr2 = new SrEnginner("F", "U", 30, 12638594, 427842, "Java, HTML5, CSS, PHP, C++", 1);
        Manager ceo2 = new CEO("G", "T", 47, 43843697, 2364369, 30000, 2);
        JrEngineer j3 = new SrEnginner("H", "S", 29, 25459621, 2756352, "Java, C#, CSS, PHP, C++", 1);

        testEmpleado(jr1);
        testEmpleado(manager1);
        System.out.println();

        testProgrammer(sr1);
        testProgrammer(hr1);
        System.out.println();

        testInterviewer(jr2);
        testInterviewer(sr1);
    }

    public static void testEmpleado(Object object){
        if (object instanceof Empleado){
            System.out.println("El objeto es un empleado");
        } else {
            System.out.println("El objeto no es un empleado");
        }
    }

    public static void testProgrammer(Object object){
        if (object instanceof Programmer){
            System.out.println("El empleado es un programador");
        } else {
            System.out.println("El empleado no es un programador");
        }
    }

    public static void testInterviewer(Object object){
        if (object instanceof Interviewer){
            System.out.println("El empleado es un entrevistador");
        } else {
            System.out.println("El empleado no es un entrevistador");
        }
    }
}
