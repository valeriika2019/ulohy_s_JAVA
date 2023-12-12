package com.company.zive_tvory;

import java.util.Date;

public abstract class Tvor implements Bornable, Dieable{
    protected Date day_of_birth;
    protected Date day_of_die;
    public abstract void hybsa(int direction_x, int direction_y, int direction_z);

    @Override
    public void born(Date day_of_birth) {
        this.day_of_birth = day_of_birth;
        //System.out.println("I am born at: " + day_of_birth);
    }

    @Override
    public void die(Date day_of_die) {
        this.day_of_die = day_of_die;
        //System.out.println("I am die at: " + day_of_die);
    }

    public Date getDay_of_birth() {
        return day_of_birth;
    }
}
