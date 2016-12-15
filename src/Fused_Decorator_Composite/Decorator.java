package com.darkRealm;

/**
 * Created by Jayam on 12/14/2016.
 */
public abstract class Decorator implements IComponent {

  IComponent component;

  Decorator(IComponent c){
    component = c;
  }

  void addChild(String []s){
    component.addChilds(s);
  }
}
