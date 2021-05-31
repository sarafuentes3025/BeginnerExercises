package com.sfuentes.schoolGrades;

import java.util.Map;

public class Grade {

  Map<String, Double> nameGrades;

  public Grade(Map<String, Double> gradesName) {
    this.nameGrades = gradesName;
  }

  public double calculateAverageByGrade() {
    double sum = 0;
    for (double group : nameGrades.values())
      sum += group;

    return sum / nameGrades.size();
  }
}
