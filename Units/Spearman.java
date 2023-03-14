package Units;

public class Spearman extends BaseHero {

    public Spearman(String name) {
        super(name, "Копейщик", 100, 20, 3);
    }

    public String getInfo() {
        return heroType;
    }

    public void step() {
        System.out.println(heroType + " ходит...");
    }
}
