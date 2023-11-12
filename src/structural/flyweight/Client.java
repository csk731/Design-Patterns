package structural.flyweight;

import structural.flyweight.bullets.Bullet5mm;
import structural.flyweight.bullets.FlyingBullet;

public class Client {
    public static void main(String[] args) {
        FlyingBullet bullet=new FlyingBullet(new Bullet5mm());
    }
}
