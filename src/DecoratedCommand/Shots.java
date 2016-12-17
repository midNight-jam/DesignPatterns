package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public class Shots implements IRobotCommand {
  String option;
  IRobotCommand command;

  @Override
  public void setOption(String s) {
    option = "shots [ "+s+" ] ";
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
