package com.sfuentes.farmTest;

import com.sfuentes.farm.Farm;
import com.sfuentes.farm.Hen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmTest {

  @Test
  void getEggPricePerKilo_qualityTwenty_twelvePesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(2d, 10d, 1);

    assertEquals(12d, test.getEggPricePerKilo(hen));
  }

  @Test
  void getEggPricePerKilo_qualityFifteen_twelvePesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1.5d, 20d, 2);

    assertEquals(12d, test.getEggPricePerKilo(hen));
  }

  @Test
  void getEggPricePerKilo_qualityNine_tenPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1.5d, 6d, 1);

    assertEquals(10d, test.getEggPricePerKilo(hen));
  }

  @Test
  void getEggPricePerKilo_qualityFourteen_tenPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1.5d, 18.7d, 2);

    assertEquals(10d, test.getEggPricePerKilo(hen));
  }

  @Test
  void getEggPricePerKilo_qualityTwo_eightPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(2d, 4d, 4);

    assertEquals(8d, test.getEggPricePerKilo(hen));
  }

  @Test
  void getEggPricePerKilo_qualityEight_eightPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1d, 8d, 1);

    assertEquals(8d, test.getEggPricePerKilo(hen));
  }

  @Test
  void getEggPricePerKilo_zeroQuality_zeroPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(0d, 0d, 0);

    assertEquals(0d, test.getEggPricePerKilo(hen));
  }

  @Test
  void calculateAverageQualityOfHens_allQuality() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 5d, 1));
    hens.add(new Hen(2d, 4d, 4));
    hens.add(new Hen(1d, 1d, 1));

    assertEquals(8.25d, test.calculateAverageQualityOfHens(hens));
  }

  @Test
  void calculateAverageQualityOfHens_qualityTwenty_sameAttributesHens() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 10d, 1));

    assertEquals(20d, test.calculateAverageQualityOfHens(hens));
  }

  @Test
  void calculateAverageQualityOfHens_qualityNine_sameAttributesHens() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(1.5d, 6d, 1));
    hens.add(new Hen(1.5d, 6d, 1));

    assertEquals(9d, test.calculateAverageQualityOfHens(hens));
  }

  @Test
  void calculateAverageQualityOfHens_qualityTwo_sameAttributesHens() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(2d, 4d, 4));
    hens.add(new Hen(2d, 4d, 4));

    assertEquals(2d, test.calculateAverageQualityOfHens(hens));
  }

  @Test
  void calculateAverageQualityOfHens_noHens_noQuality() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();

    assertEquals(0d, test.calculateAverageQualityOfHens(hens));
  }
}
