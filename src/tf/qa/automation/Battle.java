package tf.qa.automation;

import java.util.Random;

public class Battle {

    public static void start() {
        System.out.println("Приветствуем, благородные рыцари, перы и,конечно, милые дамы.");
        System.out.println("Сегодня вы станете свидетелями великой битвы,исход которой никто не может предсказать.");
        System.out.println("Давайте поприветствуем наших участников!");


        Bard bard = new Bard("name", 1);
        System.out.println(bard);

        Paladin paladin = new Paladin("name", 1);
        System.out.println(paladin);

        // random просто для генерации появления волшебного дракона и благополучного исхода битвы

        boolean theDragon = false;
        Random random = new Random();
        while (!theDragon && bard.hp > 0 && paladin.hp > 0) {

            int damagePaladin = paladin.sward(paladin.name); //паладин атакует
            bard.hp -= damagePaladin;
            System.out.println(bard.name + " был ранен!");

            int damageBard = bard.windOfMusic(bard.name); //бард атакует
            paladin.hp -= damageBard;
            System.out.println(paladin.name + " был ранен!");


            if (bard.hp > 0 && paladin.hp > 0) {
                damageBard = bard.windOfMusic(bard.name); //бард атакует
                paladin.shieldStorm(paladin.name); //паладин пытается увернуться
                int i = 15;
                damageBard /= i;
                if (damageBard > 0) { // если ударом задело
                    paladin.hp -= damageBard;
                    System.out.println("Однако, " + paladin.name + "a зацепило");
                }
            }


            if (bard.hp > 0 && paladin.hp > 0) {
                damagePaladin = paladin.sward(paladin.name); //паладин атакует
                bard.hp -= damagePaladin;
                System.out.println(bard.name + " был ранен!");

                bard.windOfMusic(bard.name); // бард атакует
                System.out.println(bard.name + " промахивается");

            }

            //может появиться дракон:
            theDragon = random.nextBoolean();

            if (bard.hp > 0 && paladin.hp > 0) {
                damagePaladin = paladin.sward(paladin.name); //паладин атакует
                bard.shieldStorm(bard.name); // бард пытается защититься
                int d = 30;
                damagePaladin /= d;
                if (damagePaladin > 0) { // если ударом задело
                    bard.hp -= damagePaladin;
                    System.out.println("Однако, " + bard.name + "a зацепило");
                }
            }


            if (bard.hp > 0 && paladin.hp > 0) {
                damageBard = bard.windOfMusic(bard.name); //бард атакует
                paladin.shield(paladin.name);
                System.out.println("Блок не удался");
                paladin.hp -= damageBard;
                System.out.println(paladin.name + " был ранен!");

                paladin.sward(paladin.name); //паладин атакует
                System.out.println(paladin.name + " промахивается");
            }
        }

        if (paladin.hp <= 0) {
            paladin.dead(paladin.name);
            System.out.println(bard.name + " одержал победу");
        }
        if (bard.hp <= 0) {
            bard.dead(bard.name);
            System.out.println(paladin.name + " одержал победу");
        }

        if (theDragon && bard.hp > 0 && paladin.hp > 0) {
            System.out.println(".... Кажется, битва заинтересовала дракона");
            paladin.run();
            bard.run();
            System.out.println("Зрители ликуют!");
            System.out.println(" Дракон недовольно фыркнул, выпустив облака дыма, и улетел прочь. ^^");
        }

    }

}
