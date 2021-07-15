package com.sfuentes.census;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CensusResultTest {

  @Test
  void newCard_differentGender_ExceptionThrown() {
    String gender = "Default";

    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new Card(1_000, gender, 20, "SINGLE"));

    assertEquals(exception.getMessage(), "Incorrect gender");
  }

  @Test
  void newCard_differentCivilStatus_ExceptionThrown() {
    String civilStatus = "Free Union";

    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new Card(1_000, "FEMALE", 20, civilStatus));

    assertEquals(exception.getMessage(), "Incorrect civil status");
  }

  @Test
  void filterOnlySingleFemaleAgeFrom16To21_femaleAndMale_upperCase() {
    var results = new CensusResult();
    Card female16Single = new Card(1, "FEMALE", 16, "SINGLE");
    results.filterOnlySingleFemaleAgeFrom16To21(
        female16Single);
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(2, "MALE", 16, "SINGLE"));

    assertThat(results.getCensusNumberCount())
        .containsExactlyInAnyOrder(female16Single);
  }

  @Test
  void filterOnlySingleFemaleAgeFrom16To21_femaleAndMale_lowerCase() {
    var results = new CensusResult();
    Card female21Single = new Card(3, "female", 21, "single");
    results.filterOnlySingleFemaleAgeFrom16To21(
        female21Single);

    Card female18Single = new Card(4, "female", 18, "single");
    results.filterOnlySingleFemaleAgeFrom16To21(
        female18Single);
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(5, "female", 17, "married"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(6, "female", 19, "widower"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(7, "female", 20, "divorced"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(8, "male", 21, "single"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(9, "male", 19, "single"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(10, "male", 20, "married"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(11, "male", 17, "widower"));
    results.filterOnlySingleFemaleAgeFrom16To21(
        new Card(12, "male", 40, "divorced"));

    assertThat(results.getCensusNumberCount())
        .containsExactlyInAnyOrder(female21Single, female18Single);

  }
}
