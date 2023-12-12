package com.company.zive_tvory.Vtaky;

import com.company.zive_tvory.stavovce_diely.Stavovec;

public abstract class Vtak extends Stavovec {
    public Vtak(int pocet_sustavov) {
        super(pocet_sustavov);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Ja letim, lebo som vtak");
    }

    public void voice() {
        System.out.println("KAR-KAR, lebo som vtak");
    }
}
