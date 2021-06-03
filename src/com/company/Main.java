package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VendingMachine vm=new VendingMachine();
        Util.initialiseVendingMachine(vm);

        System.out.println("Enter your product number \n exp.A:3 " +
                "(row, column)");
        Util.printMenu(vm);
        vm.getMyProducts();
        Util.printMenu(vm);

    }
}
