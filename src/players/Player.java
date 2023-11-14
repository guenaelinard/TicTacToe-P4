package players;

public class Player {
    private String attribute;

    public Player(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String toString() {
        return "Le joueur joue les " + attribute;
    }
}
