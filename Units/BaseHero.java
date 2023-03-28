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

    private String getName(String name) {
        return name;
    }

    private String getHeroType(String heroType) {
        return heroType;
    }

    private Object getAttack() {
        return attack;
    }

    private Object getDefense() {
        return defense;
    }

    private Object getShots() {
        return shots;
    }

    private Object getDamageMin() {
        return minDamage;
    }

    private Object getDamageMax() {
        return maxDamage;
    }

    private Object getHealth() {
        return health;
    }

    private Object getSpeed() {
        return speed;
    }

    private Object getDelivery() {
        return delivery;
    }

    private Object getMagic() {
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

    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends){
        if (this.stamina > 0 && this.health > 0) {
            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;
            for (BaseHero hero : team) {
                if(this.position.getDistance(hero)<minDistance && hero.health>0){
                    minDistance = this.position.getDistance(hero);
                    target = hero;
                }
            }
            if(this.position.getDistance(target)>=2){
                this.position.direction(target.position, friends);
            }
            else if(target.health > 0){
                this.attack(target, this.minDamage, this.maxDamage);
                this.stamina--;
            }
        }
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