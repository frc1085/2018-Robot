package org.team1085.robot.subsystems;

import org.team1085.robot.Map;
import org.team1085.robot.Robot;
import org.team1085.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {

    private Spark rightCimFront, rightCimBack, rightCimMini;
    private Spark leftCimFront, leftCimBack, leftCimMini;
    private Encoder leftEncoder, rightEncoder;

    private SparkGroup leftSide;
    private SparkGroup rightSide;

    public Chassis() {
        leftCimFront = new Spark(Map.LEFT_CIM_FRONT);
        leftCimBack = new Spark(Map.LEFT_CIM_BACK);
        leftCimMini = new Spark(Map.LEFT_CIM_MINI);

        rightCimFront = new Spark(Map.RIGHT_CIM_FRONT);
        rightCimBack = new Spark(Map.RIGHT_CIM_BACK);
        rightCimMini = new Spark(Map.RIGHT_CIM_MINI);

        leftSide = new SparkGroup(leftCimFront, leftCimBack, leftCimMini, Map.LEFT_INVERTED);
        rightSide = new SparkGroup(rightCimFront, rightCimBack, rightCimMini, Map.RIGHT_INVERTED);

        leftEncoder = new Encoder(Map.LEFT_ENCODER_A, Map.LEFT_ENCODER_B);
        rightEncoder = new Encoder(Map.RIGHT_ENCODER_A, Map.RIGHT_ENCODER_B);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(Robot.arcade);
    }

    // Drive Methods
    public void setRightSpeed(Double speed) {
        rightSide.set(speed);
    }

    public void setLeftSpeed(Double speed) {
        leftSide.set(speed);
    }

    public void setSpeed(Double speed) {
        setLeftSpeed(speed);
        setRightSpeed(speed);
    }

    public void allStop() {
        leftSide.stopMotor();
        rightSide.stopMotor();
    }

    // Encoder Methods
    public void resetEncoders() {
        rightEncoder.reset();
        leftEncoder.reset();
    }

    public double getRightEncoder() {
        return (double) rightEncoder.get();
    }

    public double getLeftEncoder() {
        return (double) leftEncoder.get();
    }

}
