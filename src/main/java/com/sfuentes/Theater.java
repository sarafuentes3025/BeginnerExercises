package com.sfuentes;

import java.util.ArrayList;

public class Theater {

  ArrayList<Integer> ages;
  final double price = 20d;

  public Theater(ArrayList<Integer> age) {
    this.ages = age;
  }

  public double getSubtractionByDiscount() {
    double discount = 0;
    for (int age : ages) {
      if (age >= 5 & age <= 14)
        discount += price * .35;
      else if (age >= 15 & age <= 19)
        discount += price * .25;
      else if (age >= 20 & age <= 45)
        discount += price * .10;
      else if (age >= 46 & age <= 65)
        discount += price * .25;
      else if (age >= 66)
        discount += price * .35;
    }
    return discount;
  }
}
