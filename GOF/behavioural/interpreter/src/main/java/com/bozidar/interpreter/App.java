package com.bozidar.interpreter;

import com.bozidar.interpreter.expression.Expression;
import com.bozidar.interpreter.nonterminalexpression.AndExpression;
import com.bozidar.interpreter.nonterminalexpression.OrExpression;
import com.bozidar.interpreter.terminalxpression.TerminalExpression;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {

    //Rule: Bozidar and Ivan are male
    public static Expression getMaleExpression(){
        Expression bozidar = new TerminalExpression("Bozidar");
        Expression ivan = new TerminalExpression("Ivan");
        return new OrExpression(bozidar, ivan);
    }

    //Rule: Maria is a married women
    public static Expression getMarriedWomanExpression(){
        Expression maria = new TerminalExpression("Maria");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(maria, married);
    }

    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Bozidar is male? " + isMale.interpret("Bozidar"));
        System.out.println("Maria is a married women? " + isMarriedWoman.interpret("Married Maria"));

    }
}
