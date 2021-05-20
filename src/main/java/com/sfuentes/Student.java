package com.sfuentes;

import java.util.HashMap;
import java.util.Map;

public class Student {
  String[][] students;
  Map<String, Integer> categories = new HashMap<>();
  int menCount;
  int womanCount;

  public Student(String[][] students) {
    this.students = students;
  }

  public Map<String, Integer> sortByWomenAndMen(String[][] students) {

    for (String[] student : students) {
      if ("man".equals(student[1]))
        menCount++;
      else
        womanCount++;
    }

    categories.put("Women: ", womanCount);
    categories.put("Men: ", menCount);

    return categories;
  }
}
