package com.sfuentes.census;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class ResultCensus {
  private final List<Integer> censusNumberCount = new ArrayList<>();

  public void addCensusNumberSingleWomenBetweenSixteenAndTwentyOne(Card card) {
    if (card.getGender().equals("female") && card.getAge() >= 16 && card.getAge() <= 21
        && card.getCivilStatus().equals("single"))
      censusNumberCount.add(card.getCensusNumber());
  }
}
