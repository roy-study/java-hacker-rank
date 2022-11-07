package dev.roy.parreira.minmaxsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class MinMaxSumResultTest {
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
    final List<Integer> integerList = List.of(1, 3, 5, 7, 9);
    final long expectedMinimumSum = 16L;
    final long expectedMaximumSum = 24L;

    // Act
    minMaxSumResult.calculateMinMaxSum(integerList);

    //Expect
    Assertions.assertEquals( expectedMinimumSum, minMaxSumResult.getMinimumSum());
    Assertions.assertEquals( expectedMaximumSum, minMaxSumResult.getMaximumSum());
  }

  @Test
  @DisplayName("Should calculate minimum and maximum sum, empty list")
  void shouldCalculateMinimumAndMaximumSum_EmptyList() {

    // Arrange
    final List<Integer> integerList = List.of();
    final long expectedMinimumSum = 0L;
    final long expectedMaximumSum = 0L;

    // Act
    minMaxSumResult.calculateMinMaxSum(integerList);

    //Expect
    Assertions.assertEquals( expectedMinimumSum, minMaxSumResult.getMinimumSum());
    Assertions.assertEquals( expectedMaximumSum, minMaxSumResult.getMaximumSum());
  }

  @Test
  @DisplayName("Should calculate minimum and maximum sum, null list")
  void shouldCalculateMinimumAndMaximumSum_NullList() {

    // Arrange
    final List<Integer> integerList = List.of();
    final long expectedMinimumSum = 0L;
    final long expectedMaximumSum = 0L;

    // Act
    minMaxSumResult.calculateMinMaxSum(integerList);

    //Expect
    Assertions.assertEquals( expectedMinimumSum, minMaxSumResult.getMinimumSum());
    Assertions.assertEquals( expectedMaximumSum, minMaxSumResult.getMaximumSum());
  }
}
