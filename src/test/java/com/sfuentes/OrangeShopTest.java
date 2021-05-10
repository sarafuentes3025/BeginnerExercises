package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrangeShopTest {

  @Test
  void calculateFifteenPercentage_integerNumber() {
    OrangeShop client = new OrangeShop();
    int number = 100;
    double expectedResult = 15;

    assertEquals(expectedResult, client.calculateFifteenPercentage(number));
  }

  @Test
  void calculateFifteenPercentage_decimalNumber() {
    OrangeShop client = new OrangeShop();
    double number = 500.50;
    double expectedResult = 75.075;

    assertEquals(expectedResult, client.calculateFifteenPercentage(number));
  }

  @Test
  void calculateCustomerPayment_tenKilos() {
    OrangeShop client = new OrangeShop();
    double kilos = 10;
    double pricePerKilo = 10;
    double expectedResult = 100.0;

    assertEquals(expectedResult, client.calculateCustomerPayment(pricePerKilo, kilos));
  }

  @Test
  void calculateCustomerPayment_elevenKilos() {
    OrangeShop client = new OrangeShop();
    double kilos = 11;
    double pricePerKilo = 10;
    double expectedResult = 93.5;

    assertEquals(expectedResult, client.calculateCustomerPayment(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_onlyTen() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {10, 10, 10, 10};
    double pricePerKilo = 10;
    double expectedResult = 400;

    assertEquals(expectedResult, client.calculateStoreSales(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_moreTen() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {100, 12, 20};
    double pricePerKilo = 10;
    double expectedResult = 1122;

    assertEquals(expectedResult, client.calculateStoreSales(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_differentKilos() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {1, 12, 10, 20, 100};
    double pricePerKilo = 10;
    double expectedResult = 1232;

    assertEquals(expectedResult, client.calculateStoreSales(pricePerKilo, kilos));
  }

  @Test
  void calculateStoreSales_zero() {
    OrangeShop client = new OrangeShop();
    double[] kilos = {0, 0, 0, 0, 0};
    double pricePerKilo = 10;
    double expectedResult = 0.0;

    assertEquals(expectedResult, client.calculateStoreSales(pricePerKilo, kilos));
  }

}
