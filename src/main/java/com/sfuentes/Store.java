package com.sfuentes;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Store {

  public final String item;
  public final double price;
  public final String color;

  public double getPrice() {
    double totalPrice = 0;
    switch (color.toLowerCase()) {
      case "red" -> totalPrice = price - price * .40;
      case "yellow" -> totalPrice = price - price * .25;
      case "white" -> totalPrice = price;
    }
    return totalPrice;
  }
}
