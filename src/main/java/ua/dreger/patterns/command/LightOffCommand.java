package ua.dreger.patterns.command;

/**
 * Created by Sergey on 04.06.2015.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
