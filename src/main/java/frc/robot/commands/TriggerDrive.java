/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

//use RIGHT_TRIGGER_PRIMARY to go forward
//use LEFT_TRIGGER_PRIMARY to go back
//use LEFT_STICK_X to steer left and right

public class TriggerDrive extends Command {
  public TriggerDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double triggerValue = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_TRIGGER_PRIMARY) - Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_TRIGGER_PRIMARY); 
    double steer = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_X_PRIMARY);

    //set motor speeds
    Robot.driveTrain.setLeftMotors(triggerValue + steer);
    Robot.driveTrain.setRightMotors(triggerValue - steer);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
