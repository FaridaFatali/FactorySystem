package org.example;

public class Manager extends Employee{
    protected String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 3000;

    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
        super(no, name, year, workingDepartment);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("\nManager is working!");
        manage();
        System.out.println(this);
    }

    public void manage() {
        System.out.println("Manager manages department: " + departmentManaged);
    }

    public void printInfo() {
        System.out.println("\nManager info");
        super.printInfo();
        System.out.println("Managing Department: " + departmentManaged);
    }

    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public String toString() {
        return  "Manager: " + "name - " + name + ", no - " + no + ", year - " + year + ", department - " + department + ", department managed - " + departmentManaged + ", salary - " + calculateSalary();
    }
}
