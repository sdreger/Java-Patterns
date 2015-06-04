package ua.dreger.patterns.command;

/**
 * Created by Sergey on 04.06.2015.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
