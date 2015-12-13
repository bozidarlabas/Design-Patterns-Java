package com.bozidar.posa.layers;

import com.bozidar.posa.layers.level.Level01;

import java.nio.ByteBuffer;

/**
 * Created by bozidar on 13.12.2015..
 */
public class App {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        buffer.putInt(4);
        buffer.flip();

        Level01 layer = new Level01();
        layer.setByteBuffer(buffer);
        layer.setLevel();
        layer.printLevel();
    }
}
