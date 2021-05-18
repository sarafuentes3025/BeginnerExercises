package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

  @Test
  void test_exceptionIncorrectAmountOfSales() {
    double[] sales = {100.00, 100.00, 100.00, 100.00};

    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      Employee test = new Employee(1, sales);
    });

    String expectedMessage = "Incorrect amount of sales";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

  @Test
  void calculateSumSalary_integer() {
    double[] sales = {100.00, 100.00, 100.00};
    Employee test = new Employee(1, sales);
    double expected = 30.00;
    double actual = test.calculateSumSalary();

    assertEquals(expected, actual);
  }

  @Test
  void calculateSumSalary_decimal() {
    double[] sales = {5000.90, 4050.78, 4449.80};
    Employee test = new Employee(1, sales);
    double expected = 1350.148;
    double actual = test.calculateSumSalary();

    assertEquals(expected, actual);
  }

  @Test
  void calculateSumSalary_zero() {
    double[] sales = {0.0, 0.0, 0.0};
    Employee test = new Employee(1, sales);
    double expected = 0.0;
    double actual = test.calculateSumSalary();

    assertEquals(expected, actual);
  }

  @Test
  void calculateNetSalary_integer() {
    double[] sales = {100.00, 100.00, 100.00};
    Employee test = new Employee(1, sales);
    double expected = 10030.00;
    double actual = test.calculateNetSalary();

    assertEquals(expected, actual);
  }

  @Test
  void calculateNetSalary_Decimal() {
    double[] sales = {5000.90, 4050.78, 4449.80};
    Employee test = new Employee(1, sales);
    double expected = 11350.148;
    double actual = test.calculateNetSalary();

    assertEquals(expected, actual);
  }

  @Test
  void calculateNetSalary_zero() {
    double[] sales = {0.0, 0.0, 0.0};
    Employee test = new Employee(1, sales);
    double expected = 10000.0;
    double actual = test.calculateNetSalary();

    assertEquals(expected, actual);
  }


}
