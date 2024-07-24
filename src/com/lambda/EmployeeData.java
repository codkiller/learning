package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("lisi", 20, 2000, 50000));
        employees.add(new Employee("zhangsan", 22));
        employees.add(new Employee("wangwu", 24));
        employees.add(new Employee("zhaoliu", 26, 300, 2000));
        employees.add(new Employee("luliu", 66));
        employees.add(new Employee("lisheng", 29));
        employees.add(new Employee("lili", 17));
        return employees;
    }
}
