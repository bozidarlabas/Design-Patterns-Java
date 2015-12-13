package com.bozidar.command.command;

/**
 * Created by bozidar on 01.12.2015..
 */
public interface Command {
    public void execute();
    public void undo();
}
