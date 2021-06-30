package com.sfuentes.schoolGrades;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class Grade {

  Map<String, Double> nameGrades;

  public double calculateAverageByGrade() {
    double sum = 0;
    for (double group : nameGrades.values())
      sum += group;

    return sum / nameGrades.size();
  }
}
