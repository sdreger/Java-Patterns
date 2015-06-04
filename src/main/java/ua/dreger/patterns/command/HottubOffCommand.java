package ua.dreger.patterns.command;

import ua.dreger.patterns.command.Command;

/**
 * Created by Sergey on 04.06.2015.
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
