package com.sfuentes;

import java.util.ArrayList;
import java.util.Arrays;

public class NegativeToPositiveTest {

  public static void main(String[] args) {
    NegativeToPositive_AllNegative();
    NegativeToPositive_AllPositive();
    NegativeToPositive_Zero();
    NegativeToPositive_decimal();

  }

  public static void NegativeToPositive_AllNegative() {
    NegativeToPositive negative = new NegativeToPositive();

    double[] numbers = {-100.0, -5000.0, -90.0, -99.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(100.0, 5000.0, 90.0, 99.0));
    ArrayList<Double> actualResult = negative.convertNegativeToPositive(numbers);

    System.out.println("Test case 1: test with all negative numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void NegativeToPositive_AllPositive() {
    NegativeToPositive positive = new NegativeToPositive();

    double[] numbers = {1.0, 5.0, 9.0, 9.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(1.0, 5.0, 9.0, 9.0));
    ArrayList<Double> actualResult = positive.convertNegativeToPositive(numbers);

    System.out.println("Test case 2: test with all positive numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void NegativeToPositive_Zero() {
    NegativeToPositive positive = new NegativeToPositive();

    double[] numbers = {0.0, 0.0, 0.0, 0.0};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0));
    ArrayList<Double> actualResult = positive.convertNegativeToPositive(numbers);

    System.out.println("Test case 3: test with all zero numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void NegativeToPositive_decimal() {
    NegativeToPositive positive = new NegativeToPositive();

    double[] numbers = {-1.2, 2.3, 3.4, -4.5};
    ArrayList<Double> expectedResult = new ArrayList<>(Arrays.asList(1.2, 2.3, 3.4, 4.5));
    ArrayList<Double> actualResult = positive.convertNegativeToPositive(numbers);

    System.out.println("Test case 4: test with decimal numbers: \n\t" +
        "Test numbers: " + Arrays.toString(numbers) + " \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (actualResult.equals(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }
}
