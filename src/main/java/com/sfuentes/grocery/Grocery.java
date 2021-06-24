package com.sfuentes.grocery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grocery {

  Map<String, Double> items;
  double totalSales;
  int clientsCount;

  public Grocery() {
    this.items = new HashMap<>();
  }

  public void addItems(Item item) {
    if (items.containsKey(item.getNameItem()))
      items.put(item.getNameItem(), items.get(item.getNameItem()) + item.getPrice());
    else
      items.put(item.getNameItem(), item.getPrice());
  }

  public double calculateTotalPerClient() {
    return items.values().stream().mapToDouble(d -> d).sum();
  }

  public GroceryResults calculateTotalSalesAndClientCount(List<Client> clients) {
    GroceryResults results = new GroceryResults(totalSales, clientsCount);
    Grocery grocery = new Grocery();

    for (Client client : clients)
      for (Item item : client.getItems())
        grocery.addItems(new Item(item.nameItem, item.getPrice()));
    results.totalSales += grocery.calculateTotalPerClient();

    results.clientsCount = clients.size();

    return results;
  }
}
