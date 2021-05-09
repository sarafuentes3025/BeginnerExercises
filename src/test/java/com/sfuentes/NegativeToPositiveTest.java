package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeToPositiveTest {

  @Test
  void NegativeToPositive_AllNegative() {
    NegativeToPositive negative = new NegativeToPositive();

    double[] numbers = {-100.0, -5000.0, -90.0, -99.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(100.0, 5000.0, 90.0, 99.0));

    assertEquals(negative.convertNegativeToPositive(numbers),expectedResult);
  }

  @Test
  void NegativeToPositive_AllPositive() {
    NegativeToPositive positive = new NegativeToPositive();

    double[] numbers = {1.0, 5.0, 9.0, 9.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(1.0, 5.0, 9.0, 9.0));

    assertEquals(positive.convertNegativeToPositive(numbers),expectedResult);
  }

  @Test
  void NegativeToPositive_Zero() {
    NegativeToPositive positive = new NegativeToPositive();

    double[] numbers = {0.0, 0.0, 0.0, 0.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0));

    assertEquals(positive.convertNegativeToPositive(numbers),expectedResult);
  }

  @Test
  void NegativeToPositive_decimal() {
    NegativeToPositive positive = new NegativeToPositive();

    double[] numbers = {-1.2, 2.3, 3.4, -4.5};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(1.2, 2.3, 3.4, 4.5));

    assertEquals(positive.convertNegativeToPositive(numbers),expectedResult);
  }

}
