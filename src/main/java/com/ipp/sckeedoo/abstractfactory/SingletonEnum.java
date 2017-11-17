package com.ipp.sckeedoo.abstractfactory;

/*
 * Making the singleton via enum
 * Thread-safe
 */
public enum SingletonEnum {

    INSTANCE;
    private final Factory factory;

    SingletonEnum() {
        this.factory = new Factory();
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }

    public Factory getFactory() {
        return this.factory;
    }
}
