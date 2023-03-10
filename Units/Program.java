package Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<BaseHero> heroesList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType = random.nextInt(7);
            switch (heroType) {
                case 0:
                    heroesList.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroesList.add(new Bandit("Разбойник #" + i));
                    break;
                case 2:
                    heroesList.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroesList.add(new Wizard("Колдун #" + i));
                    break;
                case 4:
                    heroesList.add(new Spearman("Копейщик #" + i));
                    break;
                case 5:
                    heroesList.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 6:
                    heroesList.add(new Monk("Монах #" + i));
                    break;
            }
        }

        for (BaseHero hero : heroesList) {
            System.out.println(hero.getInfo());
        }

        // Peasant peasant = new Peasant("Кир");
        // Bandit bandit = new Bandit("Конан");
        // Sniper sniper = new Sniper("Персеас");
        // Wizard wizard = new Wizard("Вентидиус");
        // Spearman spearman = new Spearman("Отанес");
        // Crossbowman crossbowman = new Crossbowman("Авидиус");
        // Monk monk = new Monk("Титус");

    }
}