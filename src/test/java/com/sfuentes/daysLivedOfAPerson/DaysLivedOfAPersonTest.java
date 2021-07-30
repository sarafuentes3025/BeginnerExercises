package com.sfuentes.daysLivedOfAPerson;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DaysLivedOfAPersonTest {

  @Test
  void calculateLivedDays_noLeap() {
    DaysLivedOfAPerson leapYearTest = new DaysLivedOfAPerson();
    assertThat(leapYearTest.calculateLivedDays("2020/07/29")).isEqualTo(365);
  }

  @Test
  void calculateLivedDays_leap() {
    DaysLivedOfAPerson leapYearTest = new DaysLivedOfAPerson();
    assertThat(leapYearTest.calculateLivedDays("2019/07/29")).isEqualTo(731);
  }

  @Test
  void calculateLivedDays_stringMonthNotValid_ExceptionThrown() {
    DaysLivedOfAPerson daysLivedOfAPerson = new DaysLivedOfAPerson();
    assertThrows(IllegalArgumentException.class,
        () -> daysLivedOfAPerson.calculateLivedDays("2019/77/40"),
        "Date is invalid");
  }

  @Test
  void calculateLivedDays_stringDayNotValid_ExceptionThrown() {
    DaysLivedOfAPerson daysLivedOfAPerson = new DaysLivedOfAPerson();
    assertThrows(IllegalArgumentException.class,
        () -> daysLivedOfAPerson.calculateLivedDays("2019/7/40"),
        "Date is invalid");
  }

  @Test
  void calculateLivedDays_stringYearNotValid_ExceptionThrown() {
    DaysLivedOfAPerson daysLivedOfAPerson = new DaysLivedOfAPerson();
    assertThrows(IllegalArgumentException.class,
        () -> daysLivedOfAPerson.calculateLivedDays("a/02/29"),
        "Date is invalid");
  }
}
