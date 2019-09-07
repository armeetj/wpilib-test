/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.*;

/**
 * @author Armeet Singh Jatyani
 * 2019-2020  
 * Team 2854 | EVHS Robotics
 */
public class DriveTrain extends Subsystem {

  //DriveTrain controllers
  //leftMotor1 and rightMotor1 are the primary controllers
  //all other controllers follow the primary controllers (see initDriveTrain())
  private TalonSRX leftMotor1;
  private TalonSRX leftMotor2;
  private TalonSRX leftMotor3;
  private TalonSRX rightMotor1;
  private TalonSRX rightMotor2;
  private TalonSRX rightMotor3;

  //initialize motors
  public void initDriveTrain()
  {
    leftMotor1 = new TalonSRX(RobotMap.LEFT_TALON_1);
    leftMotor2 = new TalonSRX(RobotMap.LEFT_TALON_2);
    leftMotor3 = new TalonSRX(RobotMap.LEFT_TALON_3);
  
    rightMotor1 = new TalonSRX(RobotMap.RIGHT_TALON_1);
    rightMotor2 = new TalonSRX(RobotMap.RIGHT_TALON_2);
    rightMotor3 = new TalonSRX(RobotMap.RIGHT_TALON_3);

    leftMotor2.follow(leftMotor1);
    leftMotor3.follow(leftMotor1);

    rightMotor2.follow(rightMotor1);
    rightMotor3.follow(rightMotor1); 
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    setDefaultCommand(new TriggerDrive());
  }

  public void setLeftMotors(double speed)
  {
    leftMotor1.set(ControlMode.PercentOutput, speed);
  }

  public void setRightMotors(double speed)
  {
    rightMotor1.set(ControlMode.PercentOutput, speed);
  }
}
