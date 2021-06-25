package com.sfuentes.grocery;

public class Grocery {

  double totalSales;
  int clientsCount;

  void sale(Client client) {
    for (Item item : client.getItems()) {
      totalSales += item.getPrice();
    }
    clientsCount++;
  }

  public double getTotalSales() {
    return totalSales;
  }

  public int getClientsCount() {
    return clientsCount;
  }
}
