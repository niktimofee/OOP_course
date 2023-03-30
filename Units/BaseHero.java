package Units;

import java.util.ArrayList;
import java.util.Random;

// import javax.swing.text.Position;

public abstract class BaseHero {
    
    protected int attack;
    protected int defense;
    protected int shots;
    protected int minDamage;
    protected int maxDamage;
    protected int health;
    protected int speed;
    protected int delivery;
    protected int magic;
    protected int stamina;
    protected String name;
    protected String heroType;
    protected Position position;

    public BaseHero(String name, String heroType, int x, int y) {
        super(name);
        super(heroType);
        this.attack = 8;
        this.defense = 3;
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
        this.health = 10;
        this.speed = 6;
        this.delivery = 0;
        this.magic = 0;
        this.stamina = 1;
        position = new Position(x, y);
    }

    public BaseHero(String name, String heroType, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic, int stamina, int x, int y) {
        super(name);
        super(heroType);
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.stamina = stamina;
        position = new Position(x, y);
    }

    public String getName(String name) {
        return name;
    }

    public String getHeroType(String heroType) {
        return heroType;
    }

    public Object getAttack() {
        return attack;
    }

    public Object getDefense() {
        return defense;
    }

    public Object getShots() {
        return shots;
    }

    public Object getDamageMin() {
        return minDamage;
    }

    public Object getDamageMax() {
        return maxDamage;
    }

    public Object getHealth() {
        return health;
    }

    public Object getSpeed() {
        return speed;
    }

    public Object getDelivery() {
        return delivery;
    }

    public Object getMagic() {
        return magic;
    }

    public void attack(BaseHero target, int damage, int maxDamage) {
        int causedDamage;
        if (damage < target.defense) causedDamage = damage;
        else {
            switch (new Random().nextInt(4)){
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
            }
        }
        target.getDamage(causedDamage);
    }

    public void getDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else
            this.health = 0;
    }

    public String getInfo() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d, Shots: %d, Speed: %d, Delivery: %d, Magic: %d",
                this.getName(), this.getHeroType(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax(), this.getShots(), this.getSpeed(),
                this.getDelivery(), this.getMagic());
    }

    public String getShortDescription() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d",
                this.getName(), this.getHeroType(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax());
    }

    public Position getPosition() {
        return position;
    }
}