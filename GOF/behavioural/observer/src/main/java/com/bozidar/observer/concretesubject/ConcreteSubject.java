package com.bozidar.observer.concretesubject;

import com.bozidar.observer.subject.Subject;
import com.bozidar.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bozidar on 01.12.2015..
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    private int state;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
