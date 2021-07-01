package com.sfuentes.ticket;

import com.sfuentes.grocery.Client;
import com.sfuentes.grocery.Grocery;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Ticket {

  @NonNull
  private final Grocery grocery;
  private final Client client;
  private final double payment;

  private double vat;
  private double totalToPay;
  private double change;

  public void calculateVAT() {
    grocery.sale(client);
    vat = grocery.getTotalSales() * .16;
  }

  public void calculateTotalToPay() {
    totalToPay = vat + grocery.getTotalSales();
  }

  public void calculateChange() {
    change = payment - totalToPay;
  }

}
