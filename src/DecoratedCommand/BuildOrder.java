package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public class BuildOrder {
  public static void getOrder(){
    IPhoneApp iPhoneApp = new IPhoneApp();
    iPhoneApp.setDecaf("3/4");
    iPhoneApp.setDrink("LL");
    iPhoneApp.setMilk("WM");
    System.out.println(" output "+iPhoneApp.sendCommand());
  }
}
