package dev.roy.parreira.plusminus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PlusMinusResultTest {

  PlusMinusResult plusMinusResult = new PlusMinusResult();

  @Test
  @DisplayName("Should successfully calculate plus-minus, balanced list")
  void shouldCalculatePlusMinus_BalancedList() {
    // Arrange
    List<Integer> integerList = List.of(1, 1, 0, -1, -1);

    // Act
    plusMinusResult.plusMinus(integerList);

    // Expect
    Assertions.assertEquals("0.400000", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("0.400000", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("0.200000", plusMinusResult.getZeroesRate());
  }

  @Test
  @DisplayName("Should successfully calculate plus-minus")
  void shouldSuccessfullyCalculatePlusMinus() {
    // Arrange
    List<Integer> integerList =
        List.of(2, 5, -6, 9, -5, 0, -1, 0, 6, -566, 1022, 0, 7, 5687, 0, -1);

    // Act
    plusMinusResult.plusMinus(integerList);

    // Expect
    Assertions.assertEquals("0.437500", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("0.312500", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("0.250000", plusMinusResult.getZeroesRate());
  }

  @Test
  @DisplayName("Should successfully calculate plus-minus, only positive numbers")
  void shouldCalculatePlusMinus_OnlyPositives() {
    // Arrange
    List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // Act
    plusMinusResult.plusMinus(integerList);

    // Expect
    Assertions.assertEquals("1.000000", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getZeroesRate());
  }

  @Test
  @DisplayName("Should successfully calculate plus-minus, only negative numbers")
  void shouldCalculatePlusMinus_OnlyNegatives() {
    // Arrange
    List<Integer> integerList = List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9);

    // Act
    plusMinusResult.plusMinus(integerList);

    // Expect
    Assertions.assertEquals("0.000000", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("1.000000", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getZeroesRate());
  }

  @Test
  @DisplayName("Should successfully calculate plus-minus, only zeroes")
  void shouldCalculatePlusMinus_OnlyZeroes() {
    // Arrange
    List<Integer> integerList = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0);

    // Act
    plusMinusResult.plusMinus(integerList);

    // Expect
    Assertions.assertEquals("0.000000", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("1.000000", plusMinusResult.getZeroesRate());
  }

  @Test
  @DisplayName("Should calculate plus-minus, null list")
  void shouldCalculatePlusMinus_NullList() {

    // Act
    plusMinusResult.plusMinus(null);

    // Expect
    Assertions.assertEquals("0.000000", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getZeroesRate());
  }

  @Test
  @DisplayName("Should calculate plus-minus, empty list")
  void shouldCalculatePlusMinusSuccessfully_EmptyList() {
    // Arrange
    List<Integer> integerList = List.of();

    // Act
    plusMinusResult.plusMinus(integerList);

    // Expect
    Assertions.assertEquals("0.000000", plusMinusResult.getPositivesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getNegativesRate());
    Assertions.assertEquals("0.000000", plusMinusResult.getZeroesRate());
  }
}
