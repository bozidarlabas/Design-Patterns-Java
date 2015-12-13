package com.bozidar.memento;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
