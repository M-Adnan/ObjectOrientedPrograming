package com.company;

/**
 * Created by muhammada on 16/02/2016.
 */
public class HealthyHamburger extends ClassicHamburger {

    private boolean isCabbageAdded = false;
    private boolean isAvocadoAdded = false;
    private double extraCabbagePrice = 0.50;
    private double extraAvocadoPrice = 0.70;

    public HealthyHamburger(String meat) {
        super("Brown Raye Bread", meat, "HealthyBurger");
    }

    @Override
    public void addExtra(String extra) {
        switch (extra.toLowerCase()) {
            case "cabbage": {
                addCabbage();
                break;
            }
            case "avocado": {
                addAvocado();
                break;
            }
            default:
                super.addExtra(extra);
        }
    }

    private void addCabbage(){

        if(isCabbageAdded){
            System.out.println(getClass().getSimpleName() + " Cabbage has already been added to your hamburger");
        }else{
            isCabbageAdded = true;
            setPrice(extraCabbagePrice);
            System.out.println(getClass().getSimpleName() + " Cabbage has been added to your hamburger");
        }
    }

    private void addAvocado(){

        if(isAvocadoAdded){
            System.out.println(getClass().getSimpleName() + " Avocado has already been added to your hamburger");
        }else{
            isAvocadoAdded = true;
            setPrice(extraAvocadoPrice);
            System.out.println(getClass().getSimpleName() + " Avocado has been added to your hamburger");
        }
    }

    @Override
    public void getOrderDetails() {
        System.out.println(getClass().getSimpleName() + " Your " + getMeat() + "Hamburger with " + getBreadRoll() + " bread price is " + String.format("%.2f",getbasePrice()) + " Pounds");
        if(isLettuceAdded())
            System.out.println(getClass().getSimpleName() + " Your added lettuce to your hamburger for an additional cost of " + String.format("%.2f",getExtraLettucePrice()) + " Pence");
        if(istomatoAdded())
            System.out.println(getClass().getSimpleName() + " Your added Tomato to your hamburger for an additional cost of " + String.format("%.2f",getExtraTomatoPrice()) + " Pence");
        if(isCarrotAdded())
            System.out.println(getClass().getSimpleName() + " Your added Carrot to your hamburger for an additional cost of " + String.format("%.2f",getExtraCarrotPrice()) + " Pence");
        if(isJalapenoAdded())
            System.out.println(getClass().getSimpleName() + " Your added Jalapeno to your hamburger for an additional cost of " + String.format("%.2f",getExtraJalapenoPrice()) + " Pence");
        if(isCabbageAdded)
            System.out.println(getClass().getSimpleName() + " Your added Cabbage to your hamburger for an additional cost of " + String.format("%.2f",extraCabbagePrice) + " Pence");
        if(isAvocadoAdded)
            System.out.println(getClass().getSimpleName() + " Your added Avocado to your hamburger for an additional cost of " + String.format("%.2f",extraAvocadoPrice) + " Pence");
        System.out.println("Total price of your order is : " + String.format("%.2f",getPrice()));
    }
}
