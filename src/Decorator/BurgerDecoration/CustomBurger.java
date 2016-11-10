package Decorator.BurgerDecoration;

/**
 * Created by Jayam on 11/10/2016.
 */
public class CustomBurger extends Burger {

  CustomBurger() {
    price = 5;
  }

  public int getPrice() {
    return price;
  }

  public int operation() {
    System.out.println("Custom Burger operation, custom burger price "+price);
    return price;
  }
}
