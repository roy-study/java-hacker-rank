package dev.roy.parreira.minmaxsum;

import lombok.Getter;

import java.util.InputMismatchException;
import java.util.List;

@Getter
public class MinMaxSumResult {

  private static final long MINIMUM_ALLOWED_VALUE = 1L;
  private static final long MAXIMUM_ALLOWED_VALUE = (long) Math.pow(10, 9);
  private long minimumSum;
  private long maximumSum;

  public void calculateMinMaxSum(List<Integer> integerList) {

    long sumOfElements = 0L;
    minimumSum = 0L;
    maximumSum = 0L;

    if ((integerList != null) && (!integerList.isEmpty())) {

      final int lastElementIndex = integerList.size() - 1;

      for (Integer integer : integerList) {

        // Ensuring element value constraint
        if ((integer < MINIMUM_ALLOWED_VALUE) || (integer > MAXIMUM_ALLOWED_VALUE)) {
          throw new InputMismatchException("The elements of the list must be between 1 and 10^9");
        }

        // Needs to sort first
        sumOfElements += integer;
      }

      minimumSum = sumOfElements - integerList.get(lastElementIndex);
      maximumSum = sumOfElements - integerList.get(0);
    }

    System.out.printf("%d %d", minimumSum, maximumSum);
  }
}
