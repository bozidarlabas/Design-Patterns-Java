package com.bozidar.state.state;

import com.bozidar.state.context.Context;

/**
 * Created by bozidar on 01.12.2015..
 */
public interface State {
    public void doAction(Context context);
}
