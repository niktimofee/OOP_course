package Units;

public class Crossbowman extends BaseHero {

    protected int shots;
    protected int minDamage;
    protected int maxDamage;

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

    public void step() {
        if (getHealth() == 0 || shots == 0) {
            return;
        }
        BaseHero closestEnemy = null;
        double closestDistance = Double.MAX_VALUE;
        for (BaseHero enemy : getEnemies()) {
            double distance = Math.sqrt(Math.pow(enemy.getX() - getX(), 2) + Math.pow(enemy.getY() - getY(), 2));
            if (distance < closestDistance) {
                closestEnemy = enemy;
                closestDistance = distance;
            }
        }
        if (closestEnemy != null) {
            int damage = (int) Math.round((getMinDamage() + getMaxDamage()) / 2.0);
            closestEnemy.GetDamage(damage);
        }
        Peasant closestPeasant = null;
        closestDistance = Double.MAX_VALUE;
        for (Peasant peasant : getPeasant()) {
            double distance = Math.sqrt(Math.pow(peasant.getX() - getX(), 2) + Math.pow(peasant.getY() - getY(), 2));
            if (distance < closestDistance) {
                closestPeasant = peasant;
                closestDistance = distance;
            }
        }
        if (closestPeasant == null) {
            shots--;
        }
    }
}