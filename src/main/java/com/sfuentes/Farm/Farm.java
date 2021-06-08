package com.sfuentes.Farm;

import java.util.List;

public class Farm {

  public Farm() {
  }

  public double getQualityByHen(Hen hen) {
    return hen.getHenWeight() * hen.getHenHeight() / hen.getNumberOfEggs();
  }

  public double getEggPriceByKilo(Hen hen) {
    double price;

    if (getQualityByHen(hen) >= 15)
      price = 12d;
    else if (getQualityByHen(hen) > 8 && getQualityByHen(hen) < 15)
      price = 10d;
    else
      price = 8d;

    return price;
  }

  public double averageQualityAllHens(List<Hen> hens) {
    return hens.stream().mapToDouble(this::getQualityByHen).average().orElse(0.0);
  }
}
