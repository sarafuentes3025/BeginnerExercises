package com.sfuentes;

public class AverageTest {

  public static void main(String[] args) {
    calculateAverageStudent_averageIsCorrect();
    calculateAverageStudent_decimals();

  }

  public static void calculateAverageStudent_averageIsCorrect() {
    Average correct = new Average();
    double[] grades = {8,8,8,8,8,8,8};
    double result = correct.calculateAverageStudent(grades);
    System.out.println("Test case 1 Calculated average is correct: \n\t" +
        "Expected result: 8 \n\t" +
        "Obtained result: " + result);
    if (result == 8) {
      System.out.println("\tSuccessful test.");
    } else {
      System.out.println("\tTest failed.");
    }
  }

  public static void calculateAverageStudent_decimals() {
    Average decimal = new Average();
    double[] grades = {5.5,9.1,7.5,8,8,8,8.3};
    double result = decimal.calculateAverageStudent(grades);
    result = Math.round(result*100.0)/100.0;
    System.out.println("Test case 2 Calculated average is correct with decimals: \n\t" +
        "Expected result: 7.77 \n\t" +
        "Obtained result: " + result);
    if (result == 7.77) {
      System.out.println("\tSuccessful test.");
    } else {
      System.out.println("\tTest failed.");
    }
  }





}
