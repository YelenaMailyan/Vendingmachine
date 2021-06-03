package com.company;

public class Snacks extends Products {
    double weight;

    public Snacks(double weight, String name,int quantity) {
        super(name,quantity);
        this.weight = weight;

    }
}
