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

//motor controllers
  public static final int LEFT_TALON_1 = 8;
  public static final int LEFT_TALON_2 = 2;
  public static final int LEFT_TALON_3 = 7;

  public static final int RIGHT_TALON_1 = 6;
  public static final int RIGHT_TALON_2 = 4;
  public static final int RIGHT_TALON_3 = 3;

  //elevator, claw, and intake
  public static final int ELEVATOR_MASTER = 11;
  public static final int ELEVATOR_SLAVE = 12;

  public static final int CLAW_MASTER = 10; //inverted
  public static final int CLAW_SLAVE = 9;

  public static int INTAKE_NASTER = 1;

  //shifter
  public static final int SHIFTER_UP = 1;
  public static final int SHIFTER_DOWN = 2;

  //hatch
  public static final int HATCH_EXTEND_1 = 3;
  public static final int HATCH_EXTEND_2 = 4;

  public static final int HATCH_EXTEND1_1 = 5;
  public static final int HATCH_EXTEND2_2 = 6;

  //controller mappings
  public static final int CONTROLLER_PRIMARY = 0;

  //joysticks
  public static final int LEFT_STICK_X_PRIMARY = 0;
  public static final int LEFT_STICK_Y_PRIMARY= 0;

  public static final int RIGHT_STICK_X_PRIMARY = 0;
  public static final int RIGHT_STICK_Y_PRIMARY = 0;

  //triggers
  public static final int LEFT_TRIGGER_PRIMARY = 0;
  public static final int RIGHT_TRIGGER_PRIMARY = 0;

  //colored ABXY buttons
  public static final int A_BUTTON_DOWN_PRIMARY = 0;
  public static final int B_BUTTON_RIGHT_PRIMARY = 0;
  public static final int X_BUTTON_LEFT_PRIMARY = 0;
  public static final int Y_BUTTON_UP_PRIMARY = 0;

  //back bumpers
  public static final int BACK_BUMBPER_LEFT_PRIMARY = 0;
  public static final int BACK_BUMBPER_RIGHT_PRIMARY = 0;

  //directional pad
  public static final int D_PAD_DOWN_PRIMARY = 0;
  public static final int D_PAD_RIGHT_PRIMARY = 0;
  public static final int D_PAD_LEFT_PRIMARY = 0;
  public static final int D_PAD_UP_PRIMARY = 0;

}
