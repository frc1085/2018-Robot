package org.team1085.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DriverStation;
import org.team1085.robot.Map;
import org.team1085.robot.commands.Logging;

public class Dashboard extends Subsystem {

  private DriverStation station = DriverStation.getInstance();

  private NetworkTableInstance globalTable = NetworkTableInstance.create();
  private NetworkTable visionTable = globalTable.getTable("vision");
  private NetworkTable sensorTable = globalTable.getTable("sensor");
  private NetworkTable errorsTable = globalTable.getTable("errors");

  private Joystick leftStick = Joystick(Map.leftStickPort);
  private Joystick rightStick = Joystick(Map.rightStickPort);

  public void initDefaultCommand () { setDefaultCommand(new Logging()); }

  public String selectAuto (){
    String mes = station.getGameSpecificMessage();
    switch(mes){
      case "LLL": return "lll";
      case "LLR": return "llr";
      default: return "other";
    }
}
