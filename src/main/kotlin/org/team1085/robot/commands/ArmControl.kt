package org.team1085.robot.commands

import org.team1085.robot.Robot

class ArmControl : Command () {

  init{
    requires(Robot.arm)
  }

  override fun initialize () = Robot.arm.resetEncoder()
  override fun isFinished () = false

}