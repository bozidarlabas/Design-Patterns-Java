package com.bozidar.strategy.strategy.impl;

import com.bozidar.strategy.strategy.Strategy;

/**
 * Created by bozidar on 01.12.2015..
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
