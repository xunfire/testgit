package org.example;

public class TestDev2 {
  public TestDev td ;
  public String arr ;

  public TestDev2(TestDev td) {
    this.td = td;
  }

  public void setArr(){
    this.arr = td.getTest();
  }

  public String getArr(){
    return this.arr;
  }
}
