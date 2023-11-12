package behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps map=new GoogleMaps(new PathCalFactory());
        map.findPath("A","B","CAR");
    }
}
