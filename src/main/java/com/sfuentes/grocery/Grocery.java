package com.sfuentes.grocery;

import lombok.Getter;

@Getter
public class Grocery {

  private double totalSales;
  private int clientsCount;

  public void processSale(Sale sale) {
    totalSales += sale.getTotalSale();
    clientsCount++;
  }
}
