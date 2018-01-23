package org.team6879.robot.commands

import edu.wpi.first.wpilibj.command.PIDCommand
import org.team6879.robot.Robot

class DriveFor (dist: Double) : PIDCommand (4.0, 20.0, 5.0) {

  init {
    requires(Robot.chassis)
    setSetpoint(dist)
  }

  override fun returnPIDInput () = Robot.chassis.getRightEncoder()
  override fun usePIDOutput (value: Double) = Robot.chassis.setSpeed(value)

  override fun initialize () = Robot.chassis.resetEncoders()
  override fun isFinished () = false

}