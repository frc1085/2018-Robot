package org.team1085.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.team1085.robot.Robot;

public class Logging extends Command {

  public void init() { requires(Robot.dashboard); }

  public boolean isFinished () { return false; }
  public void execute () {
    
  }

}