package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageAndSmallestTest {

  @Test
  void calculateSmallest_Decimal() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {7.6, 5.9, 8.7, 10.8, 9.1};

    assertEquals(smallest.calculateSmallest(grades),5.9);
  }

  @Test
  void calculateSmallest_SameNumbers() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {9.5, 9.5, 9.5, 9.5, 9.5, 9.5};

    assertEquals(smallest.calculateSmallest(grades),9.5);
  }

  @Test
  void calculateSmallest_Zero() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {0.0, 0.0, 0.0, 0.0};

    assertEquals(smallest.calculateSmallest(grades),0.0);
  }

  @Test
  void calculateSmallest_FirstSmallest() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {1.0, 8.0, 6.0, 5.0, 10.0, 9.1, 7.0};

    assertEquals(smallest.calculateSmallest(grades),1.0);
  }

  @Test
  void calculateSmallest_LastSmallest() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {5.0, 10.0, 8.0, 9.1, 6.0, 7.0, 2.0};

    assertEquals(smallest.calculateSmallest(grades),2.0);
  }

  @Test
  void calculateAverage_Decimal() {
    AverageAndSmallest average = new AverageAndSmallest();
    double[] grades = {3.1, 7.2, 5.3, 13.4, 20.5, 23.6, 39.7, 23.8, 40.9, 23.1, 14.2, 12.3, 56.4, 23.5, 29.6};

    assertEquals(average.calculateAverage(grades),22.44);
  }

  @Test
  void calculateAverage_SameNumbers() {
    AverageAndSmallest average = new AverageAndSmallest();
    double[] grades = {3.1, 3.1, 3.1, 3.1, 3.1, 3.1};

    assertEquals(average.calculateAverage(grades),3.1);
  }

  @Test
  void calculateAverage_Zero() {
    AverageAndSmallest average = new AverageAndSmallest();
    double[] grades = {0.0, 0.0, 0.0, 0.0};

    assertEquals(average.calculateAverage(grades),0.0);
  }
}
