package com.bozidar.strategy.context;

import com.bozidar.strategy.strategy.Strategy;

/**
 * Created by bozidar on 01.12.2015..
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
