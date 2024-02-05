package org.example;

public class Employee implements Worker{
    private static final int BASE_SALARY = 500;
    protected int no;
    protected String name;
    protected int year;
    protected String department;

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("\nEmployee is working!");
        System.out.println(this);
    }

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    public void printInfo() {
        System.out.println("\nNo: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }

    @Override
    public String toString() {
        return "Employee: " + "name - " + name + ", no - " + no + ", year - " + year + ", department - " + department + ", salary - " + calculateSalary();
    }

}
