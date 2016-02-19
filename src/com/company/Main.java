package com.company;

public class Main {

    public static void main(String[] args) {

        ClassicHamburger myburger = new ClassicHamburger("Brown","Chicken","Classic");
        //myburger.getOrderDetails();
        myburger.addExtra("ToMato");
        myburger.addExtra("carrot");
        myburger.getOrderDetails();

    }
}
