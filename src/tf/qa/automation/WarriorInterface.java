package tf.qa.automation;

import java.util.Random;

public interface WarriorInterface {
    String specialization = "close combat";

    default int sward(String name) {
        System.out.println(name + " делает прыжок и с разворота наносит сильный удар мечом");
        int min = 30;
        int krit = 60;
        int diff = krit - min;
        Random random = new Random();
        int damage = random.nextInt(diff + 1);
        damage += min;
        return damage;
    }

    default void shield(String name) {
        System.out.println(name + " пытается отразить атаку");
    }

}
