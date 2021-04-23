package com.sfuentes;

public class AverageTest {

  public static void main(String[] args) {
    calculateAverageStudent_averageIsCorrect();
    calculateAverageStudent_decimals();

  }

  public static void calculateAverageStudent_averageIsCorrect() {
    Average correct = new Average();
    double[] grades = {8, 8, 8, 8, 8, 8, 8};
    double result = correct.calculateAverageStudent(grades);
    System.out.println("Test case 1 Calculated average is correct: \n\t" +
        "Expected result: 8 \n\t" +
        "Actual result: " + result);
    if (result == 8)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");

  }

  public static void calculateAverageStudent_decimals() {
    Average decimal = new Average();
    double[] grades = {9, 9, 9, 9, 9, 9, 5.5};
    double result = decimal.calculateAverageStudent(grades);
    System.out.println("Test case 2 Calculated average is correct with decimals: \n\t" +
        "Expected result: 8.5 \n\t" +
        "Actual result: " + result);
    if (result == 8.5)
      System.out.println("\tSuccessful test.");
    else
      System.out.println("\tTest failed.");

  }


}
