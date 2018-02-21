package org.team1085.robot.commands

import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.GenericHID.Hand
import org.team1085.robot.Robot

class RaiseArm : Command () {

  init { requires(Robot.arm) }

  override fun isFinished () = false
  override fun execute () {
    val y = Robot.dashboard.rightStick.getY(Hand.kLeft)
    
    Robot.arm.setSpeed(y)
  }
}