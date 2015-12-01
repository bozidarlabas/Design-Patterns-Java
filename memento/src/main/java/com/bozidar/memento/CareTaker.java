package com.bozidar.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bozidar on 01.12.2015..
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
