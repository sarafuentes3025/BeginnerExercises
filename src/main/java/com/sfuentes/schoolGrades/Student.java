package com.sfuentes.schoolGrades;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class Student {
  String name;
  String nameGroup;
  Map<String, Double> subjects;

  public double calculateAverageByStudent() {
    double sum = 0;
    for (double subject : subjects.values())
      sum += subject;

    return sum / subjects.size();
  }

}
