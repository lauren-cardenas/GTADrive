/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //remote values
      
     //controller USB ports
      public static final int DRIVER_CONTROLLER = 2;

     //XBox controller values from driver station
      public static final int BUTTON_A = 1;
      public static final int BUTTON_B = 2;
      public static final int BUTTON_X = 3;
      public static final int BUTTON_Y = 4;
      public static final int LEFT_BUMPER = 5;
      public static final int RIGHT_BUMPER = 6;
      public static final int BACK_BUTTON = 7;
      public static final int START_BUTTON = 8;
      public static final int LEFT_STICK_BUTTON = 9;
      public static final int RIGHT_STICK_BUTTON = 9;

      public static final int LEFT_STICK_X = 0;
      public static final int LEFT_STICK_Y = 1;
      public static final int RIGHT_STICK_X = 4;
      public static final int RIGHT_STICK_Y = 5;

      public static final int LEFT_TRIGGER = 2;
      public static final int RIGHT_TRIGGER = 3;

  //motors
      public static final int LEFT_FRONT_MOTOR = 0;
      public static final int LEFT_REAR_MOTOR = 5;
      public static final int RIGHT_FRONT_MOTOR = 1;
      public static final int RIGHT_REAR_MOTOR = 10;

  //driving variables
      public static final double TURNING_RATE = 0.7;






}
