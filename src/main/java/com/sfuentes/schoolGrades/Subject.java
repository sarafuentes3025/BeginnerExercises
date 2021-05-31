package com.sfuentes.schoolGrades;

import java.util.ArrayList;

public class Subject {

  String nameSubject;
  ArrayList<Double> scores;

  public Subject(String subjectName, ArrayList<Double> scores) {
    this.nameSubject = subjectName;
    if (scores.size() == 3)
      this.scores = scores;
    else
      throw new IllegalArgumentException("Incorrect amount of scores");
  }

  public double calculateAverageBySubject() {
    return scores.stream()
        .mapToDouble(a -> a)
        .average()
        .orElse(0.0);
  }
}
