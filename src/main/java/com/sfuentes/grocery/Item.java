package com.sfuentes.grocery;

public class Item {

  String nameItem;
  double price;

  public Item(String nameItem, double price) {
    this.nameItem = nameItem;
    this.price = price;
  }

  public String getNameItem() {
    return nameItem;
  }

  public double getPrice() {
    return price;
  }
}
