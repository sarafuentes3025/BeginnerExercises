package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StationeryTest {

  @Test
  void verifyRequest_offsetAndStandardCopies_bothAccepted() {
    Stationery test = new Stationery();
    test.addRequest("offset", 10_000);
    test.addRequest("standard", 50_000);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Standard");
    expected.add("Accepted Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_offsetAndStandardCopies_onlyOffsetAccepted() {
    Stationery test = new Stationery();
    test.addRequest("offset", 10_000);
    test.addRequest("standard", 60_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Standard");
    expected.add("Accepted Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_offsetAndStandardCopies_onlyStandardAccepted() {
    Stationery test = new Stationery();
    test.addRequest("offset", 60_000);
    test.addRequest("standard", 50_000);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Standard");
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_offsetCopies_accepted() {
    Stationery test = new Stationery();
    test.addRequest("offset", 10);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_standardCopies_accepted() {
    Stationery test = new Stationery();
    test.addRequest("Standard", 500);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Standard");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_sameDuplicatedOffsetCopies_bothAccepted() {
    Stationery test = new Stationery();
    test.addRequest("offset", 5_000);
    test.addRequest("offset", 5_000);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_differentDuplicatedOffsetCopies_bothAccepted() {
    Stationery test = new Stationery();
    test.addRequest("offset", 1_000);
    test.addRequest("offset", 2_000);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_sameDuplicatedStandardCopies_bothAccepted() {
    Stationery test = new Stationery();
    test.addRequest("Standard", 25_000);
    test.addRequest("Standard", 25_000);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Standard");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_differentDuplicatedStandardCopies_bothAccepted() {
    Stationery test = new Stationery();
    test.addRequest("Standard", 30_000);
    test.addRequest("Standard", 2_000);

    List<String> expected = new ArrayList<>();
    expected.add("Accepted Standard");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_offsetAndStandardCopies_bothRejected() {
    Stationery test = new Stationery();
    test.addRequest("offset", 50_000);
    test.addRequest("standard", 60_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Standard");
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_standardCopies_rejected() {
    Stationery test = new Stationery();
    test.addRequest("offset", 11_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_offsetCopies_rejected() {
    Stationery test = new Stationery();
    test.addRequest("offset", 100_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_sameDuplicatedOffsetCopies_bothRejected() {
    Stationery test = new Stationery();
    test.addRequest("offset", 6_000);
    test.addRequest("offset", 6_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_differentDuplicatedOffsetCopies_bothRejected() {
    Stationery test = new Stationery();
    test.addRequest("offset", 1_000);
    test.addRequest("offset", 10_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_sameDuplicatedStandardCopies_bothRejected() {
    Stationery test = new Stationery();
    test.addRequest("Standard", 30_000);
    test.addRequest("Standard", 30_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Standard");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_differentDuplicatedStandardCopies_bothRejected() {
    Stationery test = new Stationery();
    test.addRequest("Standard", 10_000);
    test.addRequest("Standard", 50_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Standard");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_offsetAndStandardCopies_allRejected() {
    Stationery test = new Stationery();
    test.addRequest("Standard", 11_000);
    test.addRequest("Standard", 50_000);
    test.addRequest("offset", 11_000);
    test.addRequest("offset", 10_000);

    List<String> expected = new ArrayList<>();
    expected.add("Rejected Standard");
    expected.add("Rejected Offset");

    assertEquals(expected, test.verifyRequest());
  }

  @Test
  void verifyRequest_noCopies_empty() {
    Stationery test = new Stationery();

    List<String> expected = new ArrayList<>();

    assertEquals(expected, test.verifyRequest());
  }


}
