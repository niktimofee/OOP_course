package Units;

public class Peasant extends BaseHero {

    private int attack;
    private int defense;
    private int shots;
    private int damage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;

    public Peasant(String name, String heroType) {
        super(name, "Крестьянин");
        this.attack = 1;
        this.defense = 1;
        this.shots = 0;
        this.damage = 1;
        this.health = 11;
        this.speed = 3;
        this.delivery = 3;
        this.magic = 0;
    }

    public Peasant(String name, String heroType, int attack, int defense, int shots, int damage, int health, int speed, int delivery, int magic) {
        super(name, "Крестьянин");
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }

    // public Peasant(String name) {
    //     super(name, "Крестьянин", 100, 5, 1);
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

    public int getDamage() {
        return damage;
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