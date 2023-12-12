package com.company.zive_tvory.stavovce_diely.RozmnozovaciaClovek;

import com.company.zive_tvory.clovecina.Clovek;
import com.company.zive_tvory.stavovce_diely.Typ_sustavy;

    public class Rozmnozovacia_sustava_Zena extends Rozmnozovacia_sustava{
        private int BabyDevelopmentProgress =0;

        public Rozmnozovacia_sustava_Zena(Typ_sustavy typSustavy) {
            super(typSustavy);
        }

        public int takeAndCareBaby(Clovek plod){
            while(BabyDevelopmentProgress!=100)
            {
                BabyDevelopmentProgress++;
            }
            plod.create_sustavy();
            return BabyDevelopmentProgress;
        }

        }


