package Units;

public class Spearman extends InfantClass {

    protected int attack;
    protected int defense;
    protected int shots;
    protected int minDamage;
    protected int maxDamage;
    protected int health;
    protected int speed;
    protected int delivery;
    protected int magic;

    public Spearman(String name, String heroType) {
        super(name, "Копейщик");
        this.attack = 4;
        this.defense = 5;
        this.shots = 0;
        this.minDamage = 1;
        this.maxDamage = 3;
        this.health = 10;
        this.speed = 4;
        this.delivery = 0;
        this.magic = 0;
    }

    public Spearman(String name, String heroType, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name, "Копейщик");
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }

    // public Spearman(String name) {
    //     super(name, "Копейщик", 100, 20, 3);
    // }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getShots() {
        return shots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getMagic() {
        return magic;
    }

    // public String getInfo() {
    //     return heroType;
    // }

    // public void step() {
    //     System.out.println(heroType + " ходит...");
    // }
}
