package com.modulo17.generics;

import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>  {

    private Map<Class, Map<Long, T>> map;

    public GenericDAO() {
        this.map = new HashMap<>();
    }
}
