package com.sfuentes;

public class InsuranceCompany {

  public double calculateCommission(double baseSalary, int numberOfEmployees) {
    double commission = 0.0;
    int i = 1;

    do {
      commission += (.10 * baseSalary) * 3;
      i++;
    } while (i <= numberOfEmployees);

    return commission;
  }

  public double calculateCommissionAndBaseSalary(double baseSalary, int numberOfEmployees) {
    double totalSalary = 0.0;
    int i = 1;
    do {
      totalSalary += ((.10 * baseSalary) * 3) + baseSalary;
      i++;
    } while (i <= numberOfEmployees);
    return totalSalary;
  }
}
