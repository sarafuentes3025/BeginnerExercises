package com.sfuentes;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class Supermarket {

  final Map<String, Double> cart= new HashMap<>();

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
