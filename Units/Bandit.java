package Units;

public class Bandit extends BaseHero {

    public Bandit(String name) {
        super(name, 100, 15, 5);
    }

    public String getInfo() {
        return "Разбойник";
    }

    public void move() {
        System.out.println("Разбойник ходит...");
    }
}
