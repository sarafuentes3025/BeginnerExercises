package com.sfuentes.schoolGrades;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {
  @Test
  void calculateAverageByGrade_sameAverageByGrade() {
    Map<String, Double> grades = new HashMap<>();
    grades.put("1A", 8d);
    grades.put("1B", 8d);
    grades.put("1C", 8d);
    grades.put("1D", 8d);

    Grade test = new Grade(grades);

    assertEquals(8, test.calculateAverageByGrade());
  }

  @Test
  void calculateAverageByGrade_differentAverageByGrade_decimalResult() {
    Map<String, Double> grades = new HashMap<>();
    grades.put("1A", 10d);
    grades.put("1B", 9d);
    grades.put("1C", 8d);
    grades.put("1D", 8d);

    Grade test = new Grade(grades);

    assertEquals(8.75, test.calculateAverageByGrade());
  }
}
