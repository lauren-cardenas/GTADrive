/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    XboxController driverController = new XboxController(RobotMap.DRIVER_CONTROLLER);

    Button dButtonA = new JoystickButton(this.driverController, RobotMap.BUTTON_A);
    Button dButtonB = new JoystickButton(this.driverController, RobotMap.BUTTON_B);
    Button dButtonX = new JoystickButton(this.driverController, RobotMap.BUTTON_X);
    Button dButtonY = new JoystickButton(this.driverController, RobotMap.BUTTON_Y);
    Button dButtonBack = new JoystickButton(this.driverController, RobotMap.BACK_BUTTON);
    Button dButtonStart = new JoystickButton(this.driverController, RobotMap.START_BUTTON);

    public boolean getDriverButton(int axis){
      return this.driverController.getRawButton(axis);
    }

    public double getDriverRawAxis(int axis) {
      return this.driverController.getRawAxis(axis);
    }




}
