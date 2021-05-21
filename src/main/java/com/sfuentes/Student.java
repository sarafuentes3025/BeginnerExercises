package com.sfuentes;

import java.util.HashMap;
import java.util.Map;

public class Student {
  String[][] students;

  public Student(String[][] students) {
    this.students = students;
  }

  public Map<String, Integer> getCountByGender(String[][] students) {
    Map<String, Integer> categories = new HashMap<>();
    int menCount = 0;
    int womanCount = 0;

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
