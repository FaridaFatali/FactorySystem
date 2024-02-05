package org.example;

public class Engineer extends Employee{
    private String project;

    public Engineer(int no, String name, int year, String department, String project) {
        super(no, name, year, department);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("\nEngineer is working on the project: " + project);
        System.out.println(this);
    }

    public void assignTask(String task) {
        System.out.println("Engineer " + name + " works on the task: " + task);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public String toString() {
        return "Engineer: " + "name - " + name + ", no - " + no + ", year - " + year + ", department - " + department + ", project - " + project + ", salary - " + calculateSalary();
    }
}
