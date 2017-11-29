package com.sabel.BitconRechner;

import java.util.ArrayList;
import java.util.List;

public class RateDB {

    private List<Rate> ratenListe;


    public RateDB() {
        this.ratenListe = new ArrayList<>();
    }


    public int size() {
        return this.ratenListe.size();
    }


    public boolean add(Rate rate) {
        if (!this.ratenListe.add(rate)) {
            return false;
        }
        return true;
    }


    public boolean add(long timestamp, double rateEUR, double rateUSD) {
        Rate neueRate = new Rate(timestamp, rateEUR, rateUSD);
        return add(neueRate);
    }


    public Rate getLastRate() {
        int laengeListe = size();
        return ratenListe.get(laengeListe - 1);
    }


    public Rate get(int index) {
        return ratenListe.get(index);
    }


    public List<Rate> get(long beginnTimestammp, long endTimestamp) {
        List<Rate> intervalListe = new ArrayList<>();

        for (int i = 0; i < ratenListe.size(); i++) {
            if (ratenListe.get(i).getTimestamp() >= beginnTimestammp && ratenListe.get(i).getTimestamp() <= endTimestamp) {
                intervalListe.add(ratenListe.get(i));
            }

        }
        return intervalListe;
    }

//Mehoden mit Iterator erstellen
    public Rate remove(long timestamp) {
        int index = 0;
        Rate deleteRate = null;
        while (deleteRate == null && index < ratenListe.size()) {
            if (ratenListe.get(index).getTimestamp() == timestamp) {
                deleteRate = ratenListe.get(index);
            } else {
                index++;
            }
        }
        ratenListe.remove(index);
        return deleteRate;
    }

//STringbuilder verwenden
    @Override
    public String toString() {
        String ausgabe = "";
        for (int i = 0; i < ratenListe.size(); i++) {
            ausgabe += ratenListe.get(i).toString();
        }
        return ausgabe;
    }

}//ende klasse
