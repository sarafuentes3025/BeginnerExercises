package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrangeShopTest {

  @Test
  void calculateFifteenPercentage_integerNumber() {
    OrangeShop client = new OrangeShop();

    assertEquals(15, client.calculateFifteenPercentage(100));
  }

  @Test
  void calculateFifteenPercentage_decimalNumber() {
    OrangeShop client = new OrangeShop();

    assertEquals(75.075, client.calculateFifteenPercentage(500.50));
  }

  @Test
  void calculateCustomerPayment_lessElevenKilos() {
    OrangeShop client = new OrangeShop();

    assertEquals(100.0, client.calculateCustomerPayment(10, 10));
  }

  @Test
  void calculateCustomerPayment_elevenKilos() {
    OrangeShop client = new OrangeShop();

    assertEquals(93.5, client.calculateCustomerPayment(10, 11));
  }

  @Test
  void calculateStoreSales_onlyTen() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {10, 10, 10, 10};

    assertEquals(400, client.calculateStoreSales(10, kilos));
  }

  @Test
  void calculateStoreSales_moreTen() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {100, 12, 20};

    assertEquals(1122, client.calculateStoreSales(10, kilos));
  }

  @Test
  void calculateStoreSales_differentKilos() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {1, 12, 10, 20, 100};

    assertEquals(1232, client.calculateStoreSales(10, kilos));
  }

  @Test
  void calculateStoreSales_zero() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {0, 0, 0, 0, 0};

    assertEquals(0.0, client.calculateStoreSales(10, kilos));
  }
}
