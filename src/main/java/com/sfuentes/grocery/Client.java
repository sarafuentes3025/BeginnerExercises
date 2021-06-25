package com.sfuentes.grocery;

import java.util.ArrayList;
import java.util.List;

public class Client {
  private final List<Item> items= new ArrayList<>();

  public void addItem(Item item) {
    items.add(new Item(item.getNameItem(), item.getPrice()));
  }

  public List<Item> getItems() {
    return items;
  }
}
