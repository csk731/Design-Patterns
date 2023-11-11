package structural.decorator.icecream.fruits;

import structural.decorator.icecream.Icecream;

public class Cherry implements Icecream {
    Icecream icecream;

    public Cherry(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public double getCost() {
        return 1 + icecream.getCost();
    }

    @Override
    public void printDescription() {
        System.out.println("Cherry");
        icecream.printDescription();
    }
}
