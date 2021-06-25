package com.sfuentes.schoolGrades;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {

  @Test
  void calculateAverageAllGrades_sameAverageByGrade() {
    ArrayList<Double> grades = new ArrayList<>(Arrays.asList(8d, 8d, 8d));

    School test = new School(grades);
    assertEquals(8, test.calculateAverageAllGrades());
  }

  @Test
  void calculateAverageAllGrades_differentAverageByGrade() {
    ArrayList<Double> grades = new ArrayList<>(Arrays.asList(10d, 8d, 9d));

    School test = new School(grades);
    assertEquals(9, test.calculateAverageAllGrades());
  }

}
