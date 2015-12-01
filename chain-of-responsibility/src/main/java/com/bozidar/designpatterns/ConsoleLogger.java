package com.bozidar.designpatterns;

/**
 * Created by bozidar on 01.12.2015..
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console (Logger): " + message);
    }
}
