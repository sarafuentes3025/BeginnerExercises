package com.sfuentes;

public class AverageTest {

  public static void main(String[] args) {
    validateAverageLessThanTen();
    validateAverageIsDecimal();

  }

  public static void validateAverageLessThanTen() {
    Average less = new Average();
    double result = less.calculateAverageStudent();
    System.out.println("Test case 1 validateAverageLessThanTen: \n\t" +
        "Expected result: range 0 - 10 \n\t" +
        "Obtained result: " + result);
    if (result <= 10) {
      System.out.println("\tSuccessful test.");
    } else {
      System.out.println("\tTest failed.");
    }
  }

  public static void validateAverageIsDecimal() {
    Average decimal = new Average();
    double result = decimal.calculateAverageStudent();
    System.out.println("Test case 1 validateAverageLessThanTen: \n\t" +
        "Expected result: range 0.0 -10.0 \n\t" +
        "Obtained result: " + result);
    if (result % 1 != 0) {
      System.out.println("\t Successful test.");
    } else {
      System.out.println("\tTest failed.");
    }
  }

}
