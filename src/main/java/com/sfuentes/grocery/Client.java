package com.sfuentes.grocery;

import java.util.List;

public class Client {
  List<Item> items;

  public Client(List<Item> items) {
    this.items = items;
  }

  public List<Item> getItems() {
    return items;
  }
}
