package com.sfuentes.daysLivedOfAPerson;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter
@RequiredArgsConstructor
public class DaysLivedOfAPerson {

  private final String date;
  long daysLived;

  public long calculateDaysLived() {
    var listOfStr = getDate().split("/");

    LocalDate now = LocalDate.now();
    LocalDate birthDate = LocalDate.of(
        Integer.parseInt(listOfStr[0]),
        Integer.parseInt(listOfStr[1]),
        Integer.parseInt(listOfStr[2])
    );

    try {
      daysLived = ChronoUnit.DAYS.between(birthDate, now);
    } catch (DateTimeException e) {
      throw new DateTimeException("Date is invalid");
    } catch (NumberFormatException e) {
      throw new NumberFormatException("Date is invalid");
    }

    return daysLived;
  }
}
