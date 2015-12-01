package com.bozidar.mediator.mediator;

import com.bozidar.mediator.colleagueclass.User;

import java.util.Date;

/**
 * Created by bozidar on 01.12.2015..
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
