package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.stavovce_diely.*;
import com.company.zive_tvory.stavovce_diely.RozmnozovaciaClovek.Rozmnozovacia_sustava_Muz;
import com.company.zive_tvory.stavovce_diely.RozmnozovaciaClovek.Rozmnozovacia_sustava_Zena;

import java.util.ArrayList;

public class Muz extends Clovek{

    public Muz(Clovek otec, Clovek mama, int pocetStavov) {
        super(otec, mama, pocetStavov);
    }

    public Muz(Clovek otec, Clovek mama, int pocetStavov, String meno, String priezvisko) {
        super(otec, mama, pocetStavov);
        super.meno=meno;
        super.priezvisko=priezvisko;
    }

    public void born(){   // implimentacia metodov

    }

    public void die(){

    }

    public void hybsa(){

    }

    @Override
    public void create_sustavy() {
        sustavy = new ArrayList<>();
        sustavy.add(new Obehova_sustava(Typ_sustavy.OBEHOVA));
        sustavy.add(new Oporna_sustava(Typ_sustavy.OPORNA));
        sustavy.add(new Vylucovacia_sustava(Typ_sustavy.VYLUCOVACIA));
        sustavy.add(new Pohybova_sustava(Typ_sustavy.POHYBOVA));
        sustavy.add(new Dychacia_sustava(Typ_sustavy.DYCHACIA));
        sustavy.add(new Traviaca_sustava(Typ_sustavy.TRAVIACIA));
        sustavy.add(new Rozmnozovacia_sustava_Muz(Typ_sustavy.ROZMNOZOVACIA));
        sustavy.add(new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA));

        System.out.println("Som muz a mam jednoduchu nervovu sustavu a speci rozmnozovaciu sustavu");
    }

    @Override
    public void cicat(Cicavec mama) {
        super.cicat(mama);
    }

    @Override
    public void cicat(Materske_mlieko mliecko) {
        super.cicat(mliecko);
    }
}
