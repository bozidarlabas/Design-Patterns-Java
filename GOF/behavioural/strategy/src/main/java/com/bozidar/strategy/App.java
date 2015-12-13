package com.bozidar.strategy;

import com.bozidar.strategy.context.Context;
import com.bozidar.strategy.strategy.impl.OperationAdd;
import com.bozidar.strategy.strategy.impl.OperationMultiply;
import com.bozidar.strategy.strategy.impl.OperationSubstract;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
