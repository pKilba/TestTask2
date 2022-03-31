package com.example.demo9.task1;

public class CountInstances {

    static long size;

    static {
        size++;
    }

    //deprecated
    @Override
    protected void finalize() {
        size--;
    }

}
