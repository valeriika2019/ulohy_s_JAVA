package com.company.zive_tvory.stavovce_diely;

import java.util.ArrayList;
import java.util.List;

public class Chrbtica {
    private List<Stavovec> listStavcov;

    Chrbtica(int pocetStavov) {
        listStavcov = new ArrayList<>();
    }
    public void addChrbtica(Stavovec st){
       listStavcov.add(st);
    }
}
