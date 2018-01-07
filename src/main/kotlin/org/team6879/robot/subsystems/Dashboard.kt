package org.team6879.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.networktables.NetworkTable
import org.team6879.robot.Map

class Dashboard : Subsystem () {

  private val visionTable = null
  private val sensorTable = null
  private val errorsTable = null

  private val leftStick = Joystick(Map.leftStickPort)
  private val rightStick = Joystick(Map.rightStickPort)

  override fun initDefaultCommand () {}

}