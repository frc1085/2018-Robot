package org.team1085.robot.commands;

import edu.wpi.first.wpilibj.command.PIDCommand;
import org.team1085.robot.Robot;

class DriveFor extends PIDCommand {

  private double dist;

  public DriveFor(double dist) {
      this.dist = dist;
      super(4.0, 20.0, 5.0);
  }

  public void init () {
    requires(Robot.chassis);
    setSetpoint(dist);
  }

  public Encoder returnPIDInput () { Robot.chassis.getRightEncoder(); }
  public void usePIDOutput(Double value) { Robot.chassis.setSpeed(value); }

  public void initialize (){ Robot.chassis.resetEncoders(); }
  public boolean isFinished (){ return false; }

}