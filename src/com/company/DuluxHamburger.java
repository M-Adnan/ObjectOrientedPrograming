package com.company;

/**
 * Created by muhammada on 16/02/2016.
 */
public class DuluxHamburger extends ClassicHamburger{
    private boolean isDrinkAdded = false;
    private boolean isChipsAdded = false;

    public DuluxHamburger(String breadRoll, String meat) {
        super(breadRoll, meat);
        addDrink();
        addChips();
        setName("Dulux");
        setBasePrice(80);
    }

    public void addDrink(){
        isDrinkAdded = true;
    }

    public void addChips(){
        isChipsAdded = true;
    }

    @Override
    public void getOrderDetails() {
        System.out.println(getClass().getSimpleName() + " Your " + getName() + " " + getMeat() + " Hamburger with " + getBreadRoll() + " bread price is " + String.format("%.2f",getbasePrice()) + " Pounds");
    }

    @Override
    public void addExtra(String extra) {
        System.out.println(getClass().getSimpleName() + " No extra option available for Dulux Hamburger");
    }


}
