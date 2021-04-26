package com.sfuentes;

public class MedianAndSmallest {

  public double calculateSmallest(double[] grades) {
    double smallest = grades[0];
    for (int i = 0; i < grades.length - 1; i++) {
      if (grades[i] < smallest) {
        smallest = grades[i];
      }
    }
    return smallest;
  }

  public double calculateAverage(double[] grades) {
    double total = 0;
    for (double grade : grades)
      total += grade;

    return total / grades.length;
  }
}


