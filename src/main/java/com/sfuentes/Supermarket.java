package com.sfuentes;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {

  Map<String, Double> cart;

  public Supermarket() {
    this.cart = new HashMap<>();
  }

  public void addItems(String item, double price) {
    if (cart.containsKey(item))
      cart.put(item, cart.get(item) + price);
    else
      cart.put(item, price);
  }

  public double calculateTotal() {
    return cart.values().stream().mapToDouble(d -> d).sum();
  }
}
