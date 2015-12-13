package com.bozidar.mediator;

import com.bozidar.mediator.colleagueclass.User;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {
    public static void main(String[] args){
        User bozidar = new User("Bozidar");
        User mario = new User("Mario");

        bozidar.sendMessage("Hi, Mario!");
        mario.sendMessage("Yo, Bozidar!");
    }
}
