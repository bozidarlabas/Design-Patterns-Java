package com.bozidar.iterator;

import com.bozidar.iterator.ConcreteClass.NameRepository;
import com.bozidar.iterator.interfaces.Iterator;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {
    public static void main(String[] args){
        NameRepository namesRepository = new NameRepository();



        for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }
    }
}

