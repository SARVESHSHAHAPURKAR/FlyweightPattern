package GameDesign.Factory;

import GameDesign.Implementations.DogRobot;
import GameDesign.Implementations.HumanoidRobot;
import GameDesign.Implementations.Spirits;
import GameDesign.Interfaces.IRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){

        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }
        else{
            if(robotType == "HUMANOID"){
                Spirits spirits = new Spirits();
                HumanoidRobot humanoidRobot = new HumanoidRobot("HUMANOID", spirits);
                roboticObjectCache.put(robotType, humanoidRobot);
                return humanoidRobot;
            }
            else if(robotType=="DOG"){
                Spirits spirits = new Spirits();
                DogRobot dogRobot = new DogRobot("DOG", spirits);
                roboticObjectCache.put(robotType, dogRobot);
                return dogRobot;
            }
        }

        return null;
    }

}
