package Units;

public class Peasant extends BaseHero {

    protected int attack;
    protected int defense;
    protected int shots;
    protected int damage;
    protected int health;
    protected int speed;
    protected int delivery;
    protected int magic;

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

    public Peasant(String name, String heroType, int x, int y) {
        super(name, "Крестьянин", x, y);
    }

    public void attack(BaseHero hero) {
        System.out.println(getHeroType() + getName() + " attacks " + hero.getHeroType() + hero.getName());
    }

    public void move(int deltaX, int deltaY) {
        System.out.println(getHeroType() + getName() + " moves to (" + (coord.getX() + deltaX) + ", " + (coord.getY() + deltaY) + ")");
        coord.setX(coord.getX() + deltaX);
        coord.setY(coord.getY() + deltaY);
    }
}