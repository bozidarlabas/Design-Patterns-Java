package com.bozidar.visitor.objectstructure;

import com.bozidar.visitor.element.ComputerPart;
import com.bozidar.visitor.element.impl.Keyboard;
import com.bozidar.visitor.element.impl.Monitor;
import com.bozidar.visitor.element.impl.Mouse;
import com.bozidar.visitor.visitor.ComputerPartVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Computer implements ComputerPart {

    List<ComputerPart> parts;

    public Computer(){
        parts = new ArrayList<>();
        parts.add(new Mouse());
        parts.add(new Keyboard());
        parts.add(new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts){
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}