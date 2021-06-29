package com.sfuentes.farm;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Farm {
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
