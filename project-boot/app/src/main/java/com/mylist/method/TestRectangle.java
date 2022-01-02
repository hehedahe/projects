package com.mylist.method;

import java.util.Scanner;

public class TestRectangle {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    Rectangle rec1 = new Rectangle();
    System.out.println("첫 번째 직사각형의 샐깍: ");
    rec1.setColor(keyboard.next());

    System.out.println("첫 번째 직사각형의 가로: ");
    rec1.setWidth(keyboard.nextInt());

    System.out.println("첫 번째 직사각형의 세로: ");
    rec1.setLength(keyboard.nextInt());


    Rectangle rec2 = new Rectangle();
    System.out.println("두 번째 직사각형의 샐깍: ");
    rec2.setColor(keyboard.next());

    System.out.println("두 번째 직사각형의 가로: ");
    rec2.setWidth(keyboard.nextInt());

    System.out.println("첫 번째 직사각형의 세로: ");
    rec2.setLength(keyboard.nextInt());

    System.out.println(rec1.getColor() + "직사각형의 넓이는 " + rec1.area() 
    + "이고, 둘레는 " + rec1.perimeter() + "입니다.");

    System.out.println(rec2.getColor() + "직사각형의 넓이는 " + rec2.area() 
    + "이고, 둘레는 " + rec2.perimeter() + "입니다.");

    // 두 직사각형의 넓이 비교하기
    if (rec1.area() > rec2.area()) {
      System.out.printf("넓이는 %s 직사각형이 더 큽니다.\n", rec1.getColor());
    } else if (rec1.area() < rec2.area()) {
      System.out.printf("넓이는 %s 직사각형이 더 큽니다.\n", rec2.getColor());
    } else {
      System.out.println("넓이는 같습니다.\n");
    }

    // 두 직사각형의 둘레 비교하기
    if (rec1.perimeter() > rec2.perimeter()) {
      System.out.printf("둘레는 %s 직사각형이 더 큽니다.\n", rec1.getColor());
    } else if (rec1.perimeter() < rec2.perimeter()) {
      System.out.printf("넓이는 %s 직사각형이 더 큽니다.\n", rec2.getColor());
    } else {
      System.out.println("넓이는 같습니다.\n");
    }
  }
}
