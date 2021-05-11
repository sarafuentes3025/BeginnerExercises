package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrangeShopTest {

  @Test
  void calculateFifteenPercentage_integerNumber() {
    OrangeShop client = new OrangeShop();
    int number = 100;

    assertEquals(15, client.calculateFifteenPercentage(number));
  }

  @Test
  void calculateFifteenPercentage_decimalNumber() {
    OrangeShop client = new OrangeShop();
    double number = 500.50;

    assertEquals(75.075, client.calculateFifteenPercentage(number));
  }

  @Test
  void calculateCustomerPayment_lessElevenKilos() {
    OrangeShop client = new OrangeShop();
    double kilos = 10;
    double pricePerKilo = 10;

    assertEquals(100.0, client.calculateCustomerPayment(pricePerKilo, kilos));
  }

  @Test
  void calculateCustomerPayment_elevenKilos() {
    OrangeShop client = new OrangeShop();
    double kilos = 11;
    double pricePerKilo = 10;

    assertEquals(93.5, client.calculateCustomerPayment(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_onlyTen() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {10, 10, 10, 10};
    double pricePerKilo = 10;

    assertEquals(400, client.calculateStoreSales(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_moreTen() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {100, 12, 20};
    double pricePerKilo = 10;

    assertEquals(1122, client.calculateStoreSales(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_differentKilos() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {1, 12, 10, 20, 100};
    double pricePerKilo = 10;

    assertEquals(1232, client.calculateStoreSales(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_zero() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {0, 0, 0, 0, 0};
    double pricePerKilo = 10;

    assertEquals(0.0, client.calculateStoreSales(pricePerKilo, kilos));
  }
}
