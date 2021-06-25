package com.sfuentes.schoolGrades;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SubjectTest {
  @Test
  void scoresVariable_InvalidWeight_ExceptionThrown() {
    ArrayList<Double> scores = new ArrayList<>(Arrays.asList(8d, 8d, 8d, 8d));

    Exception exception = assertThrows(IllegalArgumentException.class, () -> new Subject("Mathematics", scores));

    assertEquals(exception.getMessage(), "Incorrect amount of scores");
  }

  @Test
  void calculateAverageBySubject_sameScore() {
    ArrayList<Double> scores = new ArrayList<>(Arrays.asList(8d, 8d, 8d));

    Subject test = new Subject("Mathematics", scores);
    assertEquals(8, test.calculateAverageBySubject());
  }

  @Test
  void calculateAverageBySubject_differentScore() {
    ArrayList<Double> scores = new ArrayList<>(Arrays.asList(10d, 8d, 9d));

    Subject test = new Subject("Mathematics", scores);
    assertEquals(9, test.calculateAverageBySubject());
  }
}
