package com.sfuentes.FarmTest;

import com.sfuentes.Farm.Farm;
import com.sfuentes.Farm.Hen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmTest {

  @Test
  void getEggPriceByKilo_qualityTwenty_twelvePesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(2d, 10d, 1);

    assertEquals(12d, test.getEggPriceByKilo(hen));
  }

  @Test
  void getEggPriceByKilo_qualityFifteen_twelvePesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1.5d, 20d, 2);

    assertEquals(12d, test.getEggPriceByKilo(hen));
  }

  @Test
  void getEggPriceByKilo_qualityNine_tenPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1.5d, 6d, 1);

    assertEquals(10d, test.getEggPriceByKilo(hen));
  }

  @Test
  void getEggPriceByKilo_qualityFourteen_tenPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1.5d, 18.7d, 2);

    assertEquals(10d, test.getEggPriceByKilo(hen));
  }

  @Test
  void getEggPriceByKilo_qualityTwo_eightPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(2d, 4d, 4);

    assertEquals(8d, test.getEggPriceByKilo(hen));
  }

  @Test
  void getEggPriceByKilo_qualityEight_eightPesosPerKiloOfEgg() {
    Farm test = new Farm();
    Hen hen = new Hen(1d, 8d, 1);

    assertEquals(8d, test.getEggPriceByKilo(hen));
  }

  @Test
  void averageQualityAllHens_allQuality() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 5d, 1));
    hens.add(new Hen(2d, 4d, 4));
    hens.add(new Hen(1d, 1d, 1));

    assertEquals(8.25d, test.averageQualityAllHens(hens));
  }

  @Test
  void averageQualityAllHens_qualityTwenty_sameAttributesHens() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 10d, 1));
    hens.add(new Hen(2d, 10d, 1));

    assertEquals(20d, test.averageQualityAllHens(hens));
  }

  @Test
  void averageQualityAllHens_qualityNine_sameAttributesHens() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(1.5d, 6d, 1));
    hens.add(new Hen(1.5d, 6d, 1));

    assertEquals(9d, test.averageQualityAllHens(hens));
  }

  @Test
  void averageQualityAllHens_qualityTwo_sameAttributesHens() {
    Farm test = new Farm();

    List<Hen> hens = new ArrayList<>();
    hens.add(new Hen(2d, 4d, 4));
    hens.add(new Hen(2d, 4d, 4));

    assertEquals(2d, test.averageQualityAllHens(hens));
  }
}
