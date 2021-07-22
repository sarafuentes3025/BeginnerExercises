package com.sfuentes.date;

import lombok.RequiredArgsConstructor;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

@RequiredArgsConstructor
public class DateProgram {

  private final String date;

  public String convertDateToWords() {

    var listOfStr = Arrays.asList(date.split("/"));

    var localDate = LocalDate.of(
        Integer.parseInt(listOfStr.get(2)),
        Integer.parseInt(listOfStr.get(1)),
        Integer.parseInt(listOfStr.get(0)));

    String dateText;

    try {
      dateText = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    } catch (DateTimeException e) {
      throw new DateTimeException("Date is invalid");
    }

    return dateText;
  }
}