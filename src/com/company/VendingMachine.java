package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    HashMap<String, List<Products>> map = new HashMap<>();

    public void getMyProducts() {
        Scanner scan = new Scanner(System.in);
        String myOrder = scan.next();
        String[] str = myOrder.split(":");
        String row = str[0];
        int column = Integer.parseInt(str[1]);
        int quantity = Integer.parseInt(str[2]);
        getProduct(row, column, quantity);
    }

    public void getProduct(String row, int column, int quantity) {
        String productName = map.get(row).get(column).name;
        System.out.println("Please take your " + productName);
    }


}
