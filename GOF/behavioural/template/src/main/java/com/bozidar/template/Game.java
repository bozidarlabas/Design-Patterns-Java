package com.bozidar.template;

/**
 * Created by bozidar on 01.12.2015..
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        //Initialize the game
        initialize();

        //Start game
        startPlay();

        //End game
        endPlay();
    }
}
