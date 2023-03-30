package Units;

public class Wizard extends MagicClass {

    public Wizard(String name, String heroType) {
        super(17, 12, 0, "-5", 30, 9, 0, 1, name, "Колдун");
    }

    public Wizard(int attack, int defense, int shots, String damage, int health, int speed, int delivery, int magic, String name, String heroType) {
        super(attack, defense, shots, damage, health, speed, delivery, magic, name, "Колдун");
    }

    // public Wizard(String name) {
    //     super(name, "Колдун", 100, 25, 2);
    // }

    // public String getInfo() {
    //     return heroType;
    // }

    // public void step() {
    //     System.out.println(heroType + " ходит...");
    // }
}