package org.team1085.robot.pathing

import edu.wpi.first.wpilibj.command.Command
import jaci.pathfinder.Pathfinder
import jaci.pathfinder.Trajectory
import jaci.pathfinder.Waypoint
import jaci.pathfinder.modifiers.TankModifier;
import jaci.pathfinder.followers.EncoderFollower

class PathFollower (vararg coords: Triple<Double, Double, Double>) : Command () {

  private val config = Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC, Trajectory.Config.SAMPLES_HIGH, 0.05, 1.7, 2.0, 60.0)
  private val points = coords.map { coord -> Waypoint(coord.first, coord.second, coord.third) }.toSet().toTypedArray()
  private val center = Pathfinder.generate(points, config)
  private val modify = TankModifier(center).modify(0.635)

  private val leftFollower = EncoderFollower(modify.getLeftTrajectory())
  private val rightFollower = EncoderFollower(modify.getRightTrajectory())

  override fun isFinished () = leftFollower.isFinished() && rightFollower.isFinished()

  override fun execute () {
    
  }

}