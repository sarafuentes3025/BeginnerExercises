package com.sfuentes;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CountDownByTwos {

  private final int start;

  public int calculateCountDownByTwos() {
    int count = 0;
    for (int i = start; i > 0; i -= 2)
      count += i;
    return count;
  }
}
