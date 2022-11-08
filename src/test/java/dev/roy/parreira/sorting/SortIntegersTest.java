package dev.roy.parreira.sorting;

import com.google.common.collect.Ordering;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortIntegersTest {

  // Arrange
  List<Integer> integerList;

  @BeforeEach
  void setUpFixture() {
    integerList =
        Arrays.asList(
            28, 19, 38, 16, 26, 78, 49, 68, 69, 42, 45, 2, 3, 38, 76, 3, 20, 32, 64, 11, 12, 28, 18,
            11, 48, 80, 63, 50, 39, 20, 98, 21, 40, 61, 85, 36, 50, 96, 13, 29);
  }

  @Test
  @DisplayName("Should successfully sort a list using bubble sort algorithm")
  void shouldSortUsingBubbleSort() {

    // Act
    SortIntegers.usingBubbleSort(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }
}
