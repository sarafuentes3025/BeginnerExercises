package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

  @Test
  void amountSales_InvalidAmount_ExceptionThrown() {
    double[] sales = {100, 100, 100, 100};

    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      Employee test = new Employee(1, sales);
    });

    String expectedMessage = "Incorrect amount of sales";

    assertEquals(exception.getMessage(), expectedMessage);
  }

  @Test
  void calculateSalesBonus_IntegerSales_Equals() {
    double[] sales = {100, 100, 100};
    Employee test = new Employee(1, sales);

    assertEquals(30, test.calculateSalesBonus());
  }

  @Test
  void calculateSalesBonus_DecimalSales_Equals() {
    double[] sales = {5_000.90, 4_050.78, 4_449.80};
    Employee test = new Employee(1, sales);

    assertEquals(1350.148, test.calculateSalesBonus());
  }

  @Test
  void calculateSalesBonus_ZeroSales_Equals() {
    double[] sales = {0, 0, 0};
    Employee test = new Employee(1, sales);

    assertEquals(0, test.calculateSalesBonus());
  }

  @Test
  void calculateNetSalary_IntegerSales_Equals() {
    double[] sales = {100, 100, 100};
    Employee test = new Employee(1, sales);

    assertEquals(10030, test.calculateNetSalary());
  }

  @Test
  void calculateNetSalary_DecimalSales_Equals() {
    double[] sales = {5000.90, 4050.78, 4449.80};
    Employee test = new Employee(1, sales);

    assertEquals(11350.148, test.calculateNetSalary());
  }

  @Test
  void calculateNetSalary_ZeroSales_Equals() {
    double[] sales = {0, 0, 0};
    Employee test = new Employee(1, sales);

    assertEquals(10_000, test.calculateNetSalary());
  }
}
