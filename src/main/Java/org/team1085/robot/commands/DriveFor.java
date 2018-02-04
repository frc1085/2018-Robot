package org.team1085.robot.commands;

import org.team1085.robot.Robot;

import edu.wpi.first.wpilibj.command.PIDCommand;

public class DriveFor extends PIDCommand {

    public DriveFor(double dist) {
        super(4.0, 20.0, 5.0);
        requires(Robot.chassis);
        setSetpoint(dist);
    }

    public void initialize() {
        Robot.chassis.resetEncoders();
    }

    protected double returnPIDInput() {
        return Robot.chassis.getRightEncoder();
    }

    protected void usePIDOutput(double value) {
        Robot.chassis.setSpeed(value);
    }

    protected boolean isFinished() {
        return false;
    }
}