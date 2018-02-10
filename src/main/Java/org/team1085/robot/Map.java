package org.team1085.robot;

public class Map {

    // PWM
    public static final int RIGHT_CIM_FRONT = 0;
    public static final int RIGHT_CIM_BACK = 1;
    public static final int RIGHT_CIM_MINI = 2;

    public static final int LEFT_CIM_FRONT = 3;
    public static final int LEFT_CIM_BACK = 4;
    public static final int LEFT_CIM_MINI = 5;

    public static final boolean LEFT_INVERTED = true;
    public static final boolean RIGHT_INVERTED = false;

    // DIO
    public static final int RIGHT_ENCODER_A = 0;
    public static final int RIGHT_ENCODER_B = 1;

    public static final int LEFT_ENCODER_A = 2;
    public static final int LEFT_ENCODER_B = 3;

    // OI
    public static final int CONTROLLER_1_PORT = 0; // Controls chassis and intake
    public static final int CONTROLLER_2_PORT = 1; // Controls arm
    // Axis
    public static final int X_AXIS = 0;
    public static final int Y_AXIS = 1;
    // Xbox
    public static final int L_X_AXIS = 0;
    public static final int L_Y_AXIS = 1;
    public static final int R_X_AXIS = 4;
    public static final int R_Y_AXIS = 5;
    public static final int L_TRIGGER = 2;
    public static final int R_TRIGGER = 3;
    // Buttons
    // Xbox
    public static final int LB = 5;
    public static final int RB = 6;
    // Joystick
    public static final int TRIGGER = 1;
    public static final int LOCK = 2;

}
