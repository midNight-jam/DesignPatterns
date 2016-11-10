package Decorator;

/**
 * Created by Jayam on 11/10/2016.
 */
public class ConcreteDecoratorA extends Decorator {

  public ConcreteDecoratorA(Component comp) {
    super(comp);
  }

  public void operation(){
    component.operation();
    System.out.println("Extra operaiton by ConcreteDecoratorA");
  }
}
