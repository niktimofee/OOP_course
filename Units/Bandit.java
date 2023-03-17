package Units;

public class Bandit extends BaseHero {

    private int shots;
    private int minDamage;
    private int maxDamage;
    
    public Bandit(String name, String heroType) {
        super(name, "Разбойник", 8, 3, 0, 2, 10, 6, 0, 0);
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
    }

    public Bandit(String name, String heroType, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name, "Разбойник", attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    
    // public Bandit(String name) {
    //     super(name, "Разбойник", 100, 15, 5);
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