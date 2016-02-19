package com.company;

/**
 * Created by muhammada on 16/02/2016.
 */
public class DuluxHamburger extends ClassicHamburger{
    private boolean isDrinkAdded = false;
    private boolean isChipsAdded = false;

    public DuluxHamburger(String breadRoll, String meat) {
        super(breadRoll, meat, "DeluxBurger");
        addDrink();
        addChips();

    }

    public void addDrink(){
        isDrinkAdded = true;
    }

    public void addChips(){
        isChipsAdded = true;
    }

    @Override
    public void getOrderDetails() {
        super.getOrderDetails();
    }

    @Override
    public void addExtra(String extra) {
        System.out.println(getClass().getSimpleName() + " No extra option available for Dulux Hamburger");
    }


}
