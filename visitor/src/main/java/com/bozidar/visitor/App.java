package com.bozidar.visitor;

import com.bozidar.visitor.element.ComputerPart;
import com.bozidar.visitor.objectstructure.Computer;
import com.bozidar.visitor.visitor.impl.ComputerPartDisplayVisitor;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
