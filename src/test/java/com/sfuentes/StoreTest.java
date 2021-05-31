package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

  @Test
  void getPrice_redColor_fortyPercent() {
    Store test = new Store("Cap", 15d, "Red");
    assertEquals(9, test.getPrice());
  }

  @Test
  void getPrice_yellowColor_twentyFivePercent() {
    Store test = new Store("Bag", 20d, "Yellow");
    assertEquals(15, test.getPrice());
  }

  @Test
  void getPrice_whiteColor_NoPercent() {
    Store test = new Store("Belt", 12d, "White");
    assertEquals(12, test.getPrice());
  }

  @Test
  void getPrice_redColor_upperCase() {
    Store test = new Store("Gloves", 10d, "RED");
    assertEquals(6, test.getPrice());
  }

  @Test
  void getPrice_yellowColor_lowerCase() {
    Store test = new Store("Scarf", 12d, "yellow");
    assertEquals(9, test.getPrice());
  }

  @Test
  void getPrice_whiteColor_lowerCaseAndUpperCase() {
    Store test = new Store("Socks", 30d, "wHiTe");
    assertEquals(30, test.getPrice());
  }
}
