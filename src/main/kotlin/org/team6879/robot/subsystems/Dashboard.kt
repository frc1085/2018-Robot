package org.team6879.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.wpilibj.networktables.NetworkTable
import org.team6879.robot.Map

class Dashboard : Subsystem () {

  private val visionTable = NetworkTable.getTable("vision")
  private val sensorTable = NetworkTable.getTable("sensor")
  private val errorsTable = NetworkTable.getTable("errors")

  private val leftStick = Joystick(Map.leftStickPort)
  private val rightStick = Joystick(Map.rightStickPort)

  override fun initDefaultCommand () {}

}