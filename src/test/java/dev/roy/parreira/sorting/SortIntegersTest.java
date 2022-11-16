package dev.roy.parreira.sorting;

import com.google.common.collect.Ordering;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortIntegersTest {

  List<Integer> integerList;

  @BeforeEach
  void setUpFixture() {
    // Arrange
    integerList = getRandomIntegerList();
  }

  @Test
  @DisplayName("Should successfully sort a list using BUBBLE SORT algorithm")
  void shouldSortUsingBubbleSort() {

    // Act
    SortIntegers.usingBubbleSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  @Test
  @DisplayName("Should successfully sort a list using COMB SORT algorithm")
  void shouldSortUsingCombSort() {

    // Act
    SortIntegers.usingCombSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  @Test
  @DisplayName("Should successfully sort a list using EXCHANGE SORT algorithm")
  void shouldSortUsingExchangeSort() {

    // Act
    SortIntegers.usingExchangeSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  @Test
  @DisplayName("Should successfully sort a list using INSERTION SORT algorithm")
  void shouldSortUsingInsertionSort() {

    // Act
    SortIntegers.usingInsertionSort(integerList);
    System.out.println(integerList);

    // Assert
    assertTrue(Ordering.natural().isOrdered(integerList));
  }

  private List<Integer> getRandomIntegerList() {

    Random random = new Random();

    int randomListSize = Math.abs(random.nextInt(50));
    final int listSize = (randomListSize == 0) ? 1_000 : randomListSize;

    return Stream.generate(() -> random.ints(0, 99))
        .flatMap(IntStream::boxed)
        .limit(listSize)
        .distinct()
        .collect(Collectors.toList());
  }
}
