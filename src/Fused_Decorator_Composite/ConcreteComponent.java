package com.darkRealm;

import java.util.ArrayList;

/**
 * Created by Jayam on 12/14/2016.
 */
public class ConcreteComponent implements IComponent   {

  ArrayList<String[]> childs;

  ConcreteComponent(){
    childs = new ArrayList<>();
  }

  @Override
  public double getPrice() {
    return 0;
  }

  @Override
  public void addChilds(String[] s) {
    childs.add(s);
  }

  @Override
  public void printChilds(){
    for (String [] c:
         childs) {

      for(int i=0; i< c.length;i++){
        System.out.print(c[i]+" ");
      }
      System.out.println();
    }
  }
}
