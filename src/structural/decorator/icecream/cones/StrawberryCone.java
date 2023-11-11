package structural.decorator.icecream.cones;

import structural.decorator.icecream.Icecream;

public class StrawberryCone implements Icecream {
    Icecream icecream;

    public StrawberryCone() {

    }

    public StrawberryCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public double getCost() {
        if(icecream==null) return 5;
        return 5+ icecream.getCost();
    }

    @Override
    public void printDescription() {
        System.out.println("Strawberry Cone");
        if(icecream!=null) icecream.printDescription();
    }
}
