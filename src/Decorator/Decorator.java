package Decorator;

/**
 * Created by Jayam on 11/10/2016.
 */
public abstract class Decorator extends Component {
  protected Component component;

  public Decorator(Component comp) {
    this.component = comp;
  }

  public void operation() {
    System.out.println(" Decorators Operation ");
  }
}