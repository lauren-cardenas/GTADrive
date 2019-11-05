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

import edu.wpi.first.wpilibj.Encoder;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  
  VictorSPX motorLeft1 = new VictorSPX(RobotMap.LEFT_FRONT_MOTOR);
  VictorSPX motorLeft2 = new VictorSPX(RobotMap.LEFT_REAR_MOTOR);
  VictorSPX motorRight1 = new VictorSPX(RobotMap.RIGHT_FRONT_MOTOR);
  VictorSPX motorRight2 = new VictorSPX(RobotMap.RIGHT_REAR_MOTOR);

  
  //Encoders begin to count as soon as the robot is on and the motors move
  // Digital input ports can be found on RobotMap
  // False indicates that no inversion in counting direction is happening
  // k4X is the encoding type

  Encoder leftEnc = new Encoder(RobotMap.leftEnc1, RobotMap.leftEnc2, false, Encoder.EncodingType.k4X);
  Encoder rightEnc = new Encoder(RobotMap.rightEnc1, RobotMap.rightEnc2, false, Encoder.EncodingType.k4X);
  
  //Gets a raw encoder value
  //Similarly, getCount will give you the number of
  //"clicks" it has recorded

  public double getLeftRaw(){
    return leftEnc.getRaw();
  }

  public double getRightRaw(){
    return rightEnc.getRaw();
  }

  //Averages the raw values of the left and right encoders
  public double getRawAvg(){
    return (leftEnc.getRaw() + rightEnc.getRaw())/2;
  }

  //Gets a distance based on a factor for units per encoder value
  //Units used is up to the team
  public double getAvgDistance(){
    return getRawAvg() * 0.0008;
  }

  //Resets the encoders so that they read from 0 again
  public void encReset(){
    leftEnc.reset();
    rightEnc.reset();
  }
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
