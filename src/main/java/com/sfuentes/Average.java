package com.sfuentes;

public class Average {
  public double calculateAverageStudent(double[] grades) {
    double total = 0;

    for (double grade : grades)
      total += grade;

    return total / 7;
  }
}