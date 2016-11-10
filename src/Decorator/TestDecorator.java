package Decorator;

/**
 * Created by Jayam on 11/10/2016.
 */
public class TestDecorator {
  public static void test() {
    ConcreteComponent burger = new ConcreteComponent();
    burger.operation();
    System.out.println("-------------------------------");
    ConcreteDecoratorA cda = new ConcreteDecoratorA(burger);
    cda.operation();
    System.out.println("-------------------------------");
    ConcreteDeocratorB cdb = new ConcreteDeocratorB(cda);
    cdb.operation();
  }
}
