package com.basic.factory;

import com.basic.ducks.Quackable;

/**
 * locate com.basic.factory
 * Created by MasterTj on 2019/1/7.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createdDuckCall();
    public abstract Quackable createRubberDuck();
}
