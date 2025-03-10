package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

public class EmployeeTest {
        public static void main(String[] args) {
            Employee engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
            Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
            Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
            Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
    
            EmployeeStockPlan esp = new EmployeeStockPlan(); 
            printEmployee(engineer, esp);
            printEmployee(manager, esp);
            printEmployee(admin, esp);
            printEmployee(director, esp);

            printEmployee(engineer);
            System.out.println("");
            printEmployee(manager);
            System.out.println("");
            printEmployee(admin);
            System.out.println("");
            printEmployee(director);
            System.out.println("");
        }
    
        public static void printEmployee(Employee emp) {
            System.out.println("Employee type:	" + emp.getClass().getSimpleName());
            System.out.println(emp);
    
            if (emp instanceof Manager manager) {
                System.out.println("Department: " + manager.getDeptName());
            }
            if (emp instanceof Director director) {
                System.out.println("Budget: $" + director.getBudget());
            }

        }

        public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
            printEmployee(emp);

            System.out.println("Stock Options:	" + esp.grantStock(emp) + "\n");
        }
}

 