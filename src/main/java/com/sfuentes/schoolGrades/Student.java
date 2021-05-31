package com.sfuentes.schoolGrades;

import java.util.Map;

public class Student {
  String name;
  String nameGroup;
  Map<String, Double> subjects;

  public Student(String name, String nameGroup, Map<String, Double> subjects) {
    this.name = name;
    this.nameGroup = nameGroup;
    this.subjects = subjects;
  }

  public double calculateAverageByStudent() {
    double sum = 0;
    for (double subject : subjects.values())
      sum += subject;

    return sum / subjects.size();
  }

}
