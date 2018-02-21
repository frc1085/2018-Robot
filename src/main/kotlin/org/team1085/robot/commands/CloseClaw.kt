package org.team1085.robot.commands

import edu.wpi.first.wpilibj.command.InstantCommand
import org.team1085.robot.Robot

class CloseClaw : InstantCommand () {
  init { requires(Robot.arm) }
  override fun execute () = Robot.arm.closeClaw()
}