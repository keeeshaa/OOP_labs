package com.example;

import com.example.domain.*;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Alice Johnson", "123-45-6789", 95000.00, "IT Department");

        Employee emp1 = new Engineer(201, "Bob Smith", "234-56-7890", 80000.00);
        Employee emp2 = new Admin(202, "Charlie Brown", "345-67-8901", 75000.00);
        Employee emp3 = new Engineer(203, "David Lee", "456-78-9012", 82000.00);

        System.out.println("Adding Employees...");
        System.out.println(manager.addEmployee(emp1)); // true
        System.out.println(manager.addEmployee(emp2)); // true
        System.out.println(manager.addEmployee(emp3)); // true

        System.out.println("Adding Duplicate Employee...");
        System.out.println(manager.addEmployee(emp1)); // false

        System.out.println("\nStaff Details:");
        manager.printStaffDetails();

        System.out.println("\nRemoving Employee...");
        System.out.println(manager.removeEmployee(emp2)); // true

        System.out.println("\nRemoving Non-Existent Employee...");
        Employee emp4 = new Engineer(204, "Eve Adams", "567-89-0123", 83000.00);
        System.out.println(manager.removeEmployee(emp4)); // false

        System.out.println("\nStaff Details after Removal:");
        manager.printStaffDetails();
    }
}

