package com.sfuentes;

public class CarVerification {

  public double calculateAverage(int[] points) {
    double total = 0;

    for (int point : points)
      total += point;

    return total / points.length;
  }

  public int calculateSmallestPoint(int[] points) {
    int smallest = points[0];

    for (int point : points)
      if (point < smallest)
        smallest = point;


    return smallest;
  }

  public int calculateTopPoint(int[] points) {
    int top = points[0];

    for (int point : points)
      if (point > top)
        top = point;

    return top;
  }
}
