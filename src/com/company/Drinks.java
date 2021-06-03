package com.company;

public class Drinks extends Products {
    double volume;



    public Drinks(double volume, String name, int quantity) {
        super(name,quantity);
               this.volume = volume;

    }


}
