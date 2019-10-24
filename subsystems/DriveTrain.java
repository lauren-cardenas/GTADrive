/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  
  VictorSPX motorLeft1 = new VictorSPX(RobotMap.LEFT_FRONT_MOTOR);
  VictorSPX motorLeft2 = new VictorSPX(RobotMap.LEFT_REAR_MOTOR);
  VictorSPX motorRight1 = new VictorSPX(RobotMap.RIGHT_FRONT_MOTOR);
  VictorSPX motorRight2 = new VictorSPX(RobotMap.RIGHT_REAR_MOTOR);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setLeftMotors(double speed){
    motorLeft1.set(ControlMode.PercentOutput, -speed);
    motorLeft2.set(ControlMode.PercentOutput, -speed);
  }

  public void setRightMotors(double speed){
    motorRight1.set(ControlMode.PercentOutput, speed);
    motorRight2.set(ControlMode.PercentOutput, speed);
  }

}
