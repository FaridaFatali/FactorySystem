package org.example;

public class Boss implements Worker{
    public void bossWorks() {
        System.out.println("Boss is working!");
    }

    @Override
    public void work() {
        bossWorks();
    }

}
