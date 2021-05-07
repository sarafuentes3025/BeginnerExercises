package com.sfuentes;

import java.util.Arrays;

public class AverageAndSmallestTest {
  public static void main(String[] args) {

    calculateSmallest_Decimal();
    calculateSmallest_SameNumbers();
    calculateSmallest_Zero();
    calculateSmallest_FirstSmallest();
    calculateSmallest_LastSmallest();
    calculateAverage_Decimal();
    calculateAverage_SameNumbers();
    calculateAverage_Zero();

  }

  // Smallest Tests
  public static void calculateSmallest_Decimal() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {7.6, 5.9, 8.7, 10.8, 9.1};
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
    AverageAndSmallest smallest = new AverageAndSmallest();
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
    AverageAndSmallest smallest = new AverageAndSmallest();
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

  public static void calculateSmallest_FirstSmallest() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {1.0, 8.0, 6.0, 5.0, 10.0, 9.1, 7.0};
    double result = smallest.calculateSmallest(grades);

    System.out.println("Test case 4: Test the first smallest number: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 1.0 \n\t" +
        "Actual result: " + result);
    if (result == 1.0)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateSmallest_LastSmallest() {
    AverageAndSmallest smallest = new AverageAndSmallest();
    double[] grades = {5.0, 10.0, 8.0, 9.1, 6.0, 7.0, 2.0};
    double result = smallest.calculateSmallest(grades);

    System.out.println("Test case 5: Test the last smallest number: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 2.0 \n\t" +
        "Actual result: " + result);
    if (result == 2.0)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  // Average Tests
  public static void calculateAverage_Decimal() {
    AverageAndSmallest average = new AverageAndSmallest();
    double[] grades = {3.1, 7.2, 5.3, 13.4, 20.5, 23.6, 39.7, 23.8, 40.9, 23.1, 14.2, 12.3, 56.4, 23.5, 29.6};
    double result = average.calculateAverage(grades);

    System.out.println("Test case 1: Test with decimal numbers: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 22.44 \n\t" +
        "Actual result: " + result);
    if (result == 22.44)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateAverage_SameNumbers() {
    AverageAndSmallest average = new AverageAndSmallest();
    double[] grades = {3.1, 3.1, 3.1, 3.1, 3.1, 3.1};
    double result = average.calculateAverage(grades);

    System.out.println("Test case 2: Test with the same numbers: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 3.1 \n\t" +
        "Actual result: " + result);
    if (result == 3.1)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }

  public static void calculateAverage_Zero() {
    AverageAndSmallest average = new AverageAndSmallest();
    double[] grades = {0.0, 0.0, 0.0, 0.0};
    double result = average.calculateAverage(grades);

    System.out.println("Test case 3: Test with all zero number: \n\t" +
        "Test numbers: " + Arrays.toString(grades) +
        "\n\tExpected result: 0.0 \n\t" +
        "Actual result: " + result);
    if (result == 0.0)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");
  }


}
