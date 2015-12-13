package com.bozidar.visitor.visitor.impl;

import com.bozidar.visitor.objectstructure.Computer;
import com.bozidar.visitor.element.impl.Keyboard;
import com.bozidar.visitor.element.impl.Monitor;
import com.bozidar.visitor.element.impl.Mouse;
import com.bozidar.visitor.visitor.ComputerPartVisitor;

/**
 * Created by bozidar on 01.12.2015..
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
