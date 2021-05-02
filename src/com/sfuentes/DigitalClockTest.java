package com.sfuentes;

import java.util.ArrayList;

public class DigitalClockTest {
  public static void main(String[] args) {

    generateTime_IncorrectHours();
    generateTime_IncorrectMinutes();
    generateTime_IncorrectSeconds();
    generateTime_IncorrectTime();

    generateTime_firstHour();
    generateTime_CorrectMinutes();
    generateTime_CorrectSeconds();
    generateTime_lastHour();
  }

  //  Test Incorrect Hours
  public static void generateTime_IncorrectHours() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "24:0:0";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 1: Test that the hour does not exist: \n\t" +
        "Expected result: false \n\t" +
        "Actual result: " + i);

    System.out.println(!i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_IncorrectMinutes() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "1:60:0";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 2: Test that the minute does not exist: \n\t" +
        "Expected result: false \n\t" +
        "Actual result: " + i);

    System.out.println(!i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_IncorrectSeconds() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "1:0:60";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 2: Test that the seconds does not exist: \n\t" +
        "Expected result: false \n\t" +
        "Actual result: " + i);

    System.out.println(!i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_IncorrectTime() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "24:60:60";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 2: Test that the seconds does not exist: \n\t" +
        "Expected result: false \n\t" +
        "Actual result: " + i);

    System.out.println(!i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }


  //  Correct hours
  public static void generateTime_firstHour() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "0:0:0";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 1: Test the first hour: \n\t" +
        "Expected result: true \n\t" +
        "Actual result: " + i);

    System.out.println(i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_CorrectMinutes() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "1:59:0";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 1: Test that the minute exists: : \n\t" +
        "Expected result: true \n\t" +
        "Actual result: " + i);

    System.out.println(i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_CorrectSeconds() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "1:59:0";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 1: Test that the seconds exists: : \n\t" +
        "Expected result: true \n\t" +
        "Actual result: " + i);

    System.out.println(i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_lastHour() {
    DigitalClock times = new DigitalClock();
    String expectedResult = "23:59:59";
    ArrayList<String> actualResult = times.generateHours();
    boolean i = true;

    for (String result : actualResult) {
      if (result.equals(expectedResult)) {
        i = true;
        break;
      } else
        i = false;
    }
    System.out.println("Test case 1: Test the last hour: \n\t" +
        "Expected result: true \n\t" +
        "Actual result: " + i);

    System.out.println(i ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }
}
