package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsuranceCompanyTest {

  @Test
  void calculateCommission_integer() {
    InsuranceCompany test = new InsuranceCompany();
    double expected = 9000.00;
    double actual = test.calculateCommission(10000.00, 3);

    assertEquals(expected, actual);
  }

  @Test
  void calculateCommission_decimal() {
    InsuranceCompany test = new InsuranceCompany();
    double expected = 4799.97;
    double actual = test.calculateCommission(15999.90, 1);

    assertEquals(expected, actual);
  }

  @Test
  void calculateCommission_zero() {
    InsuranceCompany test = new InsuranceCompany();
    double expected = 0.0;
    double actual = test.calculateCommission(0.0, 0);

    assertEquals(expected, actual);
  }

  @Test
  void calculateCommissionAndBaseSalary_integer() {
    InsuranceCompany test = new InsuranceCompany();
    double expected = 130000.00;
    double actual = test.calculateCommissionAndBaseSalary(10000.00, 10);

    assertEquals(expected, actual);
  }

  @Test
  void calculateCommissionAndBaseSalary_decimal() {
    InsuranceCompany test = new InsuranceCompany();
    double expected = 20799.87;
    double actual = test.calculateCommissionAndBaseSalary(15999.90, 1);

    assertEquals(expected, actual);
  }

  @Test
  void calculateCommissionAndBaseSalary_zero() {
    InsuranceCompany test = new InsuranceCompany();
    double expected = 0.0;
    double actual = test.calculateCommissionAndBaseSalary(0.0, 0);

    assertEquals(expected, actual);
  }
}
