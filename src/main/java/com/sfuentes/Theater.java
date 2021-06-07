package com.sfuentes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {

  List<Integer> ages;
  final double price = 20d;

  public Theater(List<Integer> ages) {
    this.ages = ages;
  }

  public Map<String, Double> getCategoryByDiscount() {
    double discount1 = 0;
    double discount2 = 0;
    double discount3 = 0;
    double discount4 = 0;
    double discount5 = 0;
    for (int age : ages) {
      if (age >= 5 && age <= 14)
        discount1 += price * .35;
      else if (age >= 15 && age <= 19)
        discount2 += price * .25;
      else if (age >= 20 && age <= 45)
        discount3 += price * .10;
      else if (age >= 46 && age <= 65)
        discount4 += price * .25;
      else if (age >= 66)
        discount5 += price * .35;
    }
    Map<String, Double> total = new HashMap<>();
    total.put("Ages 5-14", discount1);
    total.put("Ages 15-19", discount2);
    total.put("Ages 20-45", discount3);
    total.put("Ages 46-65", discount4);
    total.put("Ages 66 and more", discount5);

    return total;
  }
}

