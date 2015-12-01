package com.bozidar.observer.subject;


import com.bozidar.observer.observer.Observer;

/**
 * Created by bozidar on 01.12.2015..
 */
public interface Subject {
    public void setState(int state);
    public int getState();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
