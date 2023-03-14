package Units;

public class Bandit extends BaseHero {

    public Bandit(String name) {
        super(name, "Разбойник", 100, 15, 5);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}
