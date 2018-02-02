package org.team1085.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.team1085.robot.subsystems.Chassis;
import org.team1085.robot.subsystems.Dashboard;

public class Robot extends IterativeRobot{

  public Dashboard dashboard;
  public Chassis chassis;

  public Robot(){
    dashboard = new Dashboard();
    chassis = new Chassis();
  }
  
  public void robotInit () {}
  public void autonomousInit () {}
  public void teleopInit () {}

  public void autonomousPeriodic () = Scheduler.getInstance().run()
  public void teleopPeriodic () = Scheduler.getInstance().run()

}