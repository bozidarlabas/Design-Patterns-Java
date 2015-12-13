package com.bozidar.interpreter.terminalxpression;

import com.bozidar.interpreter.expression.Expression;

/**
 * Created by bozidar on 01.12.2015..
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
