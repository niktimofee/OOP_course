package Units;

public class Wizard extends BaseHero {

    public Wizard(String name) {
        super(name, 100, 25, 2);
    }

    public String getInfo() {
        return "Колдун";
    }

    public void move() {
        System.out.println("Колдун ходит...");
    }
}