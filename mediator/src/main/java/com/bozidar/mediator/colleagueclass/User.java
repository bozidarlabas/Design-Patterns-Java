package com.bozidar.mediator.colleagueclass;

import com.bozidar.mediator.mediator.ChatRoom;

/**
 * Created by bozidar on 01.12.2015..
 */
public class User {
    private String name;

    public User(String name){
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
