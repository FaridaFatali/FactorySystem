package org.example;

// Factory Management System based SOLID principles

public class Main {

    public static void main(String[] args) {
        Worker worker = new Employee(1, "James", 5, "Production");
        worker.work();

        worker = new Manager(2, "Johanna", 3, "Sales", "Sales");
        worker.work();

        worker = new Director(3, "Alex", 4, "IT", "IT", 500);
        worker.work();

        worker = new Engineer(4, "Miranda", 8, "Engineering", "Construction");
        worker.work();

        worker = new Secretary(5, "Josephina", 3, "Sales", new Manager(6, "Chris", 7, "IT", "IT"));
        worker.work();

        Boss boss = new Boss();
        if (boss instanceof Worker) {
            System.out.println("\nBoss also is a worker.");
            ((Worker) boss).work();
        }
    }
}