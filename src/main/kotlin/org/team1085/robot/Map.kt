package org.team1085.robot

class Map {
  companion object {
    
    // PWM Channels
    public val rightCimFront = 0
    public val rightCimBack = 1
    public val rightCimMini = 2

    public val leftCimFront = 3
    public val leftCimBack = 4
    public val leftCimMini = 5

    public val armSolenoidA = 6
    public val armSolenoidB = 7

    // DIO Channels
    public val rightEncoderA = 0
    public val rightEncoderB = 1

    public val leftEncoderA = 2
    public val leftEncoderB = 3

    public val armEncoder = 4

    // IO Channels
    public val leftStickPort = 0
    public val rightStickPort = 1

    // CAN Interface
        public val armTalon = 0
  }
}