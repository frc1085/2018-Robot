package org.team6879.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.Encoder
import org.team6879.robot.Map
import org.team6879.robot.commands.ArcadeDrive

class Chassis : Subsystem () {

  private val rightCimFront = Spark(Map.rightCimFront)
  private val rightCimBack = Spark(Map.rightCimBack)
  private val rightCimMini = Spark(Map.rightCimMini)
  
  private val leftCimFront = Spark(Map.leftCimFront)
  private val leftCimBack = Spark(Map.leftCimBack)
  private val leftCimMini = Spark(Map.leftCimMini)

  private val rightEncoder = Encoder(Map.rightEncoderA, Map.rightEncoderB)
  private val leftEncoder = Encoder(Map.leftEncoderA, Map.leftEncoderB)

  override fun initDefaultCommand () = setDefaultCommand(ArcadeDrive())

  public fun arcadeDrive (spd: Float, rot: Float) {}

  public fun driveDistance (spd: Float, dist: Float) {}

  public fun turnAngle (spd: Float, turns: Float) {}

  public fun allStop () {}

}