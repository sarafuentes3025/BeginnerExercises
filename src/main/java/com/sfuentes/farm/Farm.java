package com.sfuentes.farm;

import java.util.List;

public class Farm {

  public Farm() {
  }

  public double getQualityOfHen(Hen hen) {
    return hen.getHenWeight() * hen.getHenHeight() / hen.getNumberOfEggs();
  }

  public double getEggPricePerKilo(Hen hen) {
    double price;

    if (getQualityOfHen(hen) <= 8)
      price = 8;
    else if (getQualityOfHen(hen) < 15)
      price = 10d;
    else
      price = 12d;

    return getQualityOfHen(hen) > 0 ? price : 0d;
  }

  public double calculateAverageQualityOfHens(List<Hen> hens) {
    return hens.stream().mapToDouble(this::getQualityOfHen).average().orElse(0.0);
  }
}
