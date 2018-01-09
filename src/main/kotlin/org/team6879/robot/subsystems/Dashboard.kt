package org.team6879.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.networktables.NetworkTableInstance
import org.team6879.robot.Map
import org.team6879.robot.commands.Logging

class Dashboard : Subsystem () {

  private val globalTable = NetworkTableInstance.create()
  private val visionTable = globalTable.getTable("vision")
  private val sensorTable = globalTable.getTable("sensor")
  private val errorsTable = globalTable.getTable("errors")

  private val leftStick = Joystick(Map.leftStickPort)
  private val rightStick = Joystick(Map.rightStickPort)

  override fun initDefaultCommand () = setDefaultCommand(Logging())

  public fun getAuto (x: String) = when (x) {
    "LLL" -> null,
    "LLR" -> null,
    "LRL" -> null,
    "LRR" -> null,
    "RLL" -> null,
    "RLR" -> null,
    "RRL" -> null,
    "RRR" -> null,
    else -> null
  }

}