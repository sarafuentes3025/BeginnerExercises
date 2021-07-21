package com.sfuentes.date;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DateProgramTest {

  @Test
  void convertDateToWords_compareDate() {
    DateProgram day = new DateProgram();
    day.convertDateToWords("3/21/7/21");

    assertThat(day.getResult()).contains("WEDNESDAY/TWENTY ONE/JULY/TWENTY ONE");
  }
}
