package dev.roy.parreira.minmaxsum;

import lombok.Getter;
import lombok.NonNull;

import java.util.InputMismatchException;
import java.util.List;

// Suppressing System.out to keep code compatibility with Hacker Rank
// The results asking for print, doesn't support loggers
@SuppressWarnings("squid:S106")
@Getter
public class MinMaxSumResult {

  private static final int MINIMUM_ALLOWED_VALUE = 1;
  private static final int MAXIMUM_ALLOWED_VALUE = 1_000_000_000;
  private long minimumSum;
  private long maximumSum;

  public void calculateMinMaxSum(@NonNull List<Integer> integerList) {

    if (integerList.isEmpty()) {
      throw new InputMismatchException("The list must not be empty");
    }

    long sumOfElements = 0L;
    minimumSum = 0L;
    maximumSum = 0L;

    final int lastElementIndex = integerList.size() - 1;

    for (Integer integer : integerList) {

      // Ensuring element value constraint
      if ((integer < MINIMUM_ALLOWED_VALUE) || (integer > MAXIMUM_ALLOWED_VALUE)) {
        throw new InputMismatchException("The elements of the list must be between 1 and 10^9");
      }

      sumOfElements += integer;
    }

    // TODO: The list must be sorted for this to work
    minimumSum = sumOfElements - integerList.get(lastElementIndex);
    maximumSum = sumOfElements - integerList.get(0);

    System.out.printf("%d %d", minimumSum, maximumSum);
  }
}
