package com.sfuentes;

public class AverageAndSmallest {

  public double calculateSmallest(double[] grades) {
    double smallest = grades[0];
    for (int i = 0; i < grades.length; i++) {
      if (grades[i] < smallest) {
        smallest = grades[i];
      }
    }
    return smallest;
  }

  public double calculateAverage(double[] grades) {
    double average = 0;
    for (double grade : grades)
      average += grade;

    return average / grades.length;
  }
}


