package com.sfuentes.grocery;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Item)) return false;
    Item item = (Item) o;
    return Double.compare(item.getPrice(), getPrice()) == 0 && Objects.equals(getNameItem(), item.getNameItem());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNameItem(), getPrice());
  }
}
