package ua.dreger.patterns.command;

/**
 * Created by Sergey on 04.06.2015.
 */
public class CeilingFanOffCommand implements Command {
     CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }
}
