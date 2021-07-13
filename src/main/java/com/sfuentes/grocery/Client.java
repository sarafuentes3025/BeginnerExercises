package com.sfuentes.grocery;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter

public class Client {
  private final List<Item> items = new ArrayList<>();
  private final double payment;

  public void addItem(Item item) {
    items.add(item);
  }
}
