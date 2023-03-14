package Units;

public class Sniper extends BaseHero {

    public Sniper(String name) {
        super(name, "Снайпер", 100, 50, 1);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}