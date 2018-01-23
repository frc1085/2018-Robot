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

  // Drive Methods
  public fun setSpeed (speed: Double) {
    rightCimFront.set(speed)
    rightCimBack.set(speed)
    rightCimMini.set(speed)

    leftCimFront.set(-speed)
    leftCimBack.set(-speed)
    leftCimMini.set(-speed)
  }

  public fun setRightSpeed (speed: Double) {
    rightCimFront.set(speed)
    rightCimBack.set(speed)
    rightCimMini.set(speed)
  }

  public fun setLeftSpeed (speed: Double) {
    leftCimFront.set(speed)
    leftCimBack.set(speed)
    leftCimMini.set(speed)
  }

  public fun allStop () {
    rightCimFront.stopMotor()
    rightCimBack.stopMotor()
    rightCimMini.stopMotor()

    leftCimFront.stopMotor()
    leftCimBack.stopMotor()
    leftCimMini.stopMotor()
  }

  // Encoder Methods
  public fun resetEncoders () {
    rightEncoder.reset()
    leftEncoder.reset()
  }

  public fun getRightEncoder (): Int = rightEncoder.get()
  public fun getLeftEncoder (): Int = leftEncoder.get()

}
