package com.bozidar.command.receiver;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Receiver {
    private int value;

    public Receiver() {
        value = 0;
    }

    public void increment() {
        ++value;
    }

    public void decrement() {
        --value;
    }

    public int getValue() {
        return value;
    }

}
