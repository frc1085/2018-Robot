package org.team1085.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

public class SparkGroup implements SpeedController {

    private Spark front, back, mini;
    private boolean isInverted;
    private double speed;

    public SparkGroup(Spark front, Spark back, Spark mini, boolean isInverted) {
        this.front = front;
        this.back = back;
        this.mini = mini;
        setInverted(isInverted);
    }

    public void pidWrite(double output) {
        front.pidWrite(output);
        back.pidWrite(output);
        mini.pidWrite(output);
    }

    public void set(double speed) {
        this.speed = speed;
        front.set(speed);
        back.set(speed);
        mini.set(speed);
    }

    public double get() {
        return speed;
    }

    public void setInverted(boolean isInverted) {
        this.isInverted = isInverted;
        front.setInverted(isInverted);
        back.setInverted(isInverted);
        mini.setInverted(isInverted);
    }

    public boolean getInverted() {
        return isInverted;
    }

    public void disable() {
        front.disable();
        back.disable();
        mini.disable();
    }

    public void stopMotor() {
        front.stopMotor();
        back.stopMotor();
        mini.stopMotor();
    }

}
