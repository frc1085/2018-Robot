package org.team1085.robot

import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import org.team1085.robot.subsystems.Chassis
import org.team1085.robot.subsystems.Dashboard
import org.team1085.robot.subsystems.Arm

class Robot : IterativeRobot () {

  companion object {
    public val dashboard = Dashboard()
    public val chassis = Chassis()
    public val arm = Arm()
  }

  override fun robotInit () {}
  override fun autonomousInit () = dashboard.getAuto().start()
  override fun teleopInit () = Scheduler.getInstance().removeAll()

  override fun autonomousPeriodic () = Scheduler.getInstance().run()
  override fun teleopPeriodic () = Scheduler.getInstance().run()
}
