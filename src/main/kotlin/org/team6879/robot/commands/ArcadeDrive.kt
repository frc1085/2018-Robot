package org.team6879.robot.commands

import edu.wpi.first.wpilibj.command.Command
import org.team6879.robot.Robot

class ArcadeDrive : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = false
  override fun execute () {
    Robot.chassis.arcadeDrive(10f, 10f)
  }
}