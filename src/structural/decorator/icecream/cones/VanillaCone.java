package structural.decorator.icecream.cones;

import structural.decorator.icecream.Icecream;

public class VanillaCone implements Icecream{
    Icecream icecream;

    public VanillaCone() {

    }

    public VanillaCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public double getCost() {
        if(icecream==null) return 5;
        return 5 + icecream.getCost();
    }

    @Override
    public void printDescription() {
        System.out.println("Vanilla Cone");
        if(icecream!=null) icecream.printDescription();
    }
}
