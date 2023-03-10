package Units;

public class Peasant extends BaseHero {

    public Peasant(String name) {
        super(name, 100, 5, 1);
    }

    public String getInfo() {
        return "Крестьянин";
    }

    public void move() {
        System.out.println("Крестьянин ходит...");
    }
}