package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarVerificationTest {

  @Test
  void calculateAverage_differentPoints() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {10, 20, 30, 40, 50};

    assertEquals(30, test.calculateAverage(pollutingPoints));
  }

  @Test
  void calculateAverage_samePoints() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {20, 20, 20, 20, 20};

    assertEquals(20, test.calculateAverage(pollutingPoints));
  }

  @Test
  void calculateAverage_zero() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {0, 0, 0, 0, 0};

    assertEquals(0.0, test.calculateAverage(pollutingPoints));
  }

  @Test
  void calculateSmallestPoint_firstSmallest() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250};

    assertEquals(10, test.calculateSmallestPoint(pollutingPoints));
  }

  @Test
  void calculateSmallestPoint_endSmallest() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {250, 240, 230, 220, 210, 200, 190, 180, 170, 160, 150, 140, 130, 120, 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

    assertEquals(10, test.calculateSmallestPoint(pollutingPoints));
  }

  @Test
  void calculateSmallestPoint_zero() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {0, 0, 0, 0, 0};

    assertEquals(0, test.calculateSmallestPoint(pollutingPoints));
  }

  @Test
  void calculateSmallestPoint_middleSmallest() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {30, 20, 10, 50, 100};

    assertEquals(10, test.calculateSmallestPoint(pollutingPoints));
  }

  @Test
  void calculateSmallestPoint_sameSmallestPoints() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {40, 40, 40, 40, 40};

    assertEquals(40, test.calculateSmallestPoint(pollutingPoints));
  }

  @Test
  void calculateTopPoint_endTop() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250};

    assertEquals(250, test.calculateTopPoint(pollutingPoints));
  }

  @Test
  void calculateTopPoint_firstTop() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {250, 240, 230, 220, 210, 200, 190, 180, 170, 160, 150, 140, 130, 120, 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

    assertEquals(250, test.calculateTopPoint(pollutingPoints));
  }

  @Test
  void calculateTopPoint_sameTopPoints() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {50, 50, 50, 50, 50};

    assertEquals(50, test.calculateTopPoint(pollutingPoints));
  }

  @Test
  void calculateTopPoint_zero() {
    CarVerification test = new CarVerification();
    int[] pollutingPoints = {0, 0, 0, 0, 0};

    assertEquals(0, test.calculateTopPoint(pollutingPoints));
  }
}
