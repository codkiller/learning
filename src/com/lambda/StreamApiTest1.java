package com.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiTest1 {
    /**
     * Steam的中间操作
     */

    @Test
    public void test1() {
        /**
         * 1.筛选与切片
         */
        /**
         * filter(Predicate<? super T> predicate)方法，接受Lambda，从流中排除某些元素
         */
        List<Employee> employees = EmployeeData.getEmployeeData();
        Stream<Employee> stream = employees.stream();
        stream.filter(e -> e.getAge() > 24).forEach(System.out::println);
        System.out.println();
        /**
         * limit(long maxSize),限制数量
         */
        employees.stream().limit(2).forEach(System.out::println);
        /**
         * skip(long n),跳过元素个数
         */
        /**
         * distinct() 筛选，通过流生成的hashCode()和equals()去除重复元素
         *
         */


    }

    @Test
    public void test2() {
        /**
         * 2.映射
         */
        /**
         * map(Function<? super T, ? extends R> mapper),接受函数作为参数转换为其他形式
         */
        List<String> list = Arrays.asList("aa", "bb", "cc");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        /**
         * flatMap(Function<? super T, ? extends Stream<? extends R>> mapper),只返回一个流
         */


    }

    @Test
    public void test3() {
        /**
         * 3.排序
         * sorted() 自然排序
         * sorted(Comparator com)定制排序
         */

//        List<Integer> list = Arrays.asList(1, 12, 3, 15, 6, -98);
//        Stream<Integer> stream = list.stream().sorted();
//        stream.forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployeeData();
        employees.stream().sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .forEach(System.out::println);


    }

}
