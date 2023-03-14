package Units;

public class Wizard extends BaseHero {

    public Wizard(String name) {
        super(name, "Колдун", 100, 25, 2);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}