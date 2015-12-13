package com.bozidar.visitor.element;

import com.bozidar.visitor.visitor.ComputerPartVisitor;

/**
 * Created by bozidar on 01.12.2015..
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
