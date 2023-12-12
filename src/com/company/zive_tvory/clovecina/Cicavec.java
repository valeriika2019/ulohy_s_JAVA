package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.stavovce_diely.Stavovec;
import com.company.zive_tvory.stavovce_diely.Sustava;

public abstract class Cicavec extends Stavovec implements cicable{

    public Cicavec(int pocetStavov) {
        super(pocetStavov);
    }


    public abstract void create_sustavy();
    @Override
    public void cicat(Cicavec mama) {

    }

    @Override
    public void cicat(Materske_mlieko mliecko) {

    }
}
