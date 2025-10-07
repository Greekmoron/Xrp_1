package frc.robot.commands;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;


public class coolcommand extends Command {
    private final Arm m_arm;
    private final Supplier<Double> m_angledegSupplier;

    public coolcommand(Arm arm, Supplier<Double> angledegSupplier)
    {
        m_arm = arm;
        m_angledegSupplier = angledegSupplier;
        addRequirements(arm);
    }
@Override
    public void execute(){
m_arm.setAngle(m_angledegSupplier.get());
    }
    @Override
    public void end(boolean interrupted){}
    @Override
    public boolean isFinished(){
        return false;
    }
}
