package com.sfuentes.date;

import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

@Getter
public class DateProgram {

  private String result;
  private int weekday;
  private int dayOfMonth;
  private int month;
  private int year;

  DayOfWeek dayOfMonthText;

  public void convertDateToWords(String date) {

    var listOfStr = Arrays.asList(date.split("/"));
    weekday = Integer.parseInt(listOfStr.get(0));
    dayOfMonth = Integer.parseInt(listOfStr.get(1));
    month = Integer.parseInt(listOfStr.get(2));
    year = Integer.parseInt(listOfStr.get(3));

    var localDate = LocalDate.of(dayOfMonth, month, year);

    result = localDate.getDayOfWeek()
        + "/" + NumberInWords.convertNumberToWords(dayOfMonth).toUpperCase()
        + "/" + localDate.getMonth()
        + "/" + NumberInWords.convertNumberToWords(year).toUpperCase();
  }
}