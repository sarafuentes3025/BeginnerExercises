package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {
  @Test
  void calculateAverageStudent_averageIsCorrect() {
    Average correct = new Average();
    double[] grades = {8, 8, 8, 8, 8, 8, 8};

    assertEquals(correct.calculateAverageStudent(grades), 8);
  }

  @Test
  void calculateAverageStudent_decimals() {
    Average decimal = new Average();
    double[] grades = {9, 9, 9, 9, 9, 9, 5.5};
    
    assertEquals(decimal.calculateAverageStudent(grades), 8.5);
  }
}
