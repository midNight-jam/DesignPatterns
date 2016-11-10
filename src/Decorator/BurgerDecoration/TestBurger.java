package Decorator.BurgerDecoration;

/**
 * Created by Jayam on 11/10/2016.
 */
public class TestBurger {
  public static void test(){
    Burger burger = new CustomBurger();
    burger.operation();
    System.out.println("-------------------------");
    CheeseDecorator cd = new CheeseDecorator(burger);
    cd.operation();
    System.out.println("-------------------------");
    SauceDecorator sd = new SauceDecorator(cd);
    sd.operation();
  }
}
