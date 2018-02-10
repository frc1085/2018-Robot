package org.team1085.robot.subsystems;

import org.team1085.robot.Map;
import org.team1085.robot.commands.Logging;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.networktables.NetworkTable;

public class Dashboard extends Subsystem {

    private static DriverStation station = DriverStation.getInstance();

    private static NetworkTableInstance globalTable = NetworkTableInstance.create();
    private static NetworkTable visionTable = globalTable.getTable("vision");
    private static NetworkTable sensorTable = globalTable.getTable("sensor");
    private static NetworkTable errorsTable = globalTable.getTable("errors");
    private static NetworkTable debugTable = globalTable.getTable("debug");

    public void initDefaultCommand() {
        setDefaultCommand(new Logging());
    }

    public String selectAuto() {
        String mes = station.getGameSpecificMessage();
        switch (mes) {
            case "LLL":
                return "lll";
            case "LLR":
                return "llr";
            default:
                return "other";
        }
    }
}
