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
    double[] grades = new double[7];
    Scanner scan = new Scanner(System.in);
    Average student = new Average();

    for(int i = 0; i < 7; i++){
      System.out.println("Type in a grade " + i + ":");
      grades[i] = scan.nextDouble();
    }
    double calculateAverageStudent = student.calculateAverageStudent(grades);
    System.out.println("1.--------Program Calculate Average Alumn-----");
    System.out.println(calculateAverageStudent >= 8 ? "Congratulations you have approved!!!\n" : "Sorry, you failed\n");
  }
}
