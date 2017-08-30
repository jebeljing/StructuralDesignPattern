package com.pluralsight.adapter;

import java.util.List;

/**
 * Created by jingshanyin on 8/27/17.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
