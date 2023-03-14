package Units;

public class Crossbowman extends BaseHero {

    public Crossbowman(String name) {
        super(name, "Арбалетчик", 100, 30, 3);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}