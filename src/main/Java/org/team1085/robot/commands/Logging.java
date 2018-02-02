package org.team1085.robot.commands;

import org.team1085.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Logging extends Command {

	public Logging() {
		requires(Robot.dashboard);
	}

	protected boolean isFinished() {
		return false;
	}

	public void execute() {}

}