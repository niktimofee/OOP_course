package Units;

public class Crossbowman extends BaseHero {

    private int shots;
    private int minDamage;
    private int maxDamage;

    public Crossbowman(String name, String heroType, int health, int speed) {
        super(name, "Арбалетчик" 6, 3, health, speed, 0, 0);
        this.shots = 16;
        this.minDamage = 2;
        this.maxDamage = 3;
    }
    
    public Crossbowman(String name, String heroType, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name, "Арбалетчик", attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    // public Crossbowman(String name) {
    //     super(name, "Арбалетчик", 100, 30, 3);
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