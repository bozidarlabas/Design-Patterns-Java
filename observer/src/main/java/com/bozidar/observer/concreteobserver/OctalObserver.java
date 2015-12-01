package com.bozidar.observer.concreteobserver;

import com.bozidar.observer.observer.Observer;
import com.bozidar.observer.concretesubject.ConcreteSubject;

/**
 * Created by bozidar on 01.12.2015..
 */
public class OctalObserver extends Observer {

    public OctalObserver(ConcreteSubject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}