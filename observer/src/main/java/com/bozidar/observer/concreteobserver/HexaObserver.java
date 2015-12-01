package com.bozidar.observer.concreteobserver;

import com.bozidar.observer.observer.Observer;
import com.bozidar.observer.concretesubject.ConcreteSubject;

/**
 * Created by bozidar on 01.12.2015..
 */
public class HexaObserver extends Observer {

    public HexaObserver(ConcreteSubject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}