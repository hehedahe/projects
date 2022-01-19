package com.mylist.inheritence;

public class Cellphone {

  String phoneNumber;
  int totalCallTime;
  int totalFee;
  int feePerCallTime;

  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public int getTotalCallTime() {
    return totalCallTime;
  }
  public void setTotalCallTime(int totalCallTime) {
    this.totalCallTime = totalCallTime;
  }
  public int getTotalFee() {
    return totalFee;
  }
  public void setTotalFee(int totalFee) {
    this.totalFee = totalFee;
  }
  public int getFeePerCallTime() {
    return feePerCallTime;
  }
  public void setFeePerCallTime(int feePerCallTime) {
    this.feePerCallTime = feePerCallTime;
  }

  public void call(String phoneNumber, int callTime) {
    setPhoneNumber(phoneNumber);
    setTotalCallTime(callTime);
  }

  public void calculationTotalFee() {
  }
}
