package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public class IPhoneApp {
  private IRobotCommand command;
  private IRobotCommand[] decorators;

  IPhoneApp() {
    command = new Robot();
    decorators = new IRobotCommand[4];
  }

  public void setDecaf(String decafOption) {
    decorators[0] = new Decaf();
    decorators[0].setOption(decafOption);
  }

  public void setDrink(String drinkOption) {
    decorators[1] = new Drink();
    decorators[1].setOption(drinkOption);
  }

  public void setMilk(String milkOption){
    decorators[2] = new Milk();
    decorators[2].setOption(milkOption);
  }

  public void setShots(String shotOption) {
    decorators[3] = new Shots();
    decorators[3].setOption(shotOption);
  }

  public String sendCommand(){
    for(int i=0; i<decorators.length;i++){
      decorators[i].wrap(command);
      this.command = decorators[i];
    }
    return this.command.getCommand();
  }
}
