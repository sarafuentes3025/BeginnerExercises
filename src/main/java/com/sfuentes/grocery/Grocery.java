package com.sfuentes.grocery;

public class Grocery {

  private double totalSales;
  private int clientsCount;

  public void sale(Client client) {

    totalSales += client.getItems()
        .stream()
        .mapToDouble(Item::getPrice).sum();

    clientsCount++;
  }

  public double getTotalSales() {
    return totalSales;
  }

  public int getClientsCount() {
    return clientsCount;
  }
}
