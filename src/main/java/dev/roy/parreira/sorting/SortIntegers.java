package dev.roy.parreira.sorting;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SortIntegers {

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
    final double combSortGapRate = 1.3;
    final int combSortMinimumAllowedGap = 1;

    int gap = list.size() - 1;
    boolean thereWasSwap;

    do {

      thereWasSwap = false;

      for (int j = 0; j < (list.size() - gap); j++) {

        if (list.get(j) > list.get((j + gap))) {
          swapIntegers(list, (j + gap), j);
          thereWasSwap = true;
        }
      }

      gap = (int) Math.max((gap / combSortGapRate), combSortMinimumAllowedGap);

    } while ((gap != combSortMinimumAllowedGap) || (thereWasSwap));
  }

  public static void usingExchangeSort(List<Integer> list) {
    for (int i = 0; i < (list.size() - 1); i++) {

      for (int j = (i + 1); j < list.size(); j++) {

        if (list.get(j) < list.get(i)) {
          swapIntegers(list, i, j);
        }
      }
    }
  }

  public static void usingInsertionSort(List<Integer> list) {

    for (int i = 1; i < list.size(); i++) {
      int swapper = list.get(i);
      int insertionIndex = i - 1;

      while ((insertionIndex >= 0) && swapper < list.get(insertionIndex)) {
        list.set((insertionIndex + 1), list.get(insertionIndex));
        insertionIndex--;
      }
      list.set((insertionIndex + 1), swapper);
    }
  }

  public static void usingSelectionSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingMergeSort(List<Integer> list) {
    // TODO: Implement me
  }

  public static void usingQuickSort(List<Integer> list) {
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
