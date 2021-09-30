package com.krawa.springapp;

public class RockMusic implements Music{
  @Override
  public String getSong() {
    return "Wind of changes";
  }

  public void init() {
    System.out.println("Initialization rock");
  }

  public void destroy() {
    System.out.println("Destroy rock");
  }
}
