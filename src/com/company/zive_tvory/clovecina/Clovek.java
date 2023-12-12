package com.company.zive_tvory.clovecina;

import java.util.ArrayList;
import java.util.List;

public abstract class Clovek extends  Cicavec{
    protected  Clovek otec;
    protected  Clovek mama;
    protected List<Clovek> deti;
    protected String meno;
    protected String priezvisko;

    public Clovek(Clovek otec, Clovek mama, int pocetStavov) {
        super(pocetStavov);

        this.otec = otec;
        this.mama = mama;
        deti = new ArrayList();
    }
    public void setMeno(String noveMeno) {
        this.meno = noveMeno;
    }

    public abstract void born();
    public abstract void die();
    public abstract void hybsa();

    @Override
    public void cicat(Cicavec mama) {
        super.cicat(mama);
    }

    @Override
    public void cicat(Materske_mlieko mliecko) {
        super.cicat(mliecko);
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }
}
