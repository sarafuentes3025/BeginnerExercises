package com.sfuentes;

import java.util.Arrays;

public class MedianAndSmallestTest {
  public static void main(String[] args) {

    calculateSmallest_Decimal();
    calculateSmallest_SameNumbers();
    calculateSmallest_Zero();
    calculateMedian_Decimal();
    calculateMedian_SameNumbers();
    calculateMedian_Zero();

  }

  // Smallest Tests
  public static void calculateSmallest_Decimal() {
    MedianAndSmallest smallest = new MedianAndSmallest();
    double[] grades = {9.5, 7.6, 8.7, 10.8, 5.9, 9.1};
    double result = smallest.calculateSmallest(grades);

    System.out.println("Test case 1: Test with decimal numbers: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 5.9 \n\t" +
        "Actual result: " + result);
    if (result == 5.9)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateSmallest_SameNumbers() {
    MedianAndSmallest smallest = new MedianAndSmallest();
    double[] grades = {9.5, 9.5, 9.5, 9.5, 9.5, 9.5};
    double result = smallest.calculateSmallest(grades);

    System.out.println("Test case 2: Test with the same numbers: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 9.5 \n\t" +
        "Actual result: " + result);
    if (result == 9.5)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateSmallest_Zero() {
    MedianAndSmallest smallest = new MedianAndSmallest();
    double[] grades = {0.0, 0.0, 0.0, 0.0};
    double result = smallest.calculateSmallest(grades);

    System.out.println("Test case 3: Test with all zero number: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 0.0 \n\t" +
        "Actual result: " + result);
    if (result == 0.0)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  // Medium Tests
  public static void calculateMedian_Decimal() {
    MedianAndSmallest median = new MedianAndSmallest();
    double[] grades = {3.1, 7.2, 5.3, 13.4, 20.5, 23.6, 39.7, 23.8, 40.9, 23.1, 14.2, 12.3, 56.4, 23.5, 29.6};
    double result = median.calculateAverage(grades);

    System.out.println("Test case 1: Test with decimal numbers: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 22.44 \n\t" +
        "Actual result: " + result);
    if (result == 22.44)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateMedian_SameNumbers() {
    MedianAndSmallest median = new MedianAndSmallest();
    double[] grades = {3.1, 3.1, 3.1, 3.1, 3.1, 3.1};
    double result = median.calculateAverage(grades);

    System.out.println("Test case 2: Test with the same numbers: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 3.1 \n\t" +
        "Actual result: " + result);
    if (result == 3.1)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateMedian_Zero() {
    MedianAndSmallest median = new MedianAndSmallest();
    double[] grades = {0.0, 0.0, 0.0, 0.0};
    double result = median.calculateAverage(grades);

    System.out.println("Test case 2: Test with all zero number: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 0.0 \n\t" +
        "Actual result: " + result);
    if (result == 0.0)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }


}
