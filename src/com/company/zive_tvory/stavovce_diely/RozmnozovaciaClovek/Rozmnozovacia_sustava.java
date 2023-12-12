package com.company.zive_tvory.stavovce_diely.RozmnozovaciaClovek;

import com.company.zive_tvory.clovecina.Clovek;
import com.company.zive_tvory.stavovce_diely.Sustava;
import com.company.zive_tvory.stavovce_diely.Typ_sustavy;

public abstract class Rozmnozovacia_sustava extends Sustava {
    Typ_sustavy typSustavy;

    public Rozmnozovacia_sustava(Typ_sustavy typSustavy) {
        super(typSustavy);

        this.typSustavy = typSustavy;
    }
}
