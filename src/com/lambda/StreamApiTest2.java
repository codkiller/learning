package com.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest2 {
    /**
     * Steam的终止操作
     */


    /**
     * 1.匹配与查找
     *  allMatch(Predicate<? super T> predicate) 检查是否匹配所有元素
     *  anyMatch(Predicate<? super T> predicate) 检查是否至少匹配一个元素
     *  noneMatch(Predicate<? super T> predicate) 检查是否没有匹配的元素
     *  findFirst方法
     *  findAny方法
     *
     *
     */
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployeeData();
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

        boolean anyMatch = employees.stream().anyMatch(e -> e.getAge() > 30);
        System.out.println(anyMatch);

        Optional<Employee> optional = employees.stream().findFirst();
        System.out.println(optional);

    }
    /**
     * count方法，返回流中元素的个数
     * max方法
     * min方法
     * forEach方法
     */

    @Test
    public void test2() {
        List<Employee> employees = EmployeeData.getEmployeeData();
        long count = employees.stream().filter(e -> e.getSalary() > 2000).count();
        System.out.println(count);

        employees.stream().forEach(System.out::println);


    }

    /**
     * 2.归约
     */
    @Test
    public void test3() {
        /**
         * 计算1-10的和
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

    }

    /**
     * 3.收集
     */
    @Test
    public void test4() {
        /**
         * 查找工资大于6000的员工，结果返回一个List或者Set
         * collect(Collector c)
         */

        List<Employee> employees = EmployeeData.getEmployeeData();
        List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
        employeeList.forEach(System.out::println);

    }

}
