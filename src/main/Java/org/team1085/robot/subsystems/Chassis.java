package org.team1085.robot.subsystems;

import org.team1085.robot.Map;
import org.team1085.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {

	private Spark rightCimFront, rightCimBack, rightCimMini;
	private Spark leftCimFront, leftCimBack, leftCimMini;
	private Encoder leftEncoder, rightEncoder;

	public Chassis() {
		rightCimFront = new Spark(Map.RIGHT_CIM_FRONT);
		rightCimBack = new Spark(Map.RIGHT_CIM_BACK);
		rightCimMini = new Spark(Map.RIGHT_CIM_MINI);

		leftCimFront = new Spark(Map.LEFT_CIM_FRONT);
		leftCimBack = new Spark(Map.LEFT_CIM_BACK);
		leftCimMini = new Spark(Map.LEFT_CIM_MINI);

		leftEncoder = new Encoder(Map.LEFT_ENCODER_A, Map.LEFT_ENCODER_B);
		rightEncoder = new Encoder(Map.RIGHT_ENCODER_A, Map.RIGHT_ENCODER_B);
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
	}

	// Drive Methods
	public void setSpeed(Double speed) {
		rightCimFront.set(speed);
		rightCimBack.set(speed);
		rightCimMini.set(speed);

		leftCimFront.set(-speed);
		leftCimBack.set(-speed);
		leftCimMini.set(-speed);
	}

	public void setRightSpeed(Double speed) {
		rightCimFront.set(speed);
		rightCimBack.set(speed);
		rightCimMini.set(speed);
	}

	public void setLeftSpeed(Double speed) {
		leftCimFront.set(speed);
		leftCimBack.set(speed);
		leftCimMini.set(speed);
	}

	public void allStop() {
		rightCimFront.stopMotor();
		rightCimBack.stopMotor();
		rightCimMini.stopMotor();

		leftCimFront.stopMotor();
		leftCimBack.stopMotor();
		leftCimMini.stopMotor();
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
