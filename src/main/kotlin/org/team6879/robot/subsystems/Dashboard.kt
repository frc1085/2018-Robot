package org.team6879.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.networktables.NetworkTableInstance
import org.team6879.robot.Map
import org.team6879.robot.commands.Logging

class Dashboard : Subsystem () {

  private val globalTable = NetworkTableInstance.create()
  private val visionTable = globalTable.getTable("vision")
  private val sensorTable = globalTable.getTable("sensor")
  private val errorsTable = globalTable.getTable("errors")

  private val leftStick = Joystick(Map.leftStickPort)
  private val rightStick = Joystick(Map.rightStickPort)

  override fun initDefaultCommand () = setDefaultCommand(Logging())

  // public fun getAuto (x: String): String = when (x) {
  //   "LLL" -> "LLL",
  //   else -> "LLL"
  // }

}

// Don't touch anything below this line, 
// it's critical to robot operation
// (i see you Walnut) -Shmish

/*



                                          `-.`'.-'
                                       `-.        .-'.
                                    `-.    -./\.-    .-'
                                        -.  /_|\  .-
                                    `-.   `/____\'   .-'.
                                 `-.    -./.-""-.\.-      '
                                    `-.  /< (()) >\  .-'
                                  -   .`/__`-..-'__\'   .-
                                ,...`-./___|____|___\.-'.,.
                                   ,-'   ,` . . ',   `-,
                                ,-'   ________________  `-,
                                   ,'/____|_____|_____\
                                  / /__|_____|_____|___\
                                 / /|_____|_____|_____|_\
                                ' /____|_____|_____|_____\
                              .' /__|_____|_____|_____|___\
                             ,' /|_____|_____|_____|_____|_\
,,---''--...___...--'''--.. /../____|_____|_____|_____|_____\ ..--```--...___...--``---,,
                           '../__|_____|_____|_____|_____|___\
      \    )              '.:/|_____|_____|_____|_____|_____|_\               (    /
      )\  / )           ,':./____|_____|_____|_____|_____|_____\             ( \  /(
     / / ( (           /:../__|_____|_____|_____|_____|_____|___\             ) ) \ \
    | |   \ \         /.../|_____|_____|_____|_____|_____|_____|_\           / /   | |
 .-.\ \    \ \       '..:/____|_____|_____|_____|_____|_____|_____\         / /    / /.-.
(=  )\ `._.' |       \:./ _  _ ___  ____ ____ _    _ _ _ _ _  _ ___\        | `._.' /(  =)
 \ (_)       )       \./  |\/| |__) |___ |___ |___ _X_ _X_  \/  _|_ \       (       (_) /
  \    `----'         """"""""""""""""""""""""""""""""""""""""""""""""       `----'    /
   \   ____\__          __ __    _  __ _     _  __ ________    _____        __/____   /
    \ (=\     \        (_ |_ |V||_)|_ |_)   |_|(_ /   |  |    |_  |        /     /-) /
     \_)_\     \       __)|__| ||  |__| \   | |__)\___|__|_   |  _|_      /     /_(_/
          \     \                                                        /     /
           )     )  _                                                _  (     (
          (     (,-' `-..__                                    __..-' `-,)     )
           \_.-''          ``-..____                  ____..-''          ``-._/
            `-._                    ``--...____...--''                    _.-'
                `-.._                                                _..-'
                     `-..__   I Wonder Who Put This Here       __..-'
                           ``-..____                  ____..-''
                                    ``--...____...--''

*/
