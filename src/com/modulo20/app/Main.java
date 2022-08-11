package com.modulo20.app;

import com.modulo20.lambdas.IntBinaryOperatorClass;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;



public class Main {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a +b;
        };

        intBinaryOperator.applyAsInt(2,3);

        IntBinaryOperatorClass ope = new IntBinaryOperatorClass();
        int result =  ope.applyAsInt(5,5);
        System.out.println(result);

        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
          return a + b;
        };
        Integer resultBi = biFunction.apply(20,30);
        System.out.println(resultBi);

        BiFunction<Double, Double, String> biFunctionStr = (Double a, Double b) -> {
            Double re = a+b;
            return String.valueOf(re);
        };

        String biFunctions1 = biFunctionStr.apply(10d,10d);
        System.out.println("String: " + biFunctions1);

        calcular(1L, 2L, (Long v1, Long v2 ) -> {
           return v1 + v2;
        });

    }

    private static Long calcular(Long t, Long u, BiFunction<Long, Long, Long> function) {
        return function.apply(t,u);
    }
}
