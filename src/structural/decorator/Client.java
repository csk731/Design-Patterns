package structural.decorator;

import structural.decorator.icecream.Icecream;
import structural.decorator.icecream.cones.StrawberryCone;
import structural.decorator.icecream.fruits.Cherry;
import structural.decorator.icecream.scoops.ChocolateScoop;
import structural.decorator.icecream.scoops.OrangeScoop;
import structural.decorator.icecream.syrups.ChocoSyrup;

public class Client {
    public static void main(String[] args) {
        Icecream icecream = new Cherry(
                                new ChocoSyrup(
                                        new ChocolateScoop(
                                                new OrangeScoop(
                                                        new ChocolateScoop(
                                                                new StrawberryCone()
                                                        )))));
        System.out.println("The total cost of ice cream is: " + icecream.getCost());
        icecream.printDescription();

    }
}
