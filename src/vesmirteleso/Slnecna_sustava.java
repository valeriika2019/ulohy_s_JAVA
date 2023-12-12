package vesmirteleso;

import java.util.ArrayList;
import java.util.List;

public class Slnecna_sustava {
    private Hviezda slnko;
    private List<Vesmirne_teleso> obezne_telesa;
    private int object_counter;

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }

    public Slnecna_sustava() {
        slnko = new Hviezda("sun");
        this.setObject_counter(0);
        obezne_telesa = new ArrayList<>();
        this.addTeleso(new Planeta(432432, 432432, "Mars"));
        this.addTeleso(new Planeta(55555, 32342, "Venusa"));
        this.addTeleso(new Hviezda("polarka"));
    }

    public void addTeleso(Vesmirne_teleso nove_teleso) {
        obezne_telesa.add(nove_teleso);
        object_counter++;
    }
}
