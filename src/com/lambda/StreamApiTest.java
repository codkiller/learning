package com.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiTest {
    /**
     * Stream主要进行数据运算，与CPU打交道
     * Collection主要进行数据的存储，与内存打交道
     * Stream执行链路，只有执行终止操作时，才会执行中间的操作链，并产生结果，之后不会再使用
     */

    /**
     * Stream的实例化
     */
    @Test
    public void test1() {
        /**
         * 通过集合返回stream
         */
        List<Employee> employees = EmployeeData.getEmployeeData();
        /**
         * default Stream<E> stream() 返回顺序流
         */
        Stream<Employee> stream = employees.stream();

        /**
         * default Stream<E> parallelStream() 返回并行流
         */

        Stream<Employee> parallelStream = employees.parallelStream();




    }

    @Test
    public void test2() {
        /**
         * 通过数组返回流
         * Arrays类的static <T> Stream<T> stream(T[] array)
         */
        int[] arr = new int[]{1, 2, 3};

        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee("Tom", 22);
        Employee e2 = new Employee("Jerry", 24);
        Employee[] employees = {e1, e2};
        Stream<Employee> employeeStream = Arrays.stream(employees);
    }

    @Test
    public void test3() {
        /**
         * 通过Stream.of()返回流
         */
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void test4() {
        /**
         * Steam无限流 iterate方法 generate方法
         */
//        Stream.iterate()
    }
}
