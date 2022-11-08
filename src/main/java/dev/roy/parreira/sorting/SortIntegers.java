package dev.roy.parreira.sorting;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SortIntegers {

  public static void usingBubbleSort(List<Integer> list) {
    int listSize = list.size();
    Integer swapHelper;

    for (int i = 0; i < listSize; i++) {
      for (int j = 0; j < (listSize - 1); j++) {
        if (list.get(j) > list.get(j + 1)) {
          swapHelper = list.get(j);
          list.set(j, list.get(j + 1));
          list.set((j + 1), swapHelper);
        }
      }
    }
  }
}
