package Decorator;

/**
 * Created by Jayam on 11/10/2016.
 */
public class ConcreteDeocratorB extends Decorator {

  public ConcreteDeocratorB(Component comp) {
    super(comp);
  }

  public void operation() {
    component.operation();
    System.out.println("Extra operation by ConcreteDeocratorB");
  }
}
