package structural.flyweight.bullets;

public class FlyingBullet {
    Bullet bullet;

    public FlyingBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    double direction;
    int speed;
    int targetCoordinates;
}
