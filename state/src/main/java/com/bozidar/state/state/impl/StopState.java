package com.bozidar.state.state.impl;

import com.bozidar.state.context.Context;
import com.bozidar.state.state.State;

/**
 * Created by bozidar on 01.12.2015..
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
