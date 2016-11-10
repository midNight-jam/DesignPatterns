package Decorator.BurgerDecoration;

/**
 * Created by Jayam on 11/10/2016.
 */
public class SauceDecorator extends BurgerDecorator {

  private int price;

  public SauceDecorator(Burger bug) {
    super(bug);
    price = 4;
  }

  public int operation() {
    int bugPrice = burger.operation();
    System.out.println("SauceDecorator operation, sauce decoration price 4 - bug Price " + (price + bugPrice));
    return price + bugPrice;
  }
}
