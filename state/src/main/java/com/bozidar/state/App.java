package com.bozidar.state;

import com.bozidar.state.context.Context;
import com.bozidar.state.state.State;
import com.bozidar.state.state.impl.StartState;
import com.bozidar.state.state.impl.StopState;

/**
 * Created by bozidar on 01.12.2015..
 */
public class App {
    public static void main(String[] args){
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
