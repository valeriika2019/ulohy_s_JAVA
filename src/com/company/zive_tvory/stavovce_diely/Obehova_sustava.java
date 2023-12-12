package com.company.zive_tvory.stavovce_diely;

public class Obehova_sustava extends Sustava {
    public Obehova_sustava(Typ_sustavy typ_sustavy) {
        super(typ_sustavy);  // явний виклик конструктора батьківського класу
        // ініціалізація на основі typ_sustavy
    }
}

