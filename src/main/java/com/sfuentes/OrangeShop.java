package com.sfuentes;

public class OrangeShop {

  public double calculateFifteenPercentage(double number) {
    return .15 * number;
  }

  public double calculateCustomerPayment(double pricePerKilo, double kilos) {
    double total = pricePerKilo * kilos;
    return kilos > 10 ? total - calculateFifteenPercentage(total) : total;
  }

  public double calculateStoreSales(double pricePerKilo, double[] kilos) {
    double total = 0;
    for (double kilo : kilos) {
      total += calculateCustomerPayment(pricePerKilo, kilo);
    }
    return total;
  }

}
