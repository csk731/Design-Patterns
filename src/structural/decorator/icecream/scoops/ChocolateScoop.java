package structural.decorator.icecream.scoops;

import structural.decorator.icecream.Icecream;

public class ChocolateScoop implements Icecream {
    Icecream icecream;

    public ChocolateScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public double getCost() {
        return 3 + icecream.getCost();
    }

    @Override
    public void printDescription() {
        System.out.println("Chocolate Scoop");
        icecream.printDescription();
    }
}
