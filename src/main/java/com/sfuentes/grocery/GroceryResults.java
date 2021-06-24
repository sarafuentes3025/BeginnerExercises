package com.sfuentes.grocery;

import java.util.Objects;

public class GroceryResults {

  double totalSales;
  int clientsCount;

  public GroceryResults(double totalSales, int salesCount) {
    this.totalSales = totalSales;
    this.clientsCount = salesCount;
  }

  public double getTotalSales() {
    return totalSales;
  }

  public int getClientsCount() {
    return clientsCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof GroceryResults)) return false;
    GroceryResults that = (GroceryResults) o;
    return Double.compare(that.getTotalSales(), getTotalSales()) == 0 && getClientsCount() == that.getClientsCount();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTotalSales(), getClientsCount());
  }
}
