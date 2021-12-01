package Prenotazioni;

import java.util.ArrayList;

public class Sportello {

    ArrayList <Prenotazione> coda = new ArrayList <Prenotazione>();

    public int prenota(String name){

        coda.add(new Prenotazione(name));

        return coda.size();
    }

    public Prenotazione estrai(){

        Prenotazione temp = coda.get(0);
        coda.remove(0);
        return temp;
    }

    public void rinuncia(int index){

        try {

            coda.remove(index);
        } catch (Exception e){

            System.out.println("Ordine non trovato.");
        }
    }


}