package Units;

public class Monk extends BaseHero {

    public Monk(String name) {
        super(name, "Монах", 100, 5, 2);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}
