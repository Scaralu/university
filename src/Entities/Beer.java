package Entities;

import Entities.Cereal;
import Entities.IntFungi;

public class Beer extends Cereal implements IntFungi {

    private String beerName;

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public Beer(String cerealName, String beerName){
        this.cerealName = cerealName;
        this.beerName = beerName;
    }

    public static void alcohol(){
        System.out.println("Fermentation complete! Alcoholic Drink.");
    }

    public Beer() {
    }

    @Override
    public String toString() {
        return "\nBeer name:  "+ beerName +"\nType:  " + cerealName + "\n\nAlcoholic beer, never drink before or when driving or operating machinery";
    }
}
