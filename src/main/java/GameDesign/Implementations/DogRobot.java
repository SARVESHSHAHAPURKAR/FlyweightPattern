package GameDesign.Implementations;

import GameDesign.Interfaces.IRobot;

public class DogRobot implements IRobot {

    private String type;
    private Spirits body;

    public DogRobot(String type, Spirits body) {
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
