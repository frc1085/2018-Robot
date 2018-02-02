package org.team1085.robot;

import org.team1085.robot.subsystems.Chassis;
import org.team1085.robot.subsystems.Dashboard;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

	public static Dashboard dashboard = new Dashboard();
	public static Chassis chassis = new Chassis();

	public void robotInit() {}

	public void autonomousInit() {}

	public void teleopInit() {}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

}