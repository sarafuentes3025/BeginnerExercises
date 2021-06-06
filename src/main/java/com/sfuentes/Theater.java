package com.sfuentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Theater {

  ArrayList<Integer> ages;
  final double price = 20d;

  public Theater(ArrayList<Integer> age) {
    this.ages = age;
  }

  public Map<String, Double> getSubtractionByDiscount() {
    double discount1 = 0;
    double discount2 = 0;
    double discount3 = 0;
    double discount4 = 0;
    double discount5 = 0;
    for (int age : ages) {
      if (age >= 5 & age <= 14)
        discount1 += price * .35;
      else if (age >= 15 & age <= 19)
        discount2 += price * .25;
      else if (age >= 20 & age <= 45)
        discount3 += price * .10;
      else if (age >= 46 & age <= 65)
        discount4 += price * .25;
      else if (age >= 66)
        discount5 += price * .35;
    }
    Map<String, Double> total = new HashMap<>();
    total.put("One category", discount1);
    total.put("Two category", discount2);
    total.put("Three category", discount3);
    total.put("Four category", discount4);
    total.put("Five category", discount5);

    return total;
  }
}

