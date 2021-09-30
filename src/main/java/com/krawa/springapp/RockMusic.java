package com.krawa.springapp;

import org.springframework.stereotype.Component;

@Component
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
