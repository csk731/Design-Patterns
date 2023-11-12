package behavioural.strategy;

import behavioural.strategy.pathcals.PathCalculator;

public class GoogleMaps {
    PathCalFactory pathCalFactory;

    public GoogleMaps(PathCalFactory pathCalFactory) {
        this.pathCalFactory = pathCalFactory;
    }

    public void findPath(String from, String to, String mode){
        PathCalculator pathCalculator = pathCalFactory.getPathCal(mode);
        if(pathCalculator==null) System.out.println("NO PATH");
        else pathCalculator.findPath(from,to);
    }
}
