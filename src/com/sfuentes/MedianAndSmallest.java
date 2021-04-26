package com.sfuentes;

public class MedianAndSmallest {

  public double CalculateSmallest(double[] grades) {
    for (int i = 0; i < grades.length - 1; i++) {
      for (int j = i + 1; j < grades.length; j++) {
        if (grades[i] > grades[j]) {
          double temporal = grades[i];
          grades[i] = grades[j];
          grades[j] = temporal;
        }
      }
    }
    return grades[0];
  }

  public double CalculateMedian(double[] grades) {
    double total = 0;
    for (double grade : grades)
      total += grade;

    return total / grades.length;
  }
}


