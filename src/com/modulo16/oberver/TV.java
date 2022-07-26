package com.modulo16.oberver;

public class TV implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notica via TV" + subject.toString());
    }
}
