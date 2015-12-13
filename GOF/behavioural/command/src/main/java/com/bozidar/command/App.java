package com.bozidar.command;

import com.bozidar.command.command.Command;
import com.bozidar.command.command.impl.DecrementCommand;
import com.bozidar.command.command.impl.IncrementCommand;
import com.bozidar.command.invoker.Invoker;
import com.bozidar.command.receiver.Receiver;

/**
 * Created by bozidar on 01.12.2015..
 */
//Client
public class App {
    public static void main(String[] args) {
        Receiver rec = new Receiver();

        Command incCommand = new IncrementCommand(rec);
        Command decCommand = new DecrementCommand(rec);

        Invoker invoker = new Invoker();
        invoker.setIncCommand(incCommand);
        invoker.setDecCommand(decCommand);
        invoker.addRequest();
        invoker.addRequest();
        invoker.removeRequest();

        System.out.println("Receiver value: " + rec.getValue());


    }
}

