package com.sfuentes.daysLivedOfAPerson;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

public class DaysLivedOfAPerson {

  long daysLived;

  public long calculateLivedDays(String date) {
    var now = LocalDate.now();

    try {
      var birthDate = parse(date, ofPattern("yyyy/MM/dd"));
      daysLived = ChronoUnit.DAYS.between(birthDate, now);
    } catch (DateTimeException | NumberFormatException e) {
      throw new IllegalArgumentException("Date is invalid");
    }

    return daysLived;
  }
}
