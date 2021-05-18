package com.sfuentes;

public class Employee {

  int employeeId;
  final double baseSalary = 10000.00;
  final double bonusPercentage = 10;
  double[] listSales;
  double netSalary;

  public Employee(int employeeId, double[] listSales) {
    this.employeeId = employeeId;

    if (listSales.length == 3)
      this.listSales = listSales;
    else
      throw new IllegalArgumentException("Incorrect amount of sales");
  }

  public double calculateSumSalary() {
    double sumSalary = 0.0;

    for (double listSale : listSales) {
      sumSalary += listSale;
    }
    return sumSalary * bonusPercentage / 100;
  }

  public double calculateNetSalary() {

    netSalary = baseSalary + calculateSumSalary();

    return netSalary;
  }


}
