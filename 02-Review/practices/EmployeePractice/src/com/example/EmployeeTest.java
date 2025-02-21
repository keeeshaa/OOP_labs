package com.example;

import com.example.domain.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        printEmployee(engineer);
        printEmployee(manager);
        printEmployee(admin);
        printEmployee(director);
    }

    public static void printEmployee(Employee emp) {
        System.out.println(emp.getClass().getSimpleName() + " Details:");
        System.out.println("ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Soc Sec #:  " + emp.getSsn());
        System.out.println("Salary: $" + emp.getSalary());

        if (emp instanceof Manager manager) {
            System.out.println("Department: " + manager.getDeptName());
        }
        if (emp instanceof Director director) {
            System.out.println("Budget: $" + director.getBudget());
        }
        System.out.println();
    }
}

 