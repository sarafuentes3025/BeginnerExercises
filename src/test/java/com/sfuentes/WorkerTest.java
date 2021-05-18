package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {

  @Test
  void calculateSalary_OneHour_TwoHundredPerHour() {
    Worker test = new Worker(1, 1);
    assertEquals(200, test.calculateSalary());
  }

  @Test
  void calculateSalary_FortyHours_TwoHundredPerHour() {
    Worker test = new Worker(1, 40);
    assertEquals(8000, test.calculateSalary());
  }

  @Test
  void calculateSalary_FortyOneHours_OnlyOneHourForTwoHundredAndFifty() {
    Worker test = new Worker(1, 41);
    assertEquals(8250, test.calculateSalary());
  }

  @Test
  void calculateSalary_NoHours_NoSalary() {
    Worker test = new Worker(1, 0);
    assertEquals(0, test.calculateSalary());
  }
}
