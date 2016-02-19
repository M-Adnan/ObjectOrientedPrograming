package com.company;

/**
 * Created by muhammada on 16/02/2016.
 */
public class ClassicHamburger {

    private String name;
    private String breadRoll;
    private String meat;
    private double basePrice;
    private double price;
    private boolean isLettuceAdded = false;
    private boolean istomatoAdded = false;
    private boolean isCarrotAdded = false;
    private boolean isJalapenoAdded = false;
    private double extraLettucePrice = 0.10;
    private double extraTomatoPrice = 0.20;
    private double extraCarrotPrice = 0.30;
    private double extraJalapenoPrice = 0.40;

    public ClassicHamburger(String breadRoll, String meat, String name){
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = 40;
        this.price = this.basePrice;
    }

    public double getExtraLettucePrice() {
        return extraLettucePrice;
    }

    public double getExtraTomatoPrice() {
        return extraTomatoPrice;
    }

    public double getExtraCarrotPrice() {
        return extraCarrotPrice;
    }

    public double getExtraJalapenoPrice() {
        return extraJalapenoPrice;
    }

    public boolean isLettuceAdded() {
        return isLettuceAdded;
    }

    public boolean istomatoAdded() {
        return istomatoAdded;
    }

    public boolean isCarrotAdded() {
        return isCarrotAdded;
    }

    public boolean isJalapenoAdded() {
        return isJalapenoAdded;
    }

    public double getPrice() {
        return price;
    }

    public double getbasePrice() {
        return basePrice;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public void setPrice(double price) {
        this.price += price;
    }

    public void addExtra(String extra){
        switch (extra.toLowerCase()){

            case "lettuce":{
                addLettuce();
                break;
            }

            case "tomato":{
                addTomato();
                break;
            }

            case "carrot":{
                addCarrot();
                break;
            }

            case "jalapeno":{
                addJalapeno();
                break;
            }
            default:
                System.out.println(" No valid extra's option selected");
        }
    }

    private void addLettuce() {
        if (this.isLettuceAdded) {
            System.out.println(this.getClass().getSimpleName() + " Lettuce has already been added to your hamburger");
        } else {
            this.isLettuceAdded = true;
            this.price += extraLettucePrice;
            System.out.println(this.getClass().getSimpleName() + " Lettuce has been added to your hamburger");
        }
    }

    private void addTomato (){
        if(this.istomatoAdded){
            System.out.println(this.getClass().getSimpleName() + " Tomato has already been added to your hamburger");
        }else{
            this.istomatoAdded = true;
            this.price += extraTomatoPrice;
            System.out.println(this.getClass().getSimpleName() + " Tomato has been added to your hamburger");
        }
    }

    private void addCarrot (){
        if(this.isCarrotAdded){
            System.out.println(this.getClass().getSimpleName() + " Carrot has already been added to your hamburger");
        }else{
            this.isCarrotAdded = true;
            this.price += extraCarrotPrice;
            System.out.println(this.getClass().getSimpleName() + " Carrot has been added to your hamburger");
        }
    }

    private void addJalapeno (){
        if(this.isJalapenoAdded){
            System.out.println(this.getClass().getSimpleName() + " Jalapeno has already been added to your hamburger");
        }else{
            this.isCarrotAdded = true;
            this.price += extraJalapenoPrice;
            System.out.println(this.getClass().getSimpleName() + " Jalapeno has been added to your hamburger");
        }
    }

    public void getOrderDetails(){
        System.out.println(getClass().getSimpleName() + " Your " + this.meat + "Hamburger with " + this.breadRoll + " bread price is " + String.format("%.2f",basePrice) + " Pounds");
        if(isLettuceAdded)
            System.out.println(getClass().getSimpleName() + " Your added lettuce to your hamburger for an additional cost of " + String.format("%.2f",extraLettucePrice) + " Pence");
        if(istomatoAdded)
            System.out.println(getClass().getSimpleName() + " Your added Tomato to your hamburger for an additional cost of " + String.format("%.2f",extraTomatoPrice) + " Pence");
        if(isCarrotAdded)
            System.out.println(getClass().getSimpleName() + " Your added Carrot to your hamburger for an additional cost of " + String.format("%.2f",extraCarrotPrice) + " Pence");
        if(isJalapenoAdded)
            System.out.println(getClass().getSimpleName() + " Your added Jalapeno to your hamburger for an additional cost of " + String.format("%.2f",extraJalapenoPrice) + " Pence");
        System.out.println("Total price of your order is : " + String.format("%.2f",price));
    }
}
