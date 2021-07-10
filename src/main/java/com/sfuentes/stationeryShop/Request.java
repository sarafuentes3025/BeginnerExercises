package com.sfuentes.stationeryShop;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Request {

  private final String typeOfPrinting;
  private final int numOfCopies;

}
