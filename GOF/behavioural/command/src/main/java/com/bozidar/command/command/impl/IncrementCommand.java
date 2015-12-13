package com.bozidar.command.command.impl;

import com.bozidar.command.command.Command;
import com.bozidar.command.receiver.Receiver;

/**
 * Created by bozidar on 01.12.2015..
 */
public class IncrementCommand implements Command {

    private Receiver receiver;

    public IncrementCommand(Receiver rec) {
        receiver = rec;
    }

    @Override
    public void execute() {
        receiver.increment();
    }

    @Override
    public void undo() {
        receiver.decrement();
    }
}
