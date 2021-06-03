package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupermarketTest {

  @Test
  void calculateTotal_duplicatedItems_integerResult() {
    Supermarket cart = new Supermarket();
    cart.addItems("pizza: ", 10d);
    cart.addItems("pizza: ", 10d);
    cart.addItems("pizza: ", 10d);
    cart.addItems("pizza: ", 10d);
    assertEquals(40, cart.calculateTotal());
  }

  @Test
  void calculateTotal_differentItems_decimalResult() {
    Supermarket cart = new Supermarket();
    cart.addItems("pizza: ", 10.1d);
    cart.addItems("juice: ", 2d);
    cart.addItems("sugar: ", 1d);
    cart.addItems("chocolate chips: ", .1d);
    cart.addItems("fish: ", 20d);
    cart.addItems("cookies: ", 5d);
    cart.addItems("beans: ", 4d);
    cart.addItems("milk: ", 2d);
    cart.addItems("granola: ", 6d);
    cart.addItems("tea: ", 13d);
    cart.addItems("deodorant: ", 12d);
    assertEquals(75.2d, cart.calculateTotal());
  }

  @Test
  void calculateTotal_zeroPrice_zeroResult() {
    Supermarket cart = new Supermarket();
    cart.addItems("", 0d);
    cart.addItems("", 0d);
    assertEquals(0.0d, cart.calculateTotal());
  }
}
