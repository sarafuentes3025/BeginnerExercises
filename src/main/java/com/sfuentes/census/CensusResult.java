package com.sfuentes.census;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class CensusResult {
  private final List<Card> censusNumberCount = new ArrayList<>();

  public void filterOnlySingleFemaleAgeFrom16To21(Card card) {
    if (card.getGender().equals("female") && card.getAge() >= 16 && card.getAge() <= 21
        && card.getCivilStatus().equals("single"))
      censusNumberCount.add(card);
  }
}
