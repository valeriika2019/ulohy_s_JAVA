package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.stavovce_diely.*;
import com.company.zive_tvory.stavovce_diely.RozmnozovaciaClovek.Rozmnozovacia_sustava;
import com.company.zive_tvory.stavovce_diely.RozmnozovaciaClovek.Rozmnozovacia_sustava_Zena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zena extends Clovek {

    public Zena(Clovek otec, Clovek mama, int pocetStavov, String meno, String priezvisko) {
        super(otec, mama, pocetStavov);
        super.meno = meno;
        super.priezvisko = priezvisko;
    }

    public Zena(Clovek otec, Clovek mama, int pocetStavov) {
        super(otec, mama, pocetStavov);
    }

    public void born() {
        // імплементація методу
    }

    public void die() {
        // імплементація методу
    }

    public void hybsa() {
        // імплементація методу
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
        sustavy.add(new Rozmnozovacia_sustava_Zena(Typ_sustavy.ROZMNOZOVACIA));
        sustavy.add(new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA));

        System.out.println("Som žena a mám zložitú nervovú sústavu a špeciálnu rozmnožovaciu sústavu");
    }

    @Override
    public void cicat(Cicavec mama) {
        super.cicat(mama);
    }

    @Override
    public void cicat(Materske_mlieko mliecko) {
        super.cicat(mliecko);
    }

    public void babyisideCare(Clovek plod) {
        Rozmnozovacia_sustava_Zena myRS = (Rozmnozovacia_sustava_Zena) sustavy.get(6);
        myRS.takeAndCareBaby(plod);
    }

    public Clovek splodit(Muz stymtomuzom) {
        Random random = new Random();
        boolean man = random.nextBoolean();
        Clovek cloviecikNarodeny;

        if (man) {
            cloviecikNarodeny = new Muz(stymtomuzom, this.mama, 34);
        } else {
            cloviecikNarodeny = new Zena(stymtomuzom, this.mama, 34);
        }
        super.deti.add(cloviecikNarodeny);
        stymtomuzom.deti.add(cloviecikNarodeny);

        cloviecikNarodeny.priezvisko = super.priezvisko + "-" + stymtomuzom.priezvisko;
        babyisideCare(cloviecikNarodeny);
        return cloviecikNarodeny;
    }
}




