package org.team1085.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Encoder
import org.team1085.robot.Map

class Arm : Subsystem () {

  private val encoder = Encoder(channelA, channelB)
  private val talon = WPI_TalonSRX(Map.armTalon) 
  private val solenoid = DoubleSolenoid(Map.armSolenoidA, Map.armSolenoidB) // 6, 7

  override fun initDefaultCommand () = setDefaultCommand(ArmControl())

  // Talon Methods
  public fun setSpeed (speed: Double) = talon.set(speed)
  public fun getSpeed () = talon.get()
  public fun disableTalon () = talon.disable()

  // Solenoid Methods
  public fun clamp () = solenoid.set(DoubleSolenoid.value.kForward)
  public fun unclamp () = solenoid.set(DoubleSolenoid.value.kReverse)
  public fun stop () = solenoid.set(DoubleSolenoid.value.kOff)

  // Encoder Methods
  public fun resetEncoder () = encoder.reset()
  public fun getEncoder () = encoder.get().toDouble()

}