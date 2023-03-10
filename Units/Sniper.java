package Units;

public class Sniper extends BaseHero {

    public Sniper(String name) {
        super(name, 100, 50, 1);
    }

    public String getInfo() {
        return "Снайпер";
    }   

    public void move() {
        System.out.println("Снайпер ходит...");
    }
}