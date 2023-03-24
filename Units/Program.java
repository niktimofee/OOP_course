package Units;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {

    public static final int GANG_SIZE = 10;
    public static List<BaseHero> whiteSide = new ArrayList<>();
    public static List<BaseHero> darkSide = new ArrayList<>();

    public static void scan(String[] args) {
        Scanner sc = new Scanner(System.in);
        main();

        while(true){
            ConsoleView.view();
            sc.nextLine();
            step();
        }
    }

    public static void main(String[] args) {

        // List<BaseHero> heroesList1 = new ArrayList<>();
        // List<BaseHero> heroesList2 = new ArrayList<>();
        // Random random = new Random();

        for (int i = 0; i < GANG_SIZE + 1; i++) {
            // int heroType1 = random.nextInt(4);
            // int heroType2 = random.nextInt(4) + 4;
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    whiteSide.add(new Bandit("Разбойник #" + i));
                    break;
                case 2:
                    whiteSide.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    whiteSide.add(new Wizard("Колдун #" + i));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 4:
                    darkSide.add(new Peasant("Крестьянин #" + i));
                    break;
                case 5:
                    darkSide.add(new Spearman("Копейщик #" + i));
                    break;
                case 6:
                    darkSide.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 7:
                    darkSide.add(new Monk("Монах #" + i));
                    break;
            }
        }
    }

        public static void step() {
            List<BaseHero> allHeroes = new ArrayList<>();

            allHeroes.addAll(whiteSide);
            allHeroes.addAll(darkSide);

            Collections.sort(allHeroes, (h1, h2) -> h2.getSpeed() - h1.getSpeed());

            for (BaseHero hero : allHeroes) {
            System.out.println(hero.getInfo());
            }

            // for (BaseHero hero : allHeroes) {
            //     if (darkSide.contains(hero)) {
            //         hero.step(whiteSide, darkSide);
            //     } else
            //         hero.step(darkSide, whiteSide);
            // }

        }

        // Peasant peasant = new Peasant("Джек", 10, 20);

        // Peasant peasant = new Peasant("Кир");
        // Bandit bandit = new Bandit("Конан");
        // Sniper sniper = new Sniper("Персеас");
        // Wizard wizard = new Wizard("Вентидиус");
        // Spearman spearman = new Spearman("Отанес");
        // Crossbowman crossbowman = new Crossbowman("Авидиус");
        // Monk monk = new Monk("Титус");

    }