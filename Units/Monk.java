package Units;

public class Monk extends MagicClass {

    protected int magic;

    public Monk(String name, String heroType) {
        super(name, "Монах", 12, 7, 0, -4, -4, 30, 5);
        this.magic = 1;
    }
    
    public Monk(String name, String heroType, int attack, int defense, int shots, int damageMin, int damageMax,
                int health, int speed, int mana) {
        super(name, "Монах", attack, defense, shots, damageMin, damageMax, health, speed);
        this.magic = mana;
    }

    // public Monk(String name) {
    //     super(name, "Монах", 100, 5, 2);
    // }

    public int getMagic() {
        return magic;
    }
}