package behavioural.strategy;

import behavioural.strategy.pathcals.CarPathCal;
import behavioural.strategy.pathcals.PathCalculator;
import behavioural.strategy.pathcals.WalkPathCal;

public class PathCalFactory {

    public PathCalculator getPathCal(String mode){
        if(mode.equals(Mode.CAR.name())){
            return new CarPathCal();
        }
        else if(mode.equals(Mode.WALK.name())){
            return new WalkPathCal();
        }
        return null;
    }
}
