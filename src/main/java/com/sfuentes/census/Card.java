package com.sfuentes.census;

import lombok.Getter;

@Getter
public class Card {

  private final int censusNumber;
  private final String gender;
  private final int age;
  private final String civilStatus;

  public Card(int censusNumber, String gender, int age, String civilStatus) {
    gender = gender.toLowerCase();
    civilStatus = civilStatus.toLowerCase();

    this.censusNumber = censusNumber;
    this.age = age;

    if (gender.equals("female") || gender.equals("male"))
      this.gender = gender;
    else
      throw new IllegalArgumentException("Incorrect gender");

    if (civilStatus.equals("single") || civilStatus.equals("married")
        || civilStatus.equals("widower") || civilStatus.equals("divorced"))
      this.civilStatus = civilStatus;
    else
      throw new IllegalArgumentException("Incorrect civil status");
  }
}
