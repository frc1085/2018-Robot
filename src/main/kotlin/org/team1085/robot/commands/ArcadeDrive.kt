package org.team1085.robot.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.robot.Robot

class ArcadeDrive : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = return false
  override fun execute () {
    //Robot.chassis.arcadeDrive(10f, 10f)
  }
}