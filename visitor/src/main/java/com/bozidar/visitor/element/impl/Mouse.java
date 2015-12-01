package com.bozidar.visitor.element.impl;

import com.bozidar.visitor.element.ComputerPart;
import com.bozidar.visitor.visitor.ComputerPartVisitor;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
