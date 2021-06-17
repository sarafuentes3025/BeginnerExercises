package com.sfuentes.StationeryShop;

public class Request {

  private final String typeOfPrinting;
  private final int numOfCopies;

  public Request(String typeOfPrinting, int numOfCopies) {
    this.typeOfPrinting = typeOfPrinting;
    this.numOfCopies = numOfCopies;
  }

  public String getTypeOfPrinting() {
    return typeOfPrinting;
  }

  public int getNumOfCopies() {
    return numOfCopies;
  }
}
