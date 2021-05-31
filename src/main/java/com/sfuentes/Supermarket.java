package com.sfuentes;

import java.util.Map;

public class Supermarket {

  Map<String, Double> items;

  public Supermarket(Map<String, Double> items) {
    this.items = items;
  }

  public String getTotalPurchases() {
    double totalToPay = 0;
    for (double item : items.values())
      totalToPay += item;

    return "Number of items: " + items.size() + ", Total to pay: " + totalToPay;
  }
}
