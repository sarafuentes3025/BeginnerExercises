package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupermarketTest {

  @Test
  void getTotalPurchases_11Items_totalToPay() {
    Map<String, Double> items = new HashMap<>();
    items.put("pizza: ", 10d);
    items.put("juice: ", 2d);
    items.put("sugar: ", 1d);
    items.put("chocolate chips: ", .70d);
    items.put("fish: ", 20d);
    items.put("cookies: ", 5d);
    items.put("beans: ", 4d);
    items.put("milk: ", 2d);
    items.put("granola: ", 6d);
    items.put("tea: ", 13d);
    items.put("deodorant: ", 12d);

    Supermarket test = new Supermarket(items);
    assertEquals("Number of items: 11, Total to pay: 75.7", test.getTotalPurchases());
  }

  @Test
  void getTotalPurchases_noItems_zeroTotalToPay() {
    Map<String, Double> items = new HashMap<>();

    Supermarket test = new Supermarket(items);
    assertEquals("Number of items: 0, Total to pay: 0.0", test.getTotalPurchases());
  }
}
