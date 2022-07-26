package com.modulo16.oberver;

public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyAll(String titulo);
}
