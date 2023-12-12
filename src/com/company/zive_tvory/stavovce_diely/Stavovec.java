package com.company.zive_tvory.stavovce_diely;

import com.company.zive_tvory.Tvor;

import java.util.ArrayList;
import java.util.List;

public class Stavovec extends Tvor {
    protected Chrbtica chrbtica;
    protected List<Sustava> sustavy;

    public Stavovec(int pocetStavov) {
        chrbtica = new Chrbtica(pocetStavov);
        create_sustavy();
    }

    public void create_sustavy() {
        sustavy = new ArrayList<>();

        sustavy.add(new Sustava(Typ_sustavy.OBEHOVA));
        sustavy.add(new Sustava(Typ_sustavy.OPORNA));
        sustavy.add(new Sustava(Typ_sustavy.VYLUCOVACIA));
        sustavy.add(new Sustava(Typ_sustavy.POHYBOVA));
        sustavy.add(new Sustava(Typ_sustavy.DYCHACIA));
        sustavy.add(new Sustava(Typ_sustavy.TRAVIACIA));
        sustavy.add(new Sustava(Typ_sustavy.ROZMNOZOVACIA));
        sustavy.add(new Sustava(Typ_sustavy.NERVOVA));
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    public List<Sustava> getSustavy() {
        return sustavy;
    }
}
