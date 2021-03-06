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

    assertEquals(exception.getMessage(), "Incorrect amount of sales");
  }

  @Test
  void calculateSalesBonus_IntegerSales_BonusIsCorrect() {
    double[] sales = {100, 100, 100};
    Employee test = new Employee(1, sales);

    assertEquals(30, test.calculateSalesBonus());
  }

  @Test
  void calculateSalesBonus_SalesWithDecimals_BonusIsCorrect() {
    double[] sales = {5_000.90, 4_050.78, 4_449.80};
    Employee test = new Employee(1, sales);

    assertEquals(1350.148, test.calculateSalesBonus());
  }

  @Test
  void calculateSalesBonus_NoSales_NoBonus() {
    double[] sales = {0, 0, 0};
    Employee test = new Employee(1, sales);

    assertEquals(0, test.calculateSalesBonus());
  }

  @Test
  void calculateNetSalary_IntegerSales_BonusIsCorrect() {
    double[] sales = {100, 100, 100};
    Employee test = new Employee(1, sales);

    assertEquals(10030, test.calculateNetSalary());
  }

  @Test
  void calculateNetSalary_SalesWithDecimals_SalaryIsCorrect() {
    double[] sales = {5000.90, 4050.78, 4449.80};
    Employee test = new Employee(1, sales);

    assertEquals(11350.148, test.calculateNetSalary());
  }

  @Test
  void calculateNetSalary_NoSales_OnlyBaseSalary() {
    double[] sales = {0, 0, 0};
    Employee test = new Employee(1, sales);

    assertEquals(10_000, test.calculateNetSalary());
  }
}
