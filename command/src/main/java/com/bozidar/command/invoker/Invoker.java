package com.bozidar.command.invoker;

import com.bozidar.command.command.Command;

import java.util.Stack;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Invoker {
    Stack<Command> commands;
    Command incCommand;
    Command decCommand;

    public Invoker(){
        commands = new Stack<>();
    }

    public void setIncCommand(Command command) {
        incCommand = command;
    }
    public void setDecCommand(Command command) {
        decCommand = command;
    }

    public void undoAll(){
        Command cmd = null;
        while (!commands.empty()){
            cmd = commands.pop();
            cmd.undo();
        }
    }

    public void addRequest(){
        incCommand.execute();
        commands.add(incCommand);
    }

    public void removeRequest(){
        decCommand.execute();
        commands.add(decCommand);
    }

    public void commit(){
        commands = new Stack<>();
    }



}
