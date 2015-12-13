package com.bozidar.visitor.visitor;

import com.bozidar.visitor.objectstructure.Computer;
import com.bozidar.visitor.element.impl.Keyboard;
import com.bozidar.visitor.element.impl.Monitor;
import com.bozidar.visitor.element.impl.Mouse;

/**
 * Created by bozidar on 01.12.2015..
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
