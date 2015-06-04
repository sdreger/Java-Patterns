package ua.dreger.patterns.command;

import ua.dreger.patterns.command.Command;

/**
 * Created by Sergey on 04.06.2015.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
