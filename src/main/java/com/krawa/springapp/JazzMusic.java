package com.krawa.springapp;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{

  @Override
  public String getSong() {
    return "Jazz for everyone";
  }

  public void init() {
    System.out.println("Initialization jazz");
  }

  public void destroy() {
    System.out.println("Destroy jazz");
  }
}
