package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitalClockTest {

  @Test
  void generateTime_firstHour() {
    DigitalClock firstHour = new DigitalClock();
    ArrayList<String> actualResult = firstHour.generateHours();
    boolean found = false;

    for (String result : actualResult) {
      if (result.equals("0:0:0")) {
        found = true;
        break;
      } else
        found = false;
    }

    assertTrue(found);
  }

  @Test
  void generateTime_CorrectMinutes() {
    DigitalClock correctMinutes = new DigitalClock();
    ArrayList<String> actualResult = correctMinutes.generateHours();
    boolean found = false;

    for (String result : actualResult) {
      if (result.equals("1:59:0")) {
        found = true;
        break;
      } else
        found = false;
    }

    assertTrue(found);
  }

  @Test
  void generateTime_CorrectSeconds() {
    DigitalClock times = new DigitalClock();
    ArrayList<String> actualResult = times.generateHours();
    boolean found = false;

    for (String result : actualResult) {
      if (result.equals("1:0:59")) {
        found = true;
        break;
      } else
        found = false;
    }

    assertTrue(found);
  }

  @Test
  void generateTime_lastHour() {
    DigitalClock times = new DigitalClock();
    ArrayList<String> actualResult = times.generateHours();
    boolean found = false;

    for (String result : actualResult) {
      if (result.equals("23:59:59")) {
        found = true;
        break;
      } else
        found = false;
    }

    assertTrue(found);
  }
}
