package com.sfuentes.grocery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryTest {

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_oneItem() {
    Client client = new Client();
    client.addItem(new Item("Carrot", 10d));
    Grocery grocery = new Grocery();
    grocery.sale(client);

    assertEquals(10, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_sameItems() {
    Client client = new Client();
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    client.addItem(new Item("Carrot", 10d));
    Grocery grocery = new Grocery();
    grocery.sale(client);

    assertEquals(30, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_differentItems() {
    Client client = new Client();
    client.addItem(new Item("Orange", 10d));
    client.addItem(new Item("Potatoes", 7d));
    client.addItem(new Item("Eggs", 30d));
    client.addItem(new Item("Carrot", 9d));
    Grocery grocery = new Grocery();
    grocery.sale(client);

    assertEquals(56, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_oneClient_decimalPrice() {
    Client client = new Client();
    client.addItem(new Item("Orange", 82.1d));
    client.addItem(new Item("Potatoes", 80.2d));
    client.addItem(new Item("Eggs", 40.5d));
    Grocery grocery = new Grocery();
    grocery.sale(client);

    assertEquals(202.8d, grocery.getTotalSales());
    assertEquals(1, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_twoClient_oneItem() {
    Client client1 = new Client();
    client1.addItem(new Item("Orange", 10d));

    Client client2 = new Client();
    client2.addItem(new Item("Orange", 82d));

    Grocery grocery = new Grocery();
    grocery.sale(client1);
    grocery.sale(client2);

    assertEquals(92d, grocery.getTotalSales());
    assertEquals(2, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_twoClient_differentItems() {
    Client client1 = new Client();
    client1.addItem(new Item("Orange", 10d));
    client1.addItem(new Item("Potatoes", 7d));
    client1.addItem(new Item("Eggs", 30d));
    client1.addItem(new Item("Carrot", 9d));

    Client client2 = new Client();
    client2.addItem(new Item("Orange", 82d));
    client2.addItem(new Item("Potatoes", 80d));
    client2.addItem(new Item("Eggs", 40d));
    Grocery grocery = new Grocery();
    grocery.sale(client1);
    grocery.sale(client2);

    assertEquals(258d, grocery.getTotalSales());
    assertEquals(2, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_twoClient_sameItems() {
    Client client1 = new Client();
    client1.addItem(new Item("Orange", 10d));
    client1.addItem(new Item("Orange", 10d));

    Client client2 = new Client();
    client2.addItem(new Item("Orange", 82d));
    client2.addItem(new Item("Orange", 82d));
    Grocery grocery = new Grocery();
    grocery.sale(client1);
    grocery.sale(client2);

    assertEquals(184d, grocery.getTotalSales());
    assertEquals(2, grocery.getClientsCount());
  }

  @Test
  void getTotalAmountSalesAndClientsCount_fourClient_decimalPrice() {
    Client client1 = new Client();
    client1.addItem(new Item("Orange", 10.1d));
    client1.addItem(new Item("Eggs", 5.1d));

    Client client2 = new Client();
    client2.addItem(new Item("Potatoes", 82.2d));
    client2.addItem(new Item("Carrot", 17.2d));

    Client client3 = new Client();
    client3.addItem(new Item("Candies", 9.3d));
    client3.addItem(new Item("Beef", 7.3d));

    Client client4 = new Client();
    client4.addItem(new Item("Beet", 14.2d));
    client4.addItem(new Item("Onion", 12.1d));

    Grocery grocery = new Grocery();
    grocery.sale(client1);
    grocery.sale(client2);
    grocery.sale(client3);
    grocery.sale(client4);

    assertEquals(157.5d, grocery.getTotalSales());
    assertEquals(4, grocery.getClientsCount());
  }

}
