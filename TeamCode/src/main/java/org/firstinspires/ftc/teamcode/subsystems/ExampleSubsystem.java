package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.utils.IReportable;

@Disabled
public class ExampleSubsystem extends OpMode implements IReportable{
  private static ExampleSubsystem instance;
  private DcMotor motor;
  private double power;
  public static ExampleSubsystem getInstance(){
    if(instance == null){
      instance = new ExampleCommand();
    }
    return instance;
  }

  @Override
  public void init(){
    /*
     * put init for this subsystem here
     *
    */
    motor = hardwareMap.get(DcMotor.class, RobotMap.MOTOR_NAME);
    power = 0
  }
  @Override
  public void init_loop(){
    /*
     * put init loop for this subsystem here
     *
    */
  }
  @Override
  public void start(){
    /*
     * put start for this subsystem here
     *
    */
  }
  @Override
  public void loop(){
    /*
     * put loop for this subsystem here
     *
    */
    power = -gamepad1.left_stick_y;
    motor.setPower(power);
  }
  @Override
  public void stop(){
    /*
     *
     * put stop for this subsystem here
     *
    */
    motor.setPower(0);
  }
  public void report(){
    telemetry.addData("Motor:","power: (2%f)",power);
  }
}
