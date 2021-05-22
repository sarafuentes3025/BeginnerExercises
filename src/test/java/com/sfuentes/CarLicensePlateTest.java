package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarLicensePlateTest {

  @Test
  void getCountOfEachColorByLicensePlate_FiveLicensePlate_OneOfEachColor() {
    String[] licensePlates = {"XX-55-90", "650-008", "AA3-76-KL", "950-L0-14", "ALT-L80-2"};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 1);
    expected.put("3 or 4 - Pink ", 1);
    expected.put("1 or 2 - Red ", 1);
    expected.put("3 or 4 - Green ", 1);
    expected.put("3 or 4 - Blue ", 1);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }

  @Test
  void getCountOfEachColorByLicensePlate_FiveLicensePlate_OneYellowColor() {
    String[] licensePlates = {"XX-55-91", "650-002", "AA3-71-KL", "950-L0-12", "ALT-L80-1"};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 5);
    expected.put("3 or 4 - Pink ", 0);
    expected.put("1 or 2 - Red ", 0);
    expected.put("3 or 4 - Green ", 0);
    expected.put("3 or 4 - Blue ", 0);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }

  @Test
  void getCountOfEachColorByLicensePlate_FiveLicensePlate_OnePinkColor() {
    String[] licensePlates = {"XX-55-94", "650-003", "AA3-74-KL", "950-L0-13", "ALT-L80-4"};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 0);
    expected.put("3 or 4 - Pink ", 5);
    expected.put("1 or 2 - Red ", 0);
    expected.put("3 or 4 - Green ", 0);
    expected.put("3 or 4 - Blue ", 0);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }

  @Test
  void getCountOfEachColorByLicensePlate_FiveLicensePlate_OneRedColor() {
    String[] licensePlates = {"XX-55-95", "650-006", "AA3-75-KL", "950-L0-16", "ALT-L80-5"};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 0);
    expected.put("3 or 4 - Pink ", 0);
    expected.put("1 or 2 - Red ", 5);
    expected.put("3 or 4 - Green ", 0);
    expected.put("3 or 4 - Blue ", 0);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }

  @Test
  void getCountOfEachColorByLicensePlate_FiveLicensePlate_OneGreenColor() {
    String[] licensePlates = {"XX-55-98", "650-007", "AA3-78-KL", "950-L0-17", "ALT-L80-8"};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 0);
    expected.put("3 or 4 - Pink ", 0);
    expected.put("1 or 2 - Red ", 0);
    expected.put("3 or 4 - Green ", 5);
    expected.put("3 or 4 - Blue ", 0);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }

  @Test
  void getCountOfEachColorByLicensePlate_FiveLicensePlate_OneBlueColor() {
    String[] licensePlates = {"XX-55-90", "650-009", "AA3-70-KL", "950-L0-19", "ALT-L80-0"};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 0);
    expected.put("3 or 4 - Pink ", 0);
    expected.put("1 or 2 - Red ", 0);
    expected.put("3 or 4 - Green ", 0);
    expected.put("3 or 4 - Blue ", 5);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }

  @Test
  void getCountOfEachColorByLicensePlate_NoLicensePlate_NoColor() {
    String[] licensePlates = {};
    CarLicensePlate test = new CarLicensePlate(licensePlates);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("1 or 2 - Yellow ", 0);
    expected.put("3 or 4 - Pink ", 0);
    expected.put("1 or 2 - Red ", 0);
    expected.put("3 or 4 - Green ", 0);
    expected.put("3 or 4 - Blue ", 0);

    assertEquals(expected, test.getCountOfEachColorByLicensePlate(licensePlates));
  }
}
