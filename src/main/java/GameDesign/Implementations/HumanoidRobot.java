package GameDesign.Implementations;

import GameDesign.Interfaces.IRobot;

public class HumanoidRobot implements IRobot {

    private String type;
    private Spirits body;

    // as this class is immutable, data should be of private type
    // and create only getters, not setters


    public HumanoidRobot(String type, Spirits body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Spirits getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {

    }
}
