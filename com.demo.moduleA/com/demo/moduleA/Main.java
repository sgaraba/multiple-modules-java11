package com.demo.moduleA;


import com.demo.moduleB.Employee;
import com.demo.moduleC.CUtils;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Albert");
        System.out.println("First name is : " + employee.getFirstName());
        System.out.println("Last name is : " + employee.getLastName());

        CUtils.testCModule();
    }
}
