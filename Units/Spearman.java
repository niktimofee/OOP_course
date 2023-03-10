package Units;

public class Spearman extends BaseHero {

    public Spearman(String name) {
        super(name, 100, 20, 3);
    }

    public String getInfo() {
        return "Копейщик";
    }

    public void move() {
        System.out.println("Копейщик ходит...");
    }
}
