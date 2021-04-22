package com.sfuentes;

import java.util.ArrayList;
import java.util.Arrays;

public class OnlyPositiveTest {
  public static void main(String[] args) {
    filterPositiveNumbers_positiveIsCorrect();
    filterPositiveNumbers_Zero();
    filterPositiveNumbers_Negative();
    filterPositiveNumbers_sameNumbersPositive();
  }

  public static void filterPositiveNumbers_positiveIsCorrect() {
    OnlyPositive correct = new OnlyPositive();

    double[] numbers = {1.5, 0, -9, 7.8, -4, -3, -2, -8, -9, -10};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(1.5d, 7.8d));
    ArrayList<Double> actualResult = correct.filterPositiveNumbers(numbers);

    System.out.println("Test case 1: Show positive numbers correct: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result: " + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void filterPositiveNumbers_Zero() {
    OnlyPositive zero = new OnlyPositive();

    double[] numbers = {0, 0, 0, 0, 0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList());
    ArrayList<Double> actualResult = zero.filterPositiveNumbers(numbers);

    System.out.println("Test case 2: test with all the numbers in zero: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void filterPositiveNumbers_Negative() {
    OnlyPositive negative = new OnlyPositive();

    double[] numbers = {-100.0, -5000.0, -90.0, -99.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList());
    ArrayList<Double> actualResult = negative.filterPositiveNumbers(numbers);

    System.out.println("Test case 3: test with all negative numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void filterPositiveNumbers_sameNumbersPositive() {
    OnlyPositive samePositive = new OnlyPositive();

    double[] numbers = {10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
    ArrayList<Double> actualResult = samePositive.filterPositiveNumbers(numbers);

    System.out.println("Test case 4: test with all positive numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }
}
