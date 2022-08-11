package com.modulo19.app;

import com.modulo19.reflections.Produto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cla = Produto.class;
        //System.out.println(cla);

        Produto prod = new Produto();
        Class clss = prod.getClass();
        //System.out.println(clss);

        Constructor cons = cla.getConstructor();
        Produto prod1 = (Produto) cons.newInstance();
        //System.out.println(cons);
        //System.out.println(prod1);

        Field[] fields = prod1.getClass().getDeclaredFields();
        for (Field field : fields) {
            Class<?> type = field.getType();
            String nome = field.getName();
            System.out.println(type);
            System.out.println(nome);
        }

       Method[] Method = prod1.getClass().getDeclaredMethods();
        for (Method m : Method) {
            Class<?> type = m.getReturnType();
            String nome = m.getName();
            System.out.println(type);
            System.out.println(nome);

            System.out.println("Executando métodos");
            if (m.getName().startsWith("get")) {
                System.out.println(m.invoke(prod1));
            } else {
                for (Class classesTypes : m.getParameterTypes()) {
                    if (classesTypes.equals(String.class)) {
                        System.out.println(m.invoke(prod1, "Anderson"));
                    } else if (classesTypes.equals(Long.class)) {
                        System.out.println(m.invoke(prod1, 1L));
                    } else {
                        System.out.println(m.invoke(prod1, 2d));
                    }
                }
            }
        }
    }
}
