package dev.roy.parreira.plusminus;

import lombok.Getter;

import java.util.List;

@Getter
public class Result {
  public static final String NULL_RATE = "0.000000";
  private String positivesRate;
  private String negativesRate;
  private String zeroesRate;


  public void plusMinus(List<Integer> integersList) {
    positivesRate = NULL_RATE;
    negativesRate = NULL_RATE;
    zeroesRate = NULL_RATE;

    if (integersList != null && !integersList.isEmpty()) {
      int positivesCounter = 0;
      int negativesCounter = 0;
      int zeroesCounter = 0;

      for (Integer integer : integersList) {
        if (integer > 0) positivesCounter++;
        if (integer < 0) negativesCounter++;
        if (integer == 0) zeroesCounter++;
      }

      positivesRate = String.format("%.6f", ((float) positivesCounter / integersList.size()));
      negativesRate = String.format("%.6f", ((float) negativesCounter / integersList.size()));
      zeroesRate = String.format("%.6f", ((float) zeroesCounter / integersList.size()));
    }

    System.out.println(positivesRate);
    System.out.println(negativesRate);
    System.out.println(zeroesRate);
  }
}
