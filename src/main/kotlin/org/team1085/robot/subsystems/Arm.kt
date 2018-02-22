package org.team1085.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.DoubleSolenoid
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.ctre.phoenix.motorcontrol.ControlMode
import org.team1085.robot.Robot
import org.team1085.robot.Map
import org.team1085.robot.commands.RaiseArm

class Arm : Subsystem () {

  private val controller = TalonSRX(Map.armTalon)
  private val solenoid = DoubleSolenoid(Map.clawOpen, Map.clawClose)

  override fun initDefaultCommand () = setDefaultCommand(RaiseArm())
  public fun setSpeed (spd: Double) = controller.set(ControlMode.PercentOutput, spd)
  public fun closeClaw () = solenoid.set(DoubleSolenoid.Value.kReverse)
  public fun openClaw () = solenoid.set(DoubleSolenoid.Value.kForward)

}