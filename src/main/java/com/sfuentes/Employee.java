package com.sfuentes;

public class Employee {

  int employeeId;
  final double baseSalary = 10_000;
  final double bonusPercentage = 10;
  double[] listSales;

  public Employee(int employeeId, double[] listSales) {
    this.employeeId = employeeId;

    if (listSales.length == 3)
      this.listSales = listSales;
    else
      throw new IllegalArgumentException("Incorrect amount of sales");
  }

  public double calculateSalesBonus() {
    double sumSales = 0;

    for (double listSale : listSales)
      sumSales += listSale;

    return sumSales * bonusPercentage / 100;
  }

  public double calculateNetSalary() {
    return baseSalary + calculateSalesBonus();
  }
}
