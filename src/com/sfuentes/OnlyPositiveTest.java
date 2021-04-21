package com.sfuentes;

import java.util.ArrayList;
import java.util.Arrays;

public class OnlyPositiveTest {
  public static void main(String[] args) {
    showOnlyPositiveNumbers_positiveIsCorrect();
    showOnlyPositiveNumbers_Zero();
    showOnlyPositiveNumbers_Negative();
    showOnlyPositiveNumbers_sameNumbersPositive();
  }

  public static void showOnlyPositiveNumbers_positiveIsCorrect() {
    OnlyPositive correct = new OnlyPositive();

    double[] numbers = {1.5, 0, -9, 7.8, -4, -3, -2, -8, -9, -10};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(1.5d, 7.8d));
    ArrayList<Double> actualResult = correct.showOnlyPositiveNumbers(numbers);

    System.out.println("Test case 1: Show positive numbers correct: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result: " + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void showOnlyPositiveNumbers_Zero() {
    OnlyPositive zero = new OnlyPositive();

    double[] numbers2 = {0, 0, 0, 0, 0};
    ArrayList<Double> expectedResult2 = new ArrayList<>(Arrays.asList());
    ArrayList<Double> actualResult2 = zero.showOnlyPositiveNumbers(numbers2);

    System.out.println("Test case 2: test with all the numbers in zero: \n\t" +
        "Test numbers: " + Arrays.toString(numbers2) + " \n\t" +
        "Expected result:" + expectedResult2 + " \n\t" +
        "Actual result: " + actualResult2);
    if (actualResult2.equals(expectedResult2))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void showOnlyPositiveNumbers_Negative() {
    OnlyPositive negative = new OnlyPositive();

    double[] numbers3 = {-100.0, -5000.0, -90.0, -99.0};
    ArrayList<Double> expectedResult3 = new ArrayList<>(Arrays.asList());
    ArrayList<Double> actualResult3 = negative.showOnlyPositiveNumbers(numbers3);

    System.out.println("Test case 3: test with all negative numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers3) + " \n\t" +
        "Expected result:" + expectedResult3 + " \n\t" +
        "Actual result: " + actualResult3);
    if (actualResult3.equals(expectedResult3))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void showOnlyPositiveNumbers_sameNumbersPositive() {
    OnlyPositive samePositive = new OnlyPositive();

    double[] numbers = {10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
    ArrayList<Double> expectedResult4 = new ArrayList<>(Arrays.asList(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
    ArrayList<Double> actualResult4 = samePositive.showOnlyPositiveNumbers(numbers);

    System.out.println("Test case 4: test with all positive numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult4 + " \n\t" +
        "Actual result: " + actualResult4);
    if (actualResult4.equals(expectedResult4))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }
}
