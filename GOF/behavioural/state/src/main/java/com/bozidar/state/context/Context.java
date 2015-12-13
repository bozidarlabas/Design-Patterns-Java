package com.bozidar.state.context;

import com.bozidar.state.state.State;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }
}
