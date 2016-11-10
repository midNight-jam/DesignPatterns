package Decorator.BurgerDecoration;

/**
 * Created by Jayam on 11/10/2016.
 */
public abstract class BurgerDecorator extends Burger {
  protected Burger burger;

  public BurgerDecorator(Burger bug) {
    this.burger = bug;
  }

  public int operation() {
    System.out.println("Burger decorators operation, burger decoration price -- 0");
    return 0;
  }

  public int getPrice() {
    return price;
  }
}
