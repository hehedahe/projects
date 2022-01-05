package com.mylist.method;

import java.util.Scanner;

public class FactorialUtil {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Input    = ");

    FactorialUtil util = new FactorialUtil();
    System.out.printf("Result = %d\n", util.factorial(keyboard.nextInt()));

    keyboard.close();
  }

  public int factorial(int n) {
    int sum = n;

    for (int i = n; i >= 1; i--) {
      if (i == 1) {
        break;
      }
      sum *= (i - 1);
    }

    return sum;
  }
}
