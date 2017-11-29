package com.sabel.BitconRechner;

import java.util.Date;

public class Testklasse {

    public static void main(String[] args) {

        RateDB rateDB = new RateDB();

        rateDB.add(new Rate(823523, 54, 64));
        rateDB.add(new Rate(123456, 12, 56));
        rateDB.add(new Rate(423456, 12, 56));
        rateDB.add(new Rate(513456, 12, 56));

        System.out.println("Alle Raten in Liste anzeigen:");
        System.out.println(rateDB.toString());

        System.out.println("Letzte Rate ausgeben:");
        System.out.println(rateDB.getLastRate());

        System.out.println("Löschen:");
        System.out.println(rateDB.remove(123456).toString());
        System.out.println("Alle Raten in Liste anzeigen:");
        System.out.println(rateDB.toString());


        System.out.println("Interval ausgeben:");
        System.out.println(rateDB.get(333333, 555555).toString());

        System.out.println("Zeitstempel:");
        System.out.println(new Date().getTime());
    }

}
