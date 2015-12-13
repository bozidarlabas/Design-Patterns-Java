package com.bozidar.command.command.impl;

import com.bozidar.command.command.Command;
import com.bozidar.command.receiver.Receiver;

/**
 * Created by bozidar on 01.12.2015..
 */
public class DecrementCommand implements Command {
    Receiver receiver;

    public DecrementCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.decrement();
    }

    public void undo() {
        receiver.increment();
    }
}