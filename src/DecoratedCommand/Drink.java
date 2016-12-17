package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public class Drink implements IRobotCommand {

  private String option;
  private IRobotCommand command;

  @Override
  public void setOption(String s) {
    option = " Drink [ " + s + " ] ";
  }

  @Override
  public void wrap(IRobotCommand c) {
    command = c;
  }

  @Override
  public String getCommand() {
    return command.getCommand() + option;
  }
}