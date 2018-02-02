package org.team1085.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Encoder;
import org.team1085.robot.Map;
import org.team1085.robot.commands.ArcadeDrive;

public class Chassis extends Subsystem {

  private Spark rightCimFront, rightCimBack, rightCimMini;
  private Spark leftCimFront, leftCimBack, leftCimMini;
  private Encoder leftEncoder, rightEncoder;

  public Chassis(){
    rightCimFront = new Spark(Map.rightCimFront);
    rightCimBack = new Spark(Map.rightCimBack);
    rightCimMini = new Spark(Map.rightCimMini);

    leftCimFront = new Spark(Map.leftCimFront);
    leftCimBack = new Spark(Map.leftCimBack);
    leftCimMini = new Spark(Map.leftCimMini);

    leftEncoder = new Encoder(Map.leftEncoderA, Map.leftEncoderB);
    rightEncoder = new Encoder(Map.rightEncoderA, Map.rightEncoderB);
  }

  public void initDefaultCommand () {setDefaultCommand(new ArcadeDrive());}

 // Drive Methods
  public void setSpeed (Double speed) {
    rightCimFront.set(speed);
    rightCimBack.set(speed);
    rightCimMini.set(speed);

    leftCimFront.set(-speed);
    leftCimBack.set(-speed);
    leftCimMini.set(-speed);
  }

  public void setRightSpeed (Double speed) {
    rightCimFront.set(speed);
    rightCimBack.set(speed);
    rightCimMini.set(speed);
  }

  public void setLeftSpeed (Double speed) {
    leftCimFront.set(speed);
    leftCimBack.set(speed);
    leftCimMini.set(speed);
  }

  public void allStop () {
    rightCimFront.stopMotor();
    rightCimBack.stopMotor();
    rightCimMini.stopMotor();

    leftCimFront.stopMotor();
    leftCimBack.stopMotor();
    leftCimMini.stopMotor();
  }

  // Encoder Methods
  public void resetEncoders () {
    rightEncoder.reset();
    leftEncoder.reset();
  }

  public Double getRightEncoder () { rightEncoder.get().toDouble(); }
  public Double getLeftEncoder () { leftEncoder.get().toDouble(); }

}
