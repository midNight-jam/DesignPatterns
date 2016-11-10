package Decorator.BurgerDecoration;
/**
 * Created by Jayam on 11/10/2016.
 */
public class Burger {
  int price;

  Burger() {
    price = 0;
  }

  public int operation() {
    System.out.println("Burgers operation, base price 0");
    return 0;
  }

  public int getPrice() {
    return price;
  }
}
