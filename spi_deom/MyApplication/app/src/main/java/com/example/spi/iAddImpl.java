package com.example.spi;

public class iAddImpl implements iAdd {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }
}
