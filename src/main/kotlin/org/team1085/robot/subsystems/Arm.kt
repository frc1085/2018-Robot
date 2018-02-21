package org.team1085.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.DoubleSolenoid
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.ctre.phoenix.motorcontrol.ControlMode
import org.team1085.robot.Robot
import org.team1085.robot.Map
import org.team1085.robot.commands.RaiseArm

class Arm : Subsystem () {

  private val controller = TalonSRX(2)
  private val solenoid = DoubleSolenoid(0, 1)

  override fun initDefaultCommand () = setDefaultCommand(RaiseLift())
  public fun setSpeed (spd: Double) = controller.set(ControlMode.PercentOutput, spd)
  public fun closeClaw () = solenoid.set(DoubleSolenoid.Value.kReverse)
  public fun openClaw () = solenoid.set(DoubleSolenoid.Value.kForward)

}