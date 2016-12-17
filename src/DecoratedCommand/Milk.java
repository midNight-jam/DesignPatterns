package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public class Milk implements IRobotCommand {

  IRobotCommand command;
  String option;

  @Override
  public void setOption(String s) {
    option = "Milk [ "+s+" ]";
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
