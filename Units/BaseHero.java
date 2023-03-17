package Units;

public abstract class BaseHero {
    
    private int attack;
    private int defense;
    private int shots;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;

    // protected String name;
    // protected String heroType;
    // protected int hp;
    // protected int damage;
    // protected int speed;

    public Bandit(String name, String heroType) {
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
    }

    public Bandit(String name, String heroType, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
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
    }

    // public BaseHero(String name, String heroType, int hp, int damage, int speed) {
    //     this.name = name;
    //     this.heroType = heroType;
    //     this.hp = hp;
    //     this.damage = damage;
    //     this.speed = speed;
    // }

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

    // public String getInfo() {
    //     return String.format("Name: %s , %s , Hp: %d , Damage: %d , Speed: %d",
    //             this.name, this.heroType, this.hp, this.damage, this.speed);
    // }

    // public void takingHeal(int heal) {
    //     if (this.hp + heal <= 100) {
    //         this.hp += heal;
    //     }
    // }

    // public void takingDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    //     // else { die(); }
    // }

    // public void attack(BaseHero target) {
    //     int damage = this.damage;
    //     target.takingDamage(damage);
    // }

    // public abstract void step();

    // public abstract void specialAbility();

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
}