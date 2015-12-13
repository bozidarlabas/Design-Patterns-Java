package com.bozidar.posa.layers.level;

import com.bozidar.posa.layers.level.impl.Level10201;
import com.bozidar.posa.layers.level.impl.Level10202;

import java.nio.ByteBuffer;

/**
 * Created by bozidar on 13.12.2015..
 */
public class Level01 {
    ByteBuffer buffer;
    Level02Interface levelTwo;

    public void setByteBuffer(ByteBuffer buffer){
        this.buffer = buffer;
    }

    public void setLevel(){
        this.levelTwo = new Level10201();
    }


    public void printLevel(){
        if(buffer.getInt() == 4)
            this.levelTwo = new Level10202();

        System.out.println("Level01 printLevel() called");
        this.levelTwo.foo();
    }
}
