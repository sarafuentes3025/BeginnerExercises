package com.sfuentes.schoolGrades;

import java.util.ArrayList;

public class School {

  ArrayList<Double> grades;

  public School (ArrayList<Double> grades){
    this.grades = grades;
  }

  public double calculateAverageAllGrades(){
    return grades.stream()
        .mapToDouble(a -> a)
        .average()
        .orElse(0.0);
  }
}
