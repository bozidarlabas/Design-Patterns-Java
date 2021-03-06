package com.bozidar.chain;

/**
 * Created by bozidar on 01.12.2015..
 */
//Concrete Handler
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
