package com.krawa.springapp;

public class ClassicalMusic implements Music{
  @Override
  public String getSong() {
    return "Sonate # 5";
  }

  public void init() {
    System.out.println("Initialization classic");
  }

  public void destroy() {
    System.out.println("Destroy classic");
  }
}
