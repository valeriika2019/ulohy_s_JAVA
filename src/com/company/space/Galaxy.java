package com.company.space;

import vesmirteleso.Slnecna_sustava;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    private List<Slnecna_sustava> slnecna_sustavas;
    private List<String> messages;

    Galaxy() {
        slnecna_sustavas = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public void addSustava(Slnecna_sustava tato_sustava) {
        slnecna_sustavas.add(tato_sustava);
    }

    public void formatMessage(Galaxy recipient, String msg) {
        // отправитель - тот у кого вызывается метод
        send(recipient, msg);
    }

    public static void send(Galaxy recipient, String msg) {
        recipient.receiveMessage(msg);
    }

    public void receiveMessage(String msg) {
        messages.add(msg);
    }

    public void showMessages() {
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(messages.get(i));
        }
    }


}
