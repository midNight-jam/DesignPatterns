package com.darkRealm;

/**
 * Created by Jayam on 12/14/2016.
 */
public class BuildOrder {

  public static void getOrder(){

    String cheeseOptions[] = {"Danish Blue Cheese", "Horseradish Cheddar"}; // 1 cheese free, extra cheese +1.00 = 1.00
    String toppingsOptions[] = {"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"}; // 4 toppings free, extra +.75 = 0.00
    String sauceOptions[] = {"Appricot Sauce", "Tomato Sauce"}; // 1 sauce free, extra +.75 = 0.00

    CustomBurger cb = new CustomBurger();

    CheeseDecorator cd = new CheeseDecorator(cb);
    cd.setOptions(cheeseOptions);

    SauceDecorator sd = new SauceDecorator(cd);
    sd.setOptions(sauceOptions);

    ToppingsDecorator td = new ToppingsDecorator(sd);
    td.setOptions(toppingsOptions);

    td.printChilds();

    System.out.println("customg burg price "+td.getPrice());

  }
}
