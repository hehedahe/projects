package com.mylist.modeling;

public class Rectangle {

  int width;
  int length;
  String color;

  public int getWidth() {
    return width;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  public int area() {
    return getLength() * getWidth();
  }

  public int perimeter() {
    return (getLength() + getWidth()) * 2;
  }



}
