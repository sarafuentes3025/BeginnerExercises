package com.sfuentes.grocery;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Item {
  private final String nameItem;
  private final double price;
}
