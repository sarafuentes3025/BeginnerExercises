package com.sfuentes.census;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ResultCensusTest {

  @Test
  void getGender_differentGender_ExceptionThrown() {
    String gender = "Default";

    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new Card(1_000, gender, 20, "SINGLE"));

    assertEquals(exception.getMessage(), "Incorrect gender");
  }

  @Test
  void getCivilStatus_differentCivilStatus_ExceptionThrown() {
    String civilStatus = "Free Union";

    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new Card(1_000, "FEMALE", 20, civilStatus));

    assertEquals(exception.getMessage(), "Incorrect civil status");
  }

  @Test
  void addCensusNumberSingleWomenBetweenSixteenAndTwentyOne_femaleAndMale_upperCase() {
    var results = new ResultCensus();
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(1, "FEMALE", 16, "SINGLE"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(2, "MALE", 16, "SINGLE"));

    assertEquals(List.of(1), results.getCensusNumberCount());
  }

  @Test
  void addCensusNumberSingleWomenBetweenSixteenAndTwentyOne_femaleAndMale_lowerCase() {
    var results = new ResultCensus();
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(3, "female", 21, "single"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(4, "female", 18, "single"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(5, "female", 17, "married"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(6, "female", 19, "widower"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(7, "female", 20, "divorced"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(8, "male", 21, "single"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(9, "male", 19, "single"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(10, "male", 20, "married"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(11, "male", 17, "widower"));
    results.addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(
        new Card(12, "male", 40, "divorced"));
    assertEquals(List.of(3, 4), results.getCensusNumberCount());
  }
}
