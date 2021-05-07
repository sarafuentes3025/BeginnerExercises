package com.sfuentes;

import java.util.ArrayList;
import java.util.Arrays;

public class PeopleWeightTest {

  public static void main(String[] args) {
    generateWeightAverage_sizeArray();
    generateWeightAverage_OnlyKids();
    generateWeightAverage_OnlyTeens();
    generateWeightAverage_OnlyAdults();
    generateWeightAverage_OnlyOldest();
  }

  public static void generateWeightAverage_sizeArray() {
    PeopleWeight categories = new PeopleWeight();
    int expectedResult = 4;
    double[][] agesWeight =
        {
            {60, 80.5},
            {29, 68.5},
            {59, 79.5},
            {12, 25.5}
        };
    int actualResult = categories.generateWeightAverage(agesWeight).size();

    System.out.println("Test case 4: Calculate size categories: \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (expectedResult == actualResult)
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void generateWeightAverage_OnlyKids() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Kids 0 - 12 average weight: 27.5";
    double[][] agesWeights =
        {
            {9, 30.5},
            {5, 28.5},
            {0, 5.5},
            {12, 45.5}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);
    String actualResult = arrayLists.get(0);

    System.out.println("Test case 4: Calculate length categories: \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (arrayLists.contains(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void generateWeightAverage_OnlyTeens() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Teens 13 - 29 average weight: 55.0";
    double[][] agesWeights =
        {
            {13, 50.5},
            {16, 68.5},
            {18, 55.5},
            {29, 45.5}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);
    String actualResult = arrayLists.get(1);

    System.out.println("Test case 4: Calculate length categories: \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (arrayLists.contains(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void generateWeightAverage_OnlyAdults() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Adults 30 - 59 average weight: 60.5";
    double[][] agesWeights =
        {
            {30, 52.5},
            {40, 39.0},
            {50, 70.5},
            {59, 80.0}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);
    String actualResult = arrayLists.get(2);

    System.out.println("Test case 4: Calculate length categories: \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (arrayLists.contains(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }

  public static void generateWeightAverage_OnlyOldest() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Senior 60 - ... average weight: 78.25";
    double[][] agesWeights =
        {
            {80, 42.0},
            {90, 80.5},
            {77, 90.0},
            {100, 100.5}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);
    String actualResult = arrayLists.get(3);

    System.out.println("Test case 4: Calculate length categories: \n\t" +
        "Expected result:" + expectedResult + " \n\t" +
        "Actual result: " + actualResult);
    if (arrayLists.contains(expectedResult))
      System.out.println("\tSUCCESSFUL TEST.");
    else
      System.out.println("\tTEST FAILED.");
  }


}
