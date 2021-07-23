package com.sfuentes.date;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateProgramTest {

  @Test
  void convertDateToWords_stringDateValid() {
    DateProgram date = new DateProgram("21/7/2021");
    assertThat(date.convertDateToWords()).isEqualTo("Wednesday, July 21, 2021");
  }

  @Test
  void convertDateToWords_stringMonthNotValid_ExceptionThrown() {
    assertThrows(DateTimeException.class,
        new DateProgram("21/77/2021")::convertDateToWords, "Date is invalid");
  }

  @Test
  void convertDateToWords_stringDayNotValid_ExceptionThrown() {
    assertThrows(DateTimeException.class,
        new DateProgram("40/3/2021")::convertDateToWords, "Date is invalid");
  }

  @Test
  void convertDateToWords_stringYearNotValid_ExceptionThrown() {
    assertThrows(NumberFormatException.class,
        new DateProgram("10/3/a")::convertDateToWords, "Date is invalid");
  }
}
