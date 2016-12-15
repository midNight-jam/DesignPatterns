package com.darkRealm;

/**
 * Created by Jayam on 12/14/2016.
 */
public class SauceDecorator extends Decorator {

  SauceDecorator (IComponent c) {
    super(c);
  }

  public void setOptions(String [] s) {
    addChilds(s);
  }


  @Override
  public double getPrice() {
    return component.getPrice() + 7;
  }

  @Override
  public void addChilds(String[] s) {
    component.addChilds(s);
  }

  @Override
  public void printChilds() {
    component.printChilds();
  }
}
