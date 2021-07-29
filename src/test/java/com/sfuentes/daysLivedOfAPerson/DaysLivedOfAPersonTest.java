package com.sfuentes.daysLivedOfAPerson;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DaysLivedOfAPersonTest {

  @Test
  void calculateDaysLived_noLeap() {
    DaysLivedOfAPerson leapYearTest = new DaysLivedOfAPerson("2020/07/29");
    assertThat(leapYearTest.calculateDaysLived()).isEqualTo(365);
  }

  @Test
  void calculateDaysLived_leap() {
    DaysLivedOfAPerson leapYearTest = new DaysLivedOfAPerson("2019/07/29");
    assertThat(leapYearTest.calculateDaysLived()).isEqualTo(731);
  }

  @Test
  void calculateDaysLived_stringMonthNotValid_ExceptionThrown() {
    assertThrows(DateTimeException.class,
        new DaysLivedOfAPerson("2019/77/29")::calculateDaysLived, "Date is invalid");
  }

  @Test
  void calculateDaysLived_stringDayNotValid_ExceptionThrown() {
    assertThrows(DateTimeException.class,
        new DaysLivedOfAPerson("2019/7/40")::calculateDaysLived, "Date is invalid");
  }

  @Test
  void calculateDaysLived_stringYearNotValid_ExceptionThrown() {
    assertThrows(NumberFormatException.class,
        new DaysLivedOfAPerson("a/02/29")::calculateDaysLived, "Date is invalid");
  }
}
