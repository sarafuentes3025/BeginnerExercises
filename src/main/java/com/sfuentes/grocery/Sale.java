package com.sfuentes.grocery;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import static java.lang.Math.round;

@Getter
@EqualsAndHashCode
public class Sale {

  private final double subtotal;
  private final double payment;

  private final double tax;
  private final double totalSale;
  private final double change;

  public Sale(Client client) {
    this.subtotal = calculateSubtotal(client);
    payment = client.getPayment();
    tax = calculateTax();
    totalSale = calculateTotalSale();
    change = calculateChange();
  }

  double calculateSubtotal(Client client) {
    return client.getItems()
        .stream()
        .mapToDouble(Item::getPrice).sum();
  }

  double calculateTax() {
    return round((subtotal * .16) * 100.0) / 100.0;
  }

  double calculateTotalSale() {
    return round((subtotal + calculateTax()) * 100.0) / 100.0;
  }

  double calculateChange() {
    return round((payment - calculateTotalSale()) * 100.0) / 100.0;
  }
}
