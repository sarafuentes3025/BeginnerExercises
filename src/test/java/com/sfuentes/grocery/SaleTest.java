package com.sfuentes.grocery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTest {

  @Test
  void calculateSubtotal_oneItemWithIntegerPrice() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(10d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_oneItemWithDecimalPrice() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10.5d));
    Sale sale = new Sale(client);

    assertEquals(10.5d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_differentItemsWithIntegerPrice_integerSubtotal() {
    Client client = new Client(100d);
    client.addItem(new Item("Orange", 10d));
    client.addItem(new Item("Potatoes", 20d));
    client.addItem(new Item("Eggs", 30d));
    client.addItem(new Item("Carrot", 9d));
    Sale sale = new Sale(client);

    assertEquals(69d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_differentItemsWithDecimalPrice_integerSubtotal() {
    Client client = new Client(250d);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    Sale sale = new Sale(client);

    assertEquals(203d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_differentItemsWithDecimalPrice_decimalSubtotal() {
    Client client = new Client(250d);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    client.addItem(new Item("Apple", 15.5d));

    Sale sale = new Sale(client);

    assertEquals(218.5d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_sameItemsWithIntegerPrice_integerSubtotal() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(30d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_sameItemsWithDecimalPrice_decimalSubtotal() {
    Client client = new Client(50d);
    client.addItem(new Item("Apple", 15.5d));
    client.addItem(new Item("Apple", 15.5d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(46.5d, sale.getSubtotal());
  }

  @Test
  void calculateSubtotal_differentItemsWithDecimalAndIntegerPrice_decimalSubtotal() {
    Client client = new Client(50d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(25.5d, sale.getSubtotal());
  }

  @Test
  void calculateTax_oneItemWithIntegerPrice() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(1.6d, sale.getTax());
  }

  @Test
  void calculateTax_oneItemWithDecimalPrice() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10.5d));
    Sale sale = new Sale(client);

    assertEquals(1.68d, sale.getTax());
  }

  @Test
  void calculateTax_differentItemsWithIntegerPrice() {
    Client client = new Client(100d);
    client.addItem(new Item("Orange", 10d));
    client.addItem(new Item("Potatoes", 20d));
    client.addItem(new Item("Eggs", 30d));
    client.addItem(new Item("Carrot", 9d));
    Sale sale = new Sale(client);

    assertEquals(11.04d, sale.getTax());
  }

  @Test
  void calculateTax_differentItemsWithDecimalPrice() {
    Client client = new Client(250d);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    Sale sale = new Sale(client);

    assertEquals(32.48d, sale.getTax());
  }

  @Test
  void calculateTax_sameItemsWithIntegerPrice() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(4.8d, sale.getTax());
  }

  @Test
  void calculateTax_sameItemsWithDecimalPrice() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Apple", 15.5d));
    client.addItem(new Item("Apple", 15.5d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(7.44d, sale.getTax());
  }

  @Test
  void calculateTax_differentItemsWithDecimalAndIntegerPrice() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(4.08d, sale.getTax());
  }

  @Test
  void calculateTotalSale_oneItemWithIntegerPrice() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(11.6d, sale.getTotalSale());
  }

  @Test
  void calculateTotalSale_oneItemWithDecimalPrice() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10.5d));
    Sale sale = new Sale(client);

    assertEquals(12.18d, sale.getTotalSale());
  }

  @Test
  void calculateTotalSale_differentItemsWithIntegerPrice() {
    Client client = new Client(100d);
    client.addItem(new Item("Orange", 10d));
    client.addItem(new Item("Potatoes", 20d));
    client.addItem(new Item("Eggs", 30d));
    client.addItem(new Item("Carrot", 9d));
    Sale sale = new Sale(client);

    assertEquals(80.04d, sale.getTotalSale());
  }

  @Test
  void calculateTotalSale_differentItemsWithDecimalPrice() {
    Client client = new Client(250d);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    Sale sale = new Sale(client);

    assertEquals(235.48d, sale.getTotalSale());
  }

  @Test
  void calculateTotalSale_sameItemsWithIntegerPrice() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(34.8d, sale.getTotalSale());
  }

  @Test
  void calculateTotalSale_sameItemsWithDecimalPrice() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Apple", 15.5d));
    client.addItem(new Item("Apple", 15.5d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(53.94d, sale.getTotalSale());
  }

  @Test
  void calculateTotalSale_differentItemsWithDecimalAndIntegerPrice() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(29.58d, sale.getTotalSale());
  }

  @Test
  void calculateChange_oneItemWithIntegerPrice_change() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(8.4d, sale.getChange());
  }

  @Test
  void calculateChange_oneItemWithDecimalPrice_change() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10.5d));
    Sale sale = new Sale(client);

    assertEquals(7.82d, sale.getChange());
  }

  @Test
  void calculateChange_differentItemsWithDecimalPrice_change() {
    Client client = new Client(250d);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    Sale sale = new Sale(client);

    assertEquals(14.52d, sale.getChange());
  }

  @Test
  void calculateChange_differentItemsWithIntegerPrice_change() {
    Client client = new Client(100d);
    client.addItem(new Item("Orange", 10d));
    client.addItem(new Item("Potatoes", 20d));
    client.addItem(new Item("Eggs", 30d));
    client.addItem(new Item("Carrot", 9d));
    Sale sale = new Sale(client);

    assertEquals(19.96d, sale.getChange());
  }

  @Test
  void calculateChange_sameItemsWithIntegerPrice_change() {
    Client client = new Client(50d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(15.2d, sale.getChange());
  }

  @Test
  void calculateChange_oneItemWithIntegerPrice_noChange() {
    Client client = new Client(11.6d);
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(0d, sale.getChange());
  }

  @Test
  void calculateChange_oneItemWithDecimalPrice_noChange() {
    Client client = new Client(12.18d);
    client.addItem(new Item("Carrot", 10.5d));
    Sale sale = new Sale(client);

    assertEquals(0d, sale.getChange());
  }

  @Test
  void calculateChange_differentItemsWithDecimalPrice_noChange() {
    Client client = new Client(235.48d);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    Sale sale = new Sale(client);

    assertEquals(0d, sale.getChange());
  }

  @Test
  void calculateChange_sameItemsWithIntegerPrice_noChange() {
    Client client = new Client(34.8d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Sale sale = new Sale(client);

    assertEquals(0d, sale.getChange());
  }

  @Test
  void calculateChange_differentItemsWithDecimalAndIntegerPrice_change() {
    Client client = new Client(30d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(0.42d, sale.getChange());
  }

  @Test
  void calculateChange_differentItemsWithDecimalAndIntegerPrice_noChange() {
    Client client = new Client(29.58d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Apple", 15.5d));
    Sale sale = new Sale(client);

    assertEquals(0d, sale.getChange());
  }
}
