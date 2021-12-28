package com.mylist.test;

public class Test {
  public static void main(String[] args) {

    int[] number = {3, 5, 10, 17, 20};
    int sum = 0;
    for (int i = 0; i < number.length; i++) {
      sum += number[i];
    }
    System.out.println(sum / number.length);
  }

}
