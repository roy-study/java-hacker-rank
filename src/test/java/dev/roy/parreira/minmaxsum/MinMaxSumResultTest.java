package dev.roy.parreira.minmaxsum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class MinMaxSumResultTest {
  public static final String ELEMENTS_MAGNITUDE_CONSTRAINT_EXCEPTION_MSG =
      "The elements of the list must be between 1 and 10^9";
  /**
   * Given five positive integers, find the minimum and maximum values that can be calculated by
   * summing exactly four of the five integers. Then print the respective minimum and maximum values
   * as a single line of two space-separated long integers.
   */
  MinMaxSumResult minMaxSumResult = new MinMaxSumResult();

  @Test
  @DisplayName("Should calculate minimum and maximum sum, sorted list")
  void shouldCalculateMinimumAndMaximumSum_SortedList() {

    // Arrange
    final List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 9);
    final long expectedMinimumSum = 16L;
    final long expectedMaximumSum = 24L;

    // Act
    minMaxSumResult.calculateMinMaxSum(integerList);

    // Assert
    assertEquals(expectedMinimumSum, minMaxSumResult.getMinimumSum());
    assertEquals(expectedMaximumSum, minMaxSumResult.getMaximumSum());
  }

  @Test
  @DisplayName("Should NOT calculate minimum and maximum sum, empty list")
  void shouldNotCalculateMinimumAndMaximumSum_EmptyList() {

    InputMismatchException exception =
        assertThrowsExactly(
            InputMismatchException.class, () -> minMaxSumResult.calculateMinMaxSum(List.of()));

    assertEquals("The list must not be empty", exception.getMessage());
  }

  //  @Test
  //  @DisplayName("Should NOT calculate minimum and maximum sum for elements smaller than 1")
  //  void shouldNotCalculateMinimumAndMaximumSum_ElementsSmallerThan1() {
  //
  //    InputMismatchException exception =
  //        assertThrowsExactly(
  //            InputMismatchException.class, () -> minMaxSumResult.calculateMinMaxSum(List.of(0)));
  //
  //    assertEquals(ELEMENTS_MAGNITUDE_CONSTRAINT_EXCEPTION_MSG, exception.getMessage());
  //  }
  //
  //  @Test
  //  @DisplayName("Should NOT calculate minimum and maximum sum for elements with value less than
  // 1")
  //  void shouldNotCalculateMinimumAndMaximumSum_ElementsGreaterThan1_000_000_000() {
  //
  //    InputMismatchException exception =
  //        assertThrowsExactly(
  //            InputMismatchException.class,
  //            () -> minMaxSumResult.calculateMinMaxSum(List.of(1_000_000_001)));
  //
  //    assertEquals(ELEMENTS_MAGNITUDE_CONSTRAINT_EXCEPTION_MSG, exception.getMessage());
  //  }

  @ParameterizedTest
  @ValueSource(ints = {0, 1_000_000_001})
  @DisplayName("Should throw InputMismatchException for elements not between 1 and 1_000_000_000")
  void shouldThrowInputMismatchExceptionForListElementsNotBetween1and1_000_000_000(
      int invalidElement) {

    InputMismatchException exception =
        assertThrowsExactly(
            InputMismatchException.class,
            () -> minMaxSumResult.calculateMinMaxSum(List.of(invalidElement)));

    assertEquals(ELEMENTS_MAGNITUDE_CONSTRAINT_EXCEPTION_MSG, exception.getMessage());
  }

  @Test
  @DisplayName("Should NOT calculate minimum and maximum sum, null list")
  void shouldNotCalculateMinimumAndMaximumSum_NullList() {
    //noinspection ConstantConditions
    assertThrowsExactly(NullPointerException.class, () -> minMaxSumResult.calculateMinMaxSum(null));
  }
}
