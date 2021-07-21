package com.sfuentes.date;

public class NumberInWords {

  private static final String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

  private static final String[] tensDigits = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

  private static final String[] elevenToNineteenDigits = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

  public static String convertNumberToWords(int number) {

    if (number >= 0 && number <= 9) { //0,1,...9
      return convertSingleDigit(number);
    } else if (number >= 10 && number <= 90 && number % 10 == 0) { //10,20,...90
      return convertTensDigits(number);
    } else if (number >= 11 && number <= 19) { //11,12,...19
      return convert11To19Digits(number);
    } else { //21,22,...99
      return convertRestTwoDigits(number);
    }
  }

  private static String convertSingleDigit(int number) {
    return singleDigit[number];
  }

  private static String convertTensDigits(int number) {
    return tensDigits[number / 10];
  }

  private static String convert11To19Digits(int number) {
    return elevenToNineteenDigits[number - 10];
  }

  private static String convertRestTwoDigits(int number) {
    return tensDigits[number / 10] + " " + singleDigit[number % 10];
  }
}
