package com.bozidar.observer.observer;

import com.bozidar.observer.concretesubject.ConcreteSubject;

/**
 * Created by bozidar on 01.12.2015..
 */
public abstract class Observer {
    protected ConcreteSubject subject;
    public abstract void update();
}
