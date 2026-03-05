package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutoLoader {

    private enum Paths {
        Left,
        Right,
        Center
    }
    private final SendableChooser<Paths> pathChooser;
    private Paths selectedPath;

    public AutoLoader() {
        pathChooser = new SendableChooser<>();
        pathChooser.onChange(this::setPath);

        SmartDashboard.putData(pathChooser);

    }

    public Command getAutoCommand() {
        switch (pathChooser.getSelected()) {
            case Left:
                break;
            case Center:
                break;
            case Right:
                break;
        }
        SequentialCommandGroup cmd = new SequentialCommandGroup(

        );
        return null;
    }

    private void setPath(Paths selectedPath){
        this.selectedPath = selectedPath;
    }
}
