package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDownByTwosTest {

  @Test
  void calculateCountDownByTwos_startOneHundred() {
    CountDownByTwos test = new CountDownByTwos(100);

    assertEquals(2550, test.calculateCountDownByTwos());
  }

  @Test
  void calculateCountDownByTwos_startOne() {
    CountDownByTwos test = new CountDownByTwos(1);

    assertEquals(1, test.calculateCountDownByTwos());
  }

  @Test
  void calculateCountDownByTwos_evenNumber_startTen() {
    CountDownByTwos test = new CountDownByTwos(10);

    assertEquals(30, test.calculateCountDownByTwos());
  }

  @Test
  void calculateCountDownByTwos_oddNumber_startNine() {
    CountDownByTwos test = new CountDownByTwos(9);

    assertEquals(25, test.calculateCountDownByTwos());
  }

  @Test
  void calculateCountDownByTwos_startZero() {
    CountDownByTwos test = new CountDownByTwos(0);

    assertEquals(0, test.calculateCountDownByTwos());
  }


}
