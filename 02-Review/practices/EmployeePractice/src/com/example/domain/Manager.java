package com.example.domain;


public class Manager extends Employee{
    private String deptName;
    private Employee[] staff; 
    private int employeeCount; 

    private static final int MAX_EMPLOYEES = 20;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super (empId, name, ssn, salary); 
        this.deptName = deptName;
        this.staff = new Employee[MAX_EMPLOYEES]; 
        this.employeeCount = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment:     " + getDeptName();
    }
        
    public String getDeptName() {
        return deptName;
    }

    public int findEmployee(Employee emp) {
        for (int i = 0; i < employeeCount; i++) {
            if (staff[i].getEmpId() == emp.getEmpId()) {
                return i; 
            }
        }
        return -1;
    }

    public boolean addEmployee(Employee emp) {
        if (findEmployee(emp) != -1 || employeeCount >= MAX_EMPLOYEES) {
            return false;
        }
        staff[employeeCount] = emp; 
        employeeCount++; 
        return true;
    }

    public boolean removeEmployee(Employee emp) {
        boolean found = false;
        Employee[] tempStaff = new Employee[MAX_EMPLOYEES]; 
        int tempCount = 0;
    
        for (int i = 0; i < employeeCount; i++) {
            if (staff[i].getEmpId() == emp.getEmpId()) {
                found = true; 
                continue;
            }
            tempStaff[tempCount] = staff[i]; 
            tempCount++;
        }
    
        if (found) {
            staff = tempStaff;
            employeeCount = tempCount;
        }
        return found;
    }

    public void printStaffDetails() {
        System.out.println("Manager: " + getName() + " (Department: " + deptName + ")");
        System.out.println("Staff members:");
        if (employeeCount == 0) {
            System.out.println("No employees in the staff.");
        } else {
            for (int i = 0; i < employeeCount; i++) {
                System.out.println("- " + staff[i].getEmpId() + ": " + staff[i].getName());
            }
        }
    }    
}
