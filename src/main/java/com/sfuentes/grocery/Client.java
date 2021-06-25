package com.sfuentes.grocery;

import java.util.ArrayList;
import java.util.List;

public class Client {
  List<Item> items;

  void addItem(Item item) {
    if (this.items == null)
      items = new ArrayList<>();
    items.add(new Item(item.getNameItem(), item.getPrice()));
  }

  public List<Item> getItems() {
    return items;
  }
}
