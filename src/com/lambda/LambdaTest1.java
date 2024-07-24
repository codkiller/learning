package com.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest1 {
    /**
     * lambda表达式，->表示Lambda操作符
     * 箭头左边表示形参列表（抽象方法的形参列表），右边表示lambda体（抽象方法的方法体）
     * @param args
     */
    public static void main(String[] args) {
        test2();

    }

    public static void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        /**
         * 语法格式一：无参 无返回值
         */
        Runnable r2 = () -> System.out.println("我爱北极熊");
        r2.run();

    }

    public static void test2() {
        /**
         * 语法格式二:有参 无返回值
         */
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("dfsfhls");
        /**
         * 可以利用类型推断将String省略
         * Lambda若只有一个参数时，小括号可以省略
         * 当Lambda体只有一条语句时，return与大括号若有，则都可以省略
         */

        Consumer<String> consumer2 = s -> {
            System.out.println(s);
        };

        consumer2.accept("dfsfhls2");

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);
        System.out.println("**********************");
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        // 方法引用
//        Comparator<Integer> com3 = Integer::compare;
        int compare2 = com1.compare(32, 21);
        System.out.println(compare2);

    }
}
