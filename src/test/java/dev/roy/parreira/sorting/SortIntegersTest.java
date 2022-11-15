package dev.roy.parreira.sorting;

import com.google.common.collect.Ordering;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortIntegersTest {

  List<Integer> integerList;

  @BeforeEach
  void setUpFixture() {
    // Arrange
    integerList = getRandomIntegerList();
  }

  @Test
  @DisplayName("Should successfully sort a list using bubble sort algorithm")
  void shouldSortUsingBubbleSort() {

    // Act
    SortIntegers.usingBubbleSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  @Test
  @DisplayName("Should successfully sort a list using comb sort algorithm")
  void shouldSortUsingCombSort() {

    // Act
    SortIntegers.usingCombSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  @Test
  @DisplayName("Should successfully sort a list using exchange sort algorithm")
  void shouldSortUsingExchangeSort() {

    // Act
    SortIntegers.usingExchangeSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  /**
   * Generates a random integers list with size (0 < x < 50) and elements value (-99 < y < 99)
   *
   * @return random integer list
   */
  private List<Integer> getRandomIntegerList() {

    List<Integer> integers = new ArrayList<>();
    Random random = new Random();

    int listSize = Math.abs(random.nextInt(50));
    listSize = (listSize == 0) ? 15 : listSize;

    for (int i = 0; i < listSize; i++) {
      integers.add(random.nextInt(99));
    }

    return integers;
  }
}
