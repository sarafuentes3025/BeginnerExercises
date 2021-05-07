package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlyPositiveTest {
  @Test
  void filterPositiveNumbers_Negative() {
    OnlyPositive negative = new OnlyPositive();

    double[] numbers = {-100.0, -5000.0, -90.0, -99.0};

    assertEquals(new ArrayList<>(), negative.filterPositiveNumbers(numbers));
  }

  @Test
  void filterPositiveNumbers_sameNumbersPositive() {
    OnlyPositive samePositive = new OnlyPositive();

    double[] numbers = {10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
    ArrayList<Double> positivesList = new ArrayList<>(Arrays.asList(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));

    assertEquals(positivesList, samePositive.filterPositiveNumbers(numbers));
  }

  @Test
  void filterPositiveNumbers_Zero() {
    OnlyPositive zero = new OnlyPositive();

    double[] numbers = {0, 0, 0, 0, 0};

    assertEquals(new ArrayList<>(), zero.filterPositiveNumbers(numbers));
  }

  @Test
  void filterPositiveNumbers_positiveIsCorrect() {
    OnlyPositive correct = new OnlyPositive();

    double[] numbers = {1.5, 0, -9, 7.8, -4, -3, -2, -8, -9, -10};
    ArrayList<Double> isCorrect = new ArrayList<>(Arrays.asList(1.5d, 7.8d));
    ArrayList<Double> actualResult = correct.filterPositiveNumbers(numbers);

    assertEquals(isCorrect, correct.filterPositiveNumbers(numbers));

  }

}
