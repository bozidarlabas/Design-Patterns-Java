package com.bozidar.observer;

import com.bozidar.observer.concreteobserver.BinaryObserver;
import com.bozidar.observer.concreteobserver.HexaObserver;
import com.bozidar.observer.concreteobserver.OctalObserver;
import com.bozidar.observer.concretesubject.ConcreteSubject;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
