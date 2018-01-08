package org.team6879.robot.commands

import edu.wpi.first.wpilibj.command.Command
import org.team6879.robot.Robot

class Logging : Command () {

  init { requires(Robot.dashboard) }

  override fun isFinished () = false
  override fun execute () {
    
  }

}