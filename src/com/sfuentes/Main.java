package com.sfuentes;

public class Main {

    public static void main(String[] args) {
        /*
         1.
         Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Programación,
         y mostrar en pantalla si el alumno está aprobado o no aprobado, sabiendo que el promedio
         aprobatorio debe ser mayor o igual a 8.
        */

        Average student = new Average();
        double calculateAverageStudent = student.calculateAverageStudent();
        System.out.println("1.--------Program Calculate Average Alumn-----");
        System.out.println(calculateAverageStudent>= 8 ? "Congratulations you have approved!!!\n": "Sorry, you failed\n");
    }
}
