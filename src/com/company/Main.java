package com.company;

public class Main {

    public static void main(String[] args) {

        HealthyHamburger myburger = new HealthyHamburger("Chicken");
        //myburger.getOrderDetails();
        myburger.addExtra("ToMato");
        myburger.addExtra("carrot");
        myburger.addExtra("cabbage");
        myburger.getOrderDetails();

    }
}
