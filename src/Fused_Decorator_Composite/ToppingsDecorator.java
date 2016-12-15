package com.darkRealm;

/**
 * Created by Jayam on 12/14/2016.
 */
public class ToppingsDecorator extends Decorator {

  ToppingsDecorator(IComponent c) {
    super(c);
  }

  public void setOptions(String [] s) {

    addChilds(s);
  }

  @Override
  public double getPrice() {
    return component.getPrice() + 9;
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