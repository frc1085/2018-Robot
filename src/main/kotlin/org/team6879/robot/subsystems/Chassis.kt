package org.team6879.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.PWMTalonSRX
import org.team6879.robot.Map
import org.team6879.robot.commands.ArcadeDrive

class Chassis : Subsystem () {

  private val leftSpeedController = PWMTalonSRX(Map.leftTalonChannel)
  private val rightSpeedController = PWMTalonSRX(Map.rightTalonChannel)

  override fun initDefaultCommand () = setDefaultCommand(ArcadeDrive())

  public fun arcadeDrive (spd: Float, rot: Float) {
    
  }
}