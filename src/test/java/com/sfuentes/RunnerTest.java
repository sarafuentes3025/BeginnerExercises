package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RunnerTest {

  @Test
  void calculateIfItIsSuitable_lessThanSixteen() {
    Runner test = new Runner();
    double[] laps = {10, 11, 12, 13, 14, 15, 14, 13, 12, 11};

    assertTrue(test.calculateIfItIsSuitable(laps));
  }

  @Test
  void calculateIfItIsSuitable_onlyOneGreaterThanSixteen() {
    Runner test = new Runner();
    double[] laps = {15, 15, 15, 15, 15, 15, 15, 15, 15, 17};

    assertTrue(test.calculateIfItIsSuitable(laps));
  }

  @Test
  void calculateIfItIsSuitable_lowerAverage() {
    Runner test = new Runner();
    double[] laps = {15, 15, 15, 15, 15, 14, 14, 13, 12, 10};

    assertTrue(test.calculateIfItIsSuitable(laps));
  }

  @Test
  void calculateIfItIsSuitable_equalAverageThanFifteen() {
    Runner test = new Runner();
    double[] laps = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15};

    assertTrue(test.calculateIfItIsSuitable(laps));
  }

  @Test
  void calculateIfItIsSuitable_Zero() {
    Runner test = new Runner();
    double[] laps = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    assertTrue(test.calculateIfItIsSuitable(laps));
  }

  @Test
  void calculateIfItIsSuitable_allBiggest() {
    Runner test = new Runner();
    double[] laps = {20, 30, 40, 50, 60, 10, 20, 30, 40, 50};

    assertFalse(test.calculateIfItIsSuitable(laps));
  }
}
