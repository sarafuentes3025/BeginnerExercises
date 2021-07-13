package com.sfuentes.grocery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryTest {

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_oneItem() {
    Client client = new Client(20d);
    client.addItem(new Item("Carrot", 10d));
    Grocery grocery = new Grocery();
    var sale = new Sale(client);
    grocery.processSale(sale);

    assertEquals(11.6, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_sameItems() {
    Client client = new Client(40d);
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Grocery grocery = new Grocery();
    var sale = new Sale(client);
    grocery.processSale(sale);

    assertEquals(34.8, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_differentItems() {
    Client client = new Client(100d);
    client.addItem(new Item("Orange", 10d));
    client.addItem(new Item("Potatoes", 20d));
    client.addItem(new Item("Eggs", 30d));
    client.addItem(new Item("Carrot", 9d));
    Grocery grocery = new Grocery();
    var sale = new Sale(client);
    grocery.processSale(sale);

    assertEquals(80.04, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_decimalPrice() {
    Client client = new Client(250);
    client.addItem(new Item("Orange", 82.3d));
    client.addItem(new Item("Potatoes", 80.5d));
    client.addItem(new Item("Eggs", 40.2d));
    Grocery grocery = new Grocery();
    var sale = new Sale(client);
    grocery.processSale(sale);

    assertEquals(235.48d, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_twoClient_oneItem() {
    Client client1 = new Client(100);
    client1.addItem(new Item("Orange", 10d));

    Client client2 = new Client(100);
    client2.addItem(new Item("Orange", 82d));

    Grocery grocery = new Grocery();
    var sale1 = new Sale(client1);
    var sale2 = new Sale(client2);
    grocery.processSale(sale1);
    grocery.processSale(sale2);

    assertEquals(106.72d, grocery.getTotalSales());
    assertEquals(2, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_twoClient_differentItems() {
    Client client1 = new Client(100);
    client1.addItem(new Item("Orange", 10d));
    client1.addItem(new Item("Potatoes", 7d));
    client1.addItem(new Item("Eggs", 30d));
    client1.addItem(new Item("Carrot", 9d));

    Client client2 = new Client(300);
    client2.addItem(new Item("Orange", 82d));
    client2.addItem(new Item("Potatoes", 80d));
    client2.addItem(new Item("Eggs", 40d));
    Grocery grocery = new Grocery();
    var sale1 = new Sale(client1);
    var sale2 = new Sale(client2);
    grocery.processSale(sale1);
    grocery.processSale(sale2);

    assertEquals(299.28d, grocery.getTotalSales());
    assertEquals(2, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_twoClient_sameItems() {
    Client client1 = new Client(30);
    client1.addItem(new Item("Orange", 10d));
    client1.addItem(new Item("Orange", 10d));

    Client client2 = new Client(400);
    client2.addItem(new Item("Orange", 82d));
    client2.addItem(new Item("Orange", 82d));
    Grocery grocery = new Grocery();
    var sale1 = new Sale(client1);
    var sale2 = new Sale(client2);
    grocery.processSale(sale1);
    grocery.processSale(sale2);

    assertEquals(213.44d, grocery.getTotalSales());
    assertEquals(2, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_fourClient_decimalPrice() {
    Client client1 = new Client(20);
    client1.addItem(new Item("Orange", 10.1d));
    client1.addItem(new Item("Eggs", 5.1d));

    Client client2 = new Client(100);
    client2.addItem(new Item("Potatoes", 82.2d));
    client2.addItem(new Item("Carrot", 17.2d));

    Client client3 = new Client(20);
    client3.addItem(new Item("Candies", 9.3d));
    client3.addItem(new Item("Beef", 7.3d));

    Client client4 = new Client(40);
    client4.addItem(new Item("Beet", 14.2d));
    client4.addItem(new Item("Onion", 12.1d));

    Grocery grocery = new Grocery();
    var sale1 = new Sale(client1);
    var sale2 = new Sale(client2);
    var sale3 = new Sale(client3);
    var sale4 = new Sale(client4);
    grocery.processSale(sale1);
    grocery.processSale(sale2);
    grocery.processSale(sale3);
    grocery.processSale(sale4);

    assertEquals(182.7d, grocery.getTotalSales());
    assertEquals(4, grocery.getClientsCount());
  }
}
