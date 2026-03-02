package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class AutoLoader {

    private enum Paths {

    }
    private final SendableChooser<Paths> pathChooser;
    private Paths selectedPath;

    public AutoLoader() {
        pathChooser = new SendableChooser<>();
        pathChooser.onChange(this::setPath);



    }

    private void setPath(Paths selectedPath){
        this.selectedPath = selectedPath;
    }
}
