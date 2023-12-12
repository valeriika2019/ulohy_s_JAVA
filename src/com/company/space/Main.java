package com.company.space;

import com.company.tools.MessageReader;
import com.company.zive_tvory.Hmyzy.Mucha;
import com.company.zive_tvory.Ryby.Kapor;
import com.company.zive_tvory.Ryby.Losos;
import com.company.zive_tvory.Turple;
import com.company.zive_tvory.Vtaky.Orol;
import com.company.zive_tvory.clovecina.Clovek;
import com.company.zive_tvory.clovecina.Muz;
import com.company.zive_tvory.clovecina.Zena;
import vesmirteleso.*;

import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vesmir mojprvyvesmir = new Vesmir();

        mojprvyvesmir.startVesmir();

        Hmlovina chukcha = new Hmlovina();
        Hmlovina helloWorld = new Hmlovina();
        Hmlovina goodByeWorld = new Hmlovina();

        Zem MatickaZem = new Zem(5972200, 12756, "Zem");
        MatickaZem.setPlanetaryWeight(2000000);

        Hviezda sun = new Hviezda(3.83 * Math.pow(10, 33), 5 * Math.pow(10, 9), 6 * Math.pow(10, 3), "Sun");

        Vesmirne_teleso jupiter = new Planeta(12351, 12532, "Jupiter");
        Vesmirne_teleso saturn = new Planeta(42251, 45312, "Saturn");
        Vesmirne_teleso mercury = new Planeta(82351, 34532, "Mercury");
        Vesmirne_teleso uranus = new Planeta(901351, 98432, "Uranus");
        Vesmirne_teleso neptune = new Planeta(132351, 14532, "Neptune");

        Slnecna_sustava slnecna_sustava = new Slnecna_sustava();
        slnecna_sustava.addTeleso(MatickaZem);
        slnecna_sustava.addTeleso(jupiter);
        slnecna_sustava.addTeleso(saturn);
        slnecna_sustava.addTeleso(mercury);
        slnecna_sustava.addTeleso(uranus);
        slnecna_sustava.addTeleso(neptune);

        // главная звезда (типо солнце)
        // планеты (косм т)
        // звезды (косм т)
        // коменты (косм т)

        Hviezda Vaicko = new Hviezda(4.83 * Math.pow(10, 43), 10 * Math.pow(10, 8), 8 * Math.pow(10, 4), "Vaicko");

        Vesmirne_teleso kizneckik = new Planeta(212351, 125312, "Kizneckik");
        Vesmirne_teleso milacik = new Planeta(424251, 453122, "Milacik");
        Vesmirne_teleso zlaticko = new Planeta(825351, 345332, "Zlaticko");

        Vesmirne_teleso Cajvsky = new Comet("Cajvsky");

        Galaxy Mliecna_cesta = new Galaxy();

        Slnecna_sustava slnecna_sustava1 = new Slnecna_sustava();
        slnecna_sustava1.addTeleso(Vaicko);
        slnecna_sustava1.addTeleso(kizneckik);
        slnecna_sustava1.addTeleso(milacik);
        slnecna_sustava1.addTeleso(zlaticko);
        slnecna_sustava1.addTeleso(Cajvsky);

        Mliecna_cesta.addSustava(slnecna_sustava);
        Mliecna_cesta.addSustava(slnecna_sustava1);

        Galaxy Danko = new Galaxy();

        Danko.formatMessage(Mliecna_cesta, "Hello, World!");
        Danko.formatMessage(Mliecna_cesta, "GoodBy, World!");


        Mliecna_cesta.formatMessage(Danko, "I am Ml P");

        Mliecna_cesta.showMessages();
        Danko.showMessages();

        Turple turple = new Turple();
        turple.born(new Date());
        MatickaZem.addTora(turple);
        turple.hybsa(10,10,0);
        turple.die(new Date());

        Kapor vianocykapor = new Kapor(50);
        Date dNow = new Date();
        vianocykapor.born(dNow);
        MatickaZem.addTora(vianocykapor);
        vianocykapor.hybsa(10, 10, 0);
        vianocykapor.die(new Date());

        System.out.println("Vianocny kapor sa narodil "+ vianocykapor.getDay_of_birth());

        for (int i = 0; i < vianocykapor.getSustavy().size(); i++) {
            System.out.println(vianocykapor.getSustavy().get(i).getTyp_sustavy());
        }


        Losos losos = new Losos(40);
        losos.born(new Date());
        MatickaZem.addTora(losos);
        losos.hybsa(10, 10, 0);
        losos.die(new Date());

        System.out.println("Losos sa narodil "+ losos.getDay_of_birth());

        Orol orol = new Orol(20);
        orol.born(new Date());
        MatickaZem.addTora(orol);
        orol.hybsa(10, 10, 20);
        orol.die(new Date());

        System.out.println("Orol sa narodil "+ orol.getDay_of_birth());

        Mucha vinnumuska = new Mucha();
        vinnumuska.born(new Date());
        MatickaZem.addTora(vinnumuska);
        vinnumuska.hybsa(10, 20, 30);
        vinnumuska.die(new Date());

        System.out.println("vinnumuska sa narodila "+ vinnumuska.getDay_of_birth());

//        Tvor[] pole = MatickaZem.getPoleTvorov();

        Muz prvyMuz = new Muz(null,null,34,"Adam","PrvyMuz");
        Zena prvaZena = new Zena(null,null,34,"Eva","PrvaZena");

        System.out.println(prvyMuz);
        System.out.println(prvaZena);
        System.out.println("--------------------------------------------");
        Clovek prvedieta = prvaZena.splodit(prvyMuz);
        prvedieta.born(dNow);
        prvedieta.setMeno("Kain");
        System.out.println("--------------------------------------------");
        Clovek druhedieta = prvaZena.splodit(prvyMuz);
        druhedieta.born(dNow);
        druhedieta.setMeno("Abel");
        System.out.println("--------------------------------------------");
        System.out.println(prvedieta);
        System.out.println(druhedieta);

        MessageReader AdamovReader = new MessageReader();
        AdamovReader.obtainFilename(args);
        System.out.println("Filename: " +AdamovReader.getFilename());
        AdamovReader.openAndRead();
        AdamovReader.processMessage();
        System.out.println("Potocna pracovna zlozka: " + System.getProperty("user.dir"));


        MatickaZem.addTora(prvyMuz);
        MatickaZem.addTora(prvaZena);
        MatickaZem.addTora(prvedieta);
        MatickaZem.addTora(druhedieta);



        mojprvyvesmir.stopVesmir();
    }
}