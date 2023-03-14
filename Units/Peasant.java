package Units;

public class Peasant extends BaseHero {

    public Peasant(String name) {
        super(name, "Крестьянин", 100, 5, 1);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}