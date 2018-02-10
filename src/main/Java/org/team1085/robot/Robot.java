package org.team1085.robot;

import edu.wpi.first.wpilibj.command.Command;
import org.team1085.robot.commands.ArcadeDrive;
import org.team1085.robot.subsystems.Chassis;
import org.team1085.robot.subsystems.Dashboard;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

    public static Dashboard dashboard;
    public static Chassis chassis;

    public static Command arcade;

    public void robotInit() {
        dashboard = new Dashboard();
        chassis = new Chassis();

        arcade = new ArcadeDrive();
    }

    public void autonomousInit() {}

    public void teleopInit() {}

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

}