package com.mylist.method;


public class Test {

  public static void main(String[] args) {

    int[] values = {10, 4, 53, 63, 17, 37 ,52 ,16 ,33 ,65};

    int sum = 0;
    int value = 0;

    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    int avg = sum / values.length;

    for (int j = 0; j < values.length; j++) {
      int gapA = Math.abs(avg - values[j]);
      for (int k = j+1; k < values.length; k++) {

        int gapB = Math.abs(avg - values[k]);

        value = (gapA > gapB) ? values[j] : values[k];
      }
    }

    System.out.println(value);
  }

}
