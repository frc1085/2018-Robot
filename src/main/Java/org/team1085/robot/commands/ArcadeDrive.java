package org.team1085.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.team1085.robot.Robot;

class ArcadeDrive extends Command {

  public void init() { requires(Robot.chassis); }

  public boolean isFinished (){ return false; }
  public void execute () {
    //Robot.chassis.arcadeDrive(10f, 10f);
  }
}