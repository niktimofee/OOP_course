package Units;

public class Monk extends BaseHero {

    public Monk(String name) {
        super(name, 100, 5, 2);
    }

    public String getInfo() {
        return "Монах";
    }

    public void move() {
        System.out.println("Монах ходит...");
    }
}
