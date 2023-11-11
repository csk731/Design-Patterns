package structural.decorator.icecream.syrups;

import structural.decorator.icecream.Icecream;

public class ChocoSyrup implements Icecream {
    Icecream icecream;

    public ChocoSyrup(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public double getCost() {
        return 2 + icecream.getCost();
    }

    @Override
    public void printDescription() {
        System.out.println("Choco Syrup");
        icecream.printDescription();
    }
}
