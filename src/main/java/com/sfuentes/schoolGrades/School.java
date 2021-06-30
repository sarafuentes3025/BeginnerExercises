package com.sfuentes.schoolGrades;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class School {

  ArrayList<Double> grades;

  public double calculateAverageAllGrades() {
    return grades.stream()
        .mapToDouble(a -> a)
        .average()
        .orElse(0.0);
  }
}
