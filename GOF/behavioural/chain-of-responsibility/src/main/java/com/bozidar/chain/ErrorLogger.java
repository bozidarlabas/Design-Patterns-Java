package com.bozidar.chain;

/**
 * Created by bozidar on 01.12.2015..
 */
//Concrete Handler
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
