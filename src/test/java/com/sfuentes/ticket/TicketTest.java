package com.sfuentes.ticket;

import com.sfuentes.grocery.Client;
import com.sfuentes.grocery.Grocery;
import com.sfuentes.grocery.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

  @Test
  void ticket_decimalResults_returnChange() {
    Client client = new Client();
    client.addItem(new Item("Orange", 82.1d));
    client.addItem(new Item("Potatoes", 80.1d));
    client.addItem(new Item("Eggs", 40.3d));
    Grocery grocery = new Grocery();
    Ticket ticket = new Ticket(grocery, client, 1_000);
    ticket.calculateVAT();
    ticket.calculateTotalToPay();
    ticket.calculateChange();

    assertEquals(32.4, ticket.getVat());
    assertEquals(234.9, ticket.getTotalToPay());
    assertEquals(765.1, ticket.getChange());
  }

  @Test
  void ticket_decimalResults_noChange() {
    Client client = new Client();
    client.addItem(new Item("Orange", 82.1d));
    client.addItem(new Item("Potatoes", 80.1d));
    client.addItem(new Item("Eggs", 40.3d));
    Grocery grocery = new Grocery();
    Ticket ticket = new Ticket(grocery, client, 234.9);
    ticket.calculateVAT();
    ticket.calculateTotalToPay();
    ticket.calculateChange();

    assertEquals(32.4, ticket.getVat());
    assertEquals(234.9, ticket.getTotalToPay());
    assertEquals(0, ticket.getChange());
  }

  @Test
  void ticket_integerResults_returnChange() {
    Client client = new Client();
    client.addItem(new Item("Orange", 100d));
    Grocery grocery = new Grocery();
    Ticket ticket = new Ticket(grocery, client, 200d);
    ticket.calculateVAT();
    ticket.calculateTotalToPay();
    ticket.calculateChange();

    assertEquals(16, ticket.getVat());
    assertEquals(116, ticket.getTotalToPay());
    assertEquals(84, ticket.getChange());
  }

  @Test
  void ticket_integerResults_noChange() {
    Client client = new Client();
    client.addItem(new Item("Orange", 100d));
    Grocery grocery = new Grocery();
    Ticket ticket = new Ticket(grocery, client, 116d);
    ticket.calculateVAT();
    ticket.calculateTotalToPay();
    ticket.calculateChange();

    assertEquals(16, ticket.getVat());
    assertEquals(116, ticket.getTotalToPay());
    assertEquals(0, ticket.getChange());
  }
}
