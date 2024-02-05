package org.example;

public class Secretary extends Employee{
    protected Manager managerServed;

    public Secretary(int no, String name, int year, String department, Manager managerServed) {
        super(no, name, year, department);
        this.managerServed = managerServed;
    }

    public void serve() {
        System.out.println("Secretary " + name + " serves her manager: " + managerServed);
    }

    @Override
    public void work() {
        System.out.println("\nSecretary is working!");
        //serve();
        System.out.println(this);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public String toString() {
        return "Secretary: " + "name - " + name + ", no - " + no + ", year - " + year + ", department - " + department + ", salary - " + calculateSalary() + ", Manager served - (" + managerServed + ")";
    }
}
