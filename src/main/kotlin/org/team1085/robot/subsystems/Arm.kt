package org.team1085.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.ctre.phoenix.motorcontrol.ControlMode
import org.team1085.robot.Map
import org.team1085.robot.commands.Lift

class Arm : Subsystem () {

  private val controller = TalonSRX(1)

  override fun initDefaultCommand () = setDefaultCommand(Lift())
  public fun setSpeed (spd: Double) = controller.set(ControlMode.PercentOutput, spd)

}