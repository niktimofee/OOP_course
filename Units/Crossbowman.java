package Units;

public class Crossbowman extends BaseHero {

    public Crossbowman(String name) {
        super(name, 100, 30, 3);
    }

    public String getInfo() {
        return "Арбалетчик";
    }

    public void move() {
        System.out.println("Арбалетчик ходит...");
    }
}