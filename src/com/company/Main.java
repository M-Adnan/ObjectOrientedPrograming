package com.company;

public class Main {

    public static void main(String[] args) {

        DuluxHamburger myburger = new DuluxHamburger("Brown","Chicken");
        //myburger.getOrderDetails();
        myburger.addExtra("ToMato");
        myburger.addExtra("carrot");
        myburger.addExtra("cabbage");
        myburger.getOrderDetails();

    }
}
