package com.sfuentes;

public class Store {

  String item;
  double price;
  String color;

  public Store(String item, double price, String color) {
    this.item = item;
    this.price = price;
    this.color = color;
  }

  public double getPrice() {
    double totalPrice = 0;
    switch (color.toLowerCase()) {
      case "red" -> totalPrice = price - (price * .40);
      case "yellow" -> totalPrice = price - (price * .25);
      case "white" -> totalPrice = price;
    }
    return totalPrice;
  }
}
