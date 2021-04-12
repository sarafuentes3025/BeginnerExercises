package com.sfuentes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
         1.
         Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Programación,
         y mostrar en pantalla si el alumno está aprobado o no aprobado, sabiendo que el promedio
         aprobatorio debe ser mayor o igual a 8.
        */
        CalculateAverage student = new CalculateAverage();
        double solution1 = student.solution();
        System.out.println("1.--------Program Calculate Average-----");
        System.out.println(solution1>= 8 ? "Congratulations you have approved!!!\n": "Sorry, you failed\n");

    }
}
