package com.company;

import java.util.ArrayList;
import java.util.List;

public class Util {
   //= new VendingMachine();
    static void initialiseVendingMachine( VendingMachine vm ) {

        List<Products> drinks = new ArrayList<Products>() {
            {
                add(new Drinks(0.25, "Cola", 13));
                add(new Drinks(0.2, "Ice Tea", 14));
                add(new Drinks(0.5, "Water", 15));
                add(new Drinks(0.25, "Iced coffee", 16));
            }
        };
        List<Products> sweets = new ArrayList<Products>() {
            {
                add(new Sweet("Twix", 10));
                add(new Sweet("Kit-Kat", 10));
                add(new Sweet("Sneakers", 14));
                add(new Sweet("Alpen Gold", 15));
            }
        };
        List<Products> snacks = new ArrayList<Products>() {
            {
                add(new Snacks(0.4, "Lays", 16));
                add(new Snacks(0.3, "Doritos", 1));
                add(new Snacks(0.1, "Pringels", 5));
                add(new Snacks(0.5, "Aghi Dcoghik", 7));
            }
        };
        vm.map.put("A", drinks);
        vm.map.put("B", sweets);
        vm.map.put("C", snacks);
    }


    static void printMenu( VendingMachine vm ) {
        for (int i = 0; i <= vm.map.size(); i++) {
            System.out.print("A:" + (i) + ":" + vm.map.get("A").get(i).name + "(" + vm.map.get("A").get(i).quantity + ")    ");
        }
        System.out.println("\n");

        for (int i = 0; i <= vm.map.size(); i++) {
            System.out.print("B:" + (i) + ":" +vm.map.get("B").get(i).name + "(" + vm.map.get("B").get(i).quantity + ")    ");
        }
        System.out.println("\n");

        for (int i = 0; i <= vm.map.size(); i++) {
            System.out.print("C:" + (i) + ":" + vm.map.get("C").get(i).name + "(" + vm.map.get("C").get(i).quantity + ")    ");
        }
        System.out.println("\n");
    }
}
