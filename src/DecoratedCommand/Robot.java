package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public class Robot implements IRobotCommand {

  @Override
  public void setOption(String s) {

  }

  @Override
  public void wrap(IRobotCommand c) {

  }

  @Override
  public String getCommand() {
    return "Robot ";
  }
}
