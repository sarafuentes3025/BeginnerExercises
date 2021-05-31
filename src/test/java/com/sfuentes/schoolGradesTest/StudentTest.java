package com.sfuentes.schoolGradesTest;

import com.sfuentes.schoolGrades.Student;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

  @Test
  void calculateAverageByStudent_sameScoreInSubjects() {
    Map<String, Double> subjects = new HashMap<>();
    subjects.put("Mathematics", 8d);
    subjects.put("Art", 8d);
    subjects.put("Geography", 8d);
    subjects.put("Spanish", 8d);

    Student test = new Student("Adrian", "1D", subjects);

    assertEquals(8, test.calculateAverageByStudent());
  }

  @Test
  void calculateAverageByStudent_differentScoreInSubjects_decimalResult() {
    Map<String, Double> subjects = new HashMap<>();
    subjects.put("Mathematics", 10d);
    subjects.put("Art", 9d);
    subjects.put("Geography", 8d);
    subjects.put("Spanish", 8d);

    Student test = new Student("Alan", "2A", subjects);

    assertEquals(8.75, test.calculateAverageByStudent());
  }
}
