package darkRealm.DecoratedCommand;

/**
 * Created by Jayam on 12/16/2016.
 */
public interface IRobotCommand {
  void setOption(String s);
  void wrap(IRobotCommand c);
  String getCommand();
}
