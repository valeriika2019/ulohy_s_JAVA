package vesmirteleso;

import com.company.zive_tvory.Tvor;

import java.util.ArrayList;
import java.util.List;

public class Zem extends Planeta {

    private List<Tvor> listTvorov;

    public Zem(double vaha, double priemer, String name) {
        super(vaha, priemer, name);
        listTvorov = new ArrayList<>();
    }

    public void addTora(Tvor tvor) {
        listTvorov.add(tvor);
    }

    public List<Tvor> getListTvorov() {
        return this.listTvorov;
    }
}
