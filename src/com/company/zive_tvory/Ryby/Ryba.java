package com.company.zive_tvory.Ryby;

import com.company.zive_tvory.stavovce_diely.Stavovec;

public abstract class Ryba extends Stavovec {
    public Ryba(int pocet_sustavov) {
        super(pocet_sustavov);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Plavam, lebo som rybka ;)");
    }

    public void eat() {
        System.out.println("I am eating");
    }
}
