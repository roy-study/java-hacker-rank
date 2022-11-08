package dev.roy.parreira.sorting;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SortIntegers {

  private static final double COMB_SORT_GAP_RATE = 1.3;
  private static final int COMB_SORT_MINIMUM_ALLOWED_GAP = 1;

  public static void usingBubbleSort(List<Integer> list) {

    list.forEach(
        integer -> {
          for (int j = 0; j < (list.size() - 1); j++) {

            if (list.get(j) > list.get(j + 1)) {
              swapIntegers(list, (j + 1), j);
            }
          }
        });
  }

  public static void usingCombSort(List<Integer> list) {

    int gap = list.size() - 1;
    int swapsCounter;

    do {

      swapsCounter = 0;

      for (int j = 0; j < (list.size() - gap); j++) {

        if (list.get(j) > list.get((j + gap))) {
          swapIntegers(list, (j + gap), j);
          swapsCounter++;
        }
      }

      gap = (int) Math.max((gap / COMB_SORT_GAP_RATE), COMB_SORT_MINIMUM_ALLOWED_GAP);

    } while ((gap > COMB_SORT_MINIMUM_ALLOWED_GAP) || (swapsCounter != 0));
  }

  public static void usingExchangeSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingInsertionSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingSelectionSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingMergeSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingHeapSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingCountingSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingBucketSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingRadixSort(List<Integer> list) {
    // TODO: Implement me
  }

  private static void swapIntegers(List<Integer> list, int indexOfSmall, int indexOfBig) {

    Integer smaller = list.get(indexOfSmall);
    Integer bigger = list.get(indexOfBig);

    list.set(indexOfSmall, bigger);
    list.set(indexOfBig, smaller);
  }
}
