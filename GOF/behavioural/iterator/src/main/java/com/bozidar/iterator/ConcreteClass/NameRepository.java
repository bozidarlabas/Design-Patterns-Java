package com.bozidar.iterator.ConcreteClass;

import com.bozidar.iterator.interfaces.Container;
import com.bozidar.iterator.interfaces.Iterator;

/**
 * Created by bozidar on 01.12.2015..
 */
//Concrete aggregate
public class NameRepository implements Container{
    public String names[] = {"Bozidar", "Ivan", "Josip", "Marija"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    //Concrete iterator
    private class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
