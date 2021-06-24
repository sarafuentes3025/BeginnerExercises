package com.sfuentes.groceryTest;

import com.sfuentes.grocery.Client;
import com.sfuentes.grocery.Grocery;
import com.sfuentes.grocery.Item;
import com.sfuentes.grocery.GroceryResults;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryTest {

  @Test
  void calculateTotalPerClient_oneItem() {
    Grocery test = new Grocery();

    test.addItems(new Item("Apple", 10d));

    assertEquals(10d, test.calculateTotalPerClient());
  }

  @Test
  void calculateTotalPerClient_twoItems_sameItems() {
    Grocery test = new Grocery();

    test.addItems(new Item("Apple", 10d));
    test.addItems(new Item("Apple", 10d));

    assertEquals(20d, test.calculateTotalPerClient());
  }

  @Test
  void calculateTotalPerClient_twoItems_differentItems() {
    Grocery test = new Grocery();

    test.addItems(new Item("Orange", 10d));
    test.addItems(new Item("Potatoes", 7d));
    test.addItems(new Item("Eggs", 30d));
    test.addItems(new Item("Carrot", 9d));

    assertEquals(56d, test.calculateTotalPerClient());
  }

  @Test
  void calculateTotalSalesAndClientCount_oneClient_oneItem() {
    List<Item> itemsClient1 = List.of(new Item("Pea", 80d));
    List<Client> clients = List.of(new Client(itemsClient1));

    Grocery test = new Grocery();

    assertEquals(new GroceryResults(80d, 1), test.calculateTotalSalesAndClientCount(clients));
  }

  @Test
  void calculateTotalSalesAndClientCount_oneClient_decimalPrice() {
    List<Item> itemsClient1 = List.of(new Item("Pea", 82.1d), new Item("Olives", 80.2d), new Item("Pea", 40.5d));
    List<Client> clients = List.of(new Client(itemsClient1));

    Grocery test = new Grocery();

    assertEquals(new GroceryResults(202.8d, 1), test.calculateTotalSalesAndClientCount(clients));
  }

  @Test
  void calculateTotalSalesAndClientCount_oneClient_twoItems() {
    List<Item> itemsClient1 = List.of(new Item("Pea", 80d), new Item("Olives", 200d));
    List<Client> clients = List.of(new Client(itemsClient1));

    Grocery test = new Grocery();

    assertEquals(new GroceryResults(280d, 1), test.calculateTotalSalesAndClientCount(clients));
  }

  @Test
  void calculateTotalSalesAndClientCount_twoClients_oneItem() {
    List<Item> itemsClient1 = List.of(new Item("Candies", 100d));
    List<Item> itemsClient2 = List.of(new Item("Cherries", 20d));
    List<Client> clients = List.of(new Client(itemsClient1), new Client(itemsClient2));

    Grocery test = new Grocery();

    assertEquals(new GroceryResults(120d, 2), test.calculateTotalSalesAndClientCount(clients));
  }

  @Test
  void calculateTotalSalesAndClientCount_threeClients_fourItems() {
    List<Item> itemsClient1 = List.of(new Item("Grapes", 10d), new Item("Potatoes", 20d), new Item("Salad", 30d), new Item("Pancakes", 40d));
    List<Item> itemsClient2 = List.of(new Item("Tomato", 40d), new Item("Peanuts", 30d), new Item("Candies", 20d), new Item("Orange", 10d));
    List<Item> itemsClient3 = List.of(new Item("Potatoes", 30d), new Item("Salad", 10d), new Item("Grapes", 20d), new Item("Candies", 40d));
    List<Client> clients = List.of(new Client(itemsClient1), new Client(itemsClient2), new Client(itemsClient3));

    Grocery test = new Grocery();

    assertEquals(new GroceryResults(300d, 3), test.calculateTotalSalesAndClientCount(clients));
  }
}
