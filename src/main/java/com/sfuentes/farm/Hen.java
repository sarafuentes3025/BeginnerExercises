package com.sfuentes.farm;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Hen {
  private final double henWeight;
  private final double henHeight;
  private final int numberOfEggs;
}
