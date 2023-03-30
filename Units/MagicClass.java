package Units;

import java.util.ArrayList;

public abstract class MagicClass extends BaseHero {
    int stamina;

    public MagicClass(int health, int speed, int minDamage, int maxDamage, int armor, int stamina, String name, int x, int y) {
        super(health, speed, minDamage, maxDamage, armor, name, x, y);
        this.stamina = stamina;
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
}