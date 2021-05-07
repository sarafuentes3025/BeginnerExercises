package com.sfuentes;

import java.util.ArrayList;

public class DigitalClockTest {
  public static void main(String[] args) {
    generateTime_firstHour();
    generateTime_CorrectMinutes();
    generateTime_CorrectSeconds();
    generateTime_lastHour();
  }

  public static void generateTime_firstHour() {
    DigitalClock firstHour = new DigitalClock();
    ArrayList<String> actualResult = firstHour.generateHours();
    boolean found = true;

    for (String result : actualResult) {
      if (result.equals("0:0:0")) {
        found = true;
        break;
      } else
        found = false;
    }
    System.out.println("Test case 1: Test the first hour: \n\t" +
        "Test hour: 0:0:0 \n\tExpected result: true \n" +
        "\tActual result: " + found);

    System.out.println(found ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_CorrectMinutes() {
    DigitalClock correctMinutes = new DigitalClock();
    ArrayList<String> actualResult = correctMinutes.generateHours();
    boolean found = true;

    for (String result : actualResult) {
      if (result.equals("1:59:0")) {
        found = true;
        break;
      } else
        found = false;
    }
    System.out.println("Test case 2: Test that the minute exists: : \n\t" +
        "Test hour: 1:59:0 \n\tExpected result: true \n" +
        "\tActual result: " + found);

    System.out.println(found ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_CorrectSeconds() {
    DigitalClock times = new DigitalClock();
    ArrayList<String> actualResult = times.generateHours();
    boolean found = true;

    for (String result : actualResult) {
      if (result.equals("1:0:59")) {
        found = true;
        break;
      } else
        found = false;
    }
    System.out.println("Test case 3: Test that the seconds exists: : \n\t" +
        "Test hour: 1:0:59 \n\tExpected result: true \n" +
        "\tActual result: " + found);

    System.out.println(found ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }

  public static void generateTime_lastHour() {
    DigitalClock times = new DigitalClock();
    ArrayList<String> actualResult = times.generateHours();
    boolean found = true;

    for (String result : actualResult) {
      if (result.equals("23:59:59")) {
        found = true;
        break;
      } else
        found = false;
    }
    System.out.println("Test case 4: Test the last hour: \n\t" +
        "Test hour: 23:59:59 \n\tExpected result: true \n" +
        "\tActual result: " + found);

    System.out.println(found ? "\tSUCCESSFUL TEST." : "\tTEST FAILED.");
  }
}
