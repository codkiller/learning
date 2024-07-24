package com.lambda;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest2 {
    /**
     * Java核心四大核心函数式接口
     * Consumer<T>
     * Supplier<R>
     * Function<T, R>
     * Predicate<T>
     * lambda表达式，->表示Lambda操作符
     * 箭头左边表示形参列表（抽象方法的形参列表），右边表示lambda体（抽象方法的方法体）
     * @param args
     */
    public static void main(String[] args) {
//        happyTime(500, new Consumer<Double>() {
//            @Override
//            public void accept(Double aDouble) {
//                System.out.println("买了瓶水，价格为 " + aDouble);
//
//            }
//        });
//        happyTime(400, money -> System.out.println("买了瓶水，价格为 " + money));

        List<String> list = Arrays.asList("北京", "南京", "东京", "天津", "普京");
        List<String> resList1 = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(resList1);

        List<String> resList2  = filterString(list, s -> s.contains("津"));
        System.out.println("***********");
        System.out.println(resList2);


        /**
         * 当要传递给Lambda体的操作，已经有实现的方法时，可以使用方法引用
         * 使用要求：当接口的入参和出参与方法引用的入参和出参相同
         * 方法引用：使用格式：类（或对象）：：方法名
         * 使用方式一：对象：：实例方法
         * 使用方式二：类：：静态方法，与方式一类似
         * 使用方式三：类：：非静态方法
         */
        /**
         * 使用方式一：Consumer中的void accept(T t)
         * PrintStream中的void println(T t)
         */
        Consumer<String> con1 = s -> System.out.println(s);

        con1.accept("北京北京");
        System.out.println("****************8");
        PrintStream ps = System.out;
        Consumer<String> con2 = ps ::println;



        /**
         * 使用方式一：
         * Supplier中的T get()  与 Employee中的String getName()
         */
        Employee employee = new Employee("张三", 20, 23, 6000);
        Supplier<String> sup1 = () -> employee.getName();
        System.out.println(sup1.get());
        System.out.println("**********");

        Supplier<String> sup2 = employee::getName;
        System.out.println(sup2.get());

        /**
         *使用方式二同一
         */
        Comparator<Integer> con3 = (o1, o2) -> Integer.compare(o1, o2);
        /**
         * 类：：静态方法
         */
        Comparator<Integer> con4 = Integer::compare;

        /**
         * 使用方式三：类：：实例方法
         * Comparator int compare(T t1, T t2)
         * String 中的int t1.compareTo(t2)
         */

        Comparator<String> con5 = (s1, s2) -> s1.compareTo(s2);
        System.out.println(con5.compare("abc", "abd"));
        System.out.println("**********");
        Comparator<String> con6 = String::compareTo;
        /**
         * 构造器引用和方法引用
         * Supplier T get()
         * Employee空参构造器 Employee()
         */
        Supplier<Employee> su1 = () -> new Employee();
        Supplier<Employee> su2 = Employee::new;






    }

    public static void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    public static List<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }

        }
        return filterList;

    }

}
