package org.team1085.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team1085.robot.Map;
import org.team1085.robot.OI;
import org.team1085.robot.Robot;

public class ArcadeDrive extends Command {

    public ArcadeDrive() {
        requires(Robot.chassis);
    }

    protected boolean isFinished() {
        return false;
    }

    public void execute() {
        Robot.chassis.getLeftSide().set(OI.controller1.getRawAxis(Map.LEFT_Y_AXIS));
        Robot.chassis.getRightSide().set(OI.controller1.getRawAxis(Map.RIGHT_Y_AXIS));
    }
}
