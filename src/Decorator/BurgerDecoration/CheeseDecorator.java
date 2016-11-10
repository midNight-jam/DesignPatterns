package Decorator.BurgerDecoration;

/**
 * Created by Jayam on 11/10/2016.
 */
public class CheeseDecorator extends BurgerDecorator {

  private int price;
  public CheeseDecorator(Burger bug) {
    super(bug);
    price = 2;
  }

  public int getPrice() {
    return price + burger.getPrice();
  }

  public int operation() {
    int bugPrice = burger.operation();
    System.out.println("CheeseDecorator operation, Cheese decoraion price 2 - bug price " + getPrice());
    return price + bugPrice;
  }
}
