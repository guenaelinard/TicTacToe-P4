package players;

public class Player {
    private String attribute;

    public Player(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Le joueur qui joue les " + attribute;
    }
}
