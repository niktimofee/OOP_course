package Units;

public class Sniper extends BaseHero {

    protected int shots;
    protected int minDamage;
    protected int maxDamage;

    public Sniper(String name, String heroType) {
        super(name, "Снайпер", 12, 10, 32, 15, 9, 0, 0);
        this.shots = 32;
        this.minDamage = 8;
        this.maxDamage = 10;
    }

    public Sniper(String name, String heroType, int attack, int defense, int shots, int health, int speed, int delivery, int magic, int minDamage, int maxDamage) {
        super(name, "Снайпер", attack, defense, shots, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    // public Sniper(String name) {
    //     super(name, "Снайпер", 100, 50, 1);
    // }

    public int getShots() {
        return shots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    // public String getInfo() {
    //     return heroType;
    // }

    // public void step() {
    //     System.out.println(heroType + " ходит...");
    // }
}