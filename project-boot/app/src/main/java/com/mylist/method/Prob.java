package com.mylist.method;

public class Prob {

  public static void main(String[] args) {

    int month = Integer.parseInt(args[0]);
    new Prob().printSeason(month);
  }

  public void printSeason(int month) {

    String season = "";

    switch (month) {
      case 3:
      case 4:
      case 5:
        season = "봄";
        break;
      case 6:
      case 7:
      case 8:
        season = "여름";
        break;
      case 9:
      case 10:
      case 11:
        season = "가을";
      case 12:
      case 1:
      case 2:
        season = "겨울";
        break;
      default:
        System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
        return;
    }

    System.out.printf("%s에 태어나셨네요.", season);
  }
}
