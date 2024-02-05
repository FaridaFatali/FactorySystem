package org.example;

public class Director extends Manager{
    protected double bonus;

    public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
        super(no, name, year, workingDepartment, managingDepartment);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("\nDirector is working!");
        manage();
        System.out.println(this);
    }

    @Override
    public void manage() {
        System.out.println("Director manages the whole company!");
        makeAStrategicPlan();
    }

    public void makeAStrategicPlan() {
        System.out.println("Director makes a strategic plan for the company!");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void printInfo() {
        System.out.println("\nDirector info");
        super.printInfo();
    }

    @Override
    public String toString() {
        return "Director: " + "name - " + name + ", no - " + no + ", year - " + year + ", department - " + department + ", bonus - " + bonus + ", department managed - " + departmentManaged + ", salary - " + calculateSalary();
    }
}
