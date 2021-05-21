package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

  @Test
  void getCountByGender_TenStudents_OnlyWomen() {
    String[][] students = {
        {"Daniela", "woman"},
        {"Julia", "woman"},
        {"Maria", "woman"},
        {"Manuela", "woman"},
        {"Luisa", "woman"},
        {"Ana", "woman"},
        {"Sonia", "woman"},
        {"Luisa", "woman"},
        {"Mariana", "woman"},
        {"Sara", "woman"}
    };
    Student test = new Student(students);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("Women: ", 10);
    expected.put("Men: ", 0);

    assertEquals(expected, test.getCountByGender(students));
  }

  @Test
  void getCountByGender_TenStudents_WomenAndMen() {
    String[][] students = {
        {"Daniel", "man"},
        {"Julio", "man"},
        {"Mario", "man"},
        {"Manuel", "man"},
        {"Luis", "man"},
        {"Ana", "woman"},
        {"Sonia", "woman"},
        {"Luisa", "woman"},
        {"Mariana", "woman"},
        {"Sara", "woman"}
    };
    Student test = new Student(students);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("Women: ", 5);
    expected.put("Men: ", 5);

    assertEquals(expected, test.getCountByGender(students));
  }

  @Test
  void getCountByGender_TenStudents_OnlyMen() {
    String[][] students = {
        {"Daniel", "man"},
        {"Julio", "man"},
        {"Mario", "man"},
        {"Manuel", "man"},
        {"Luis", "man"},
        {"Antonio", "man"},
        {"Saul", "man"},
        {"Luis", "man"},
        {"Mariano", "man"},
        {"Eduardo", "man"}
    };
    Student test = new Student(students);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("Women: ", 0);
    expected.put("Men: ", 10);

    assertEquals(expected, test.getCountByGender(students));
  }

  @Test
  void getCountByGender_NoStudents_NoWomenAndNoMen() {
    String[][] students = {};
    Student test = new Student(students);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("Women: ", 0);
    expected.put("Men: ", 0);

    assertEquals(expected, test.getCountByGender(students));
  }
}
