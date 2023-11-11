package structural.decorator.icecream.scoops;

import structural.decorator.icecream.Icecream;

public class OrangeScoop implements Icecream{
    Icecream icecream;

    public OrangeScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public double getCost() {
        return 3 + icecream.getCost();
    }

    @Override
    public void printDescription() {
        System.out.println("Orange Scoop");
        icecream.printDescription();
    }
}
