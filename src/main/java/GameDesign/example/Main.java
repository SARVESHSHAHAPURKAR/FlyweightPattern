package GameDesign.example;

import GameDesign.Factory.RobotFactory;
import GameDesign.Interfaces.IRobot;

public class Main {
    public static void main(String[] args) {

        IRobot humanRobot1 = RobotFactory.createRobot("HUMANOID");
        humanRobot1.display(2,5);

        IRobot humanRobot2 = RobotFactory.createRobot("HUMANOID");
        humanRobot2.display(3,6);

        IRobot dogRobot1 = RobotFactory.createRobot("DOG");
        dogRobot1.display(6,9);

        IRobot dogRobot2 = RobotFactory.createRobot("DOG");
        dogRobot2.display(5,10);
    }
}