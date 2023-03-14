package Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<BaseHero> heroesList1 = new ArrayList<>();
        List<BaseHero> heroesList2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType1 = random.nextInt(7);
            int heroType2 = random.nextInt(7);
            switch (heroType1) {
                case 0:
                    heroesList1.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroesList1.add(new Bandit("Разбойник #" + i));
                    break;
                case 2:
                    heroesList1.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroesList1.add(new Wizard("Колдун #" + i));
                    break;
                case 4:
                    heroesList1.add(new Spearman("Копейщик #" + i));
                    break;
                case 5:
                    heroesList1.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 6:
                    heroesList1.add(new Monk("Монах #" + i));
                    break;
            }
            switch (heroType2) {
                case 0:
                    heroesList2.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroesList2.add(new Bandit("Разбойник #" + i));
                    break;
                case 2:
                    heroesList2.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroesList2.add(new Wizard("Колдун #" + i));
                    break;
                case 4:
                    heroesList2.add(new Spearman("Копейщик #" + i));
                    break;
                case 5:
                    heroesList2.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 6:
                    heroesList2.add(new Monk("Монах #" + i));
                    break;
            }
        }

        for (BaseHero hero : heroesList1) {
            System.out.println(hero.getInfo());
        }

        for (BaseHero hero : heroesList2) {
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