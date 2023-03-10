package Units;

public abstract class BaseHero {
    protected String name;
    protected String heroType;
    protected int hp;
    protected int damage;
    protected int speed;

    public BaseHero(String name, String heroType, int hp, int damage, int speed) {
        this.name = name;
        this.heroType = heroType;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
    }

    public String getInfo() {
        return String.format("Name: %s , %s , Hp: %d , Damage: %d , Speed: %d",
                this.name, this.heroType, this.hp, this.damage, this.speed);
    }

    public void takingHeal(int heal) {
        if (this.hp + heal <= 100) {
            this.hp += heal;
        }
    }

    public void takingDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void attack(BaseHero target) {
        int damage = this.damage;
        target.takingDamage(damage);
    }

    public abstract void step();

    // public abstract void specialAbility();
}