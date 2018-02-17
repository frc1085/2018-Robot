package org.team1085.robot.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.robot.Robot

class ArcadeDrive : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = false
  override fun execute () {
    val x = Robot.dashboard.leftStick.getX() as Double
    val y = Robot.dashboard.leftStick.getY() as Double

    Robot.chassis.setLeftSpeed(Math.pow(y - x, 3.0))
    Robot.chassis.setRightSpeed(Math.pow(y + x, 3.0))
  }
}