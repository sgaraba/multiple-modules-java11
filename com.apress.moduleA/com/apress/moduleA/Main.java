package com.apress.moduleA;

import com.apress.moduleB.Employee;
import com.apress.moduleC.CUtils;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Albert");
        System.out.println("First name is : " + employee.getFirstName());
        System.out.println("Last name is : " + employee.getLastName());

        CUtils.testCModule();
    }
}
