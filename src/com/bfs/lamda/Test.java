package com.bfs.lamda;

/**
 * @author lwb
 * @date 2018-12-10
 */
public class Test {

    interface FunctionalInterface {

        void handle(int a, int b);

    }


    static void calculate(FunctionalInterface functionalInterface) {
        System.out.println("要准备开始计算啦！");
        functionalInterface.handle(1, 2);
        System.out.println("计算完毕！(*^_^*)");

    }


    public static void main(String[] args) {

        FunctionalInterface functionalInterface = (a, b) -> System.out.println(a + b);

        functionalInterface.handle(1,2);



        calculate(functionalInterface);

        calculate((a, b) -> {
            System.out.println("a + b = " + (a + b));
        });

    }

}
