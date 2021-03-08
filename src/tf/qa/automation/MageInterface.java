package tf.qa.automation;

import java.util.Random;

public interface MageInterface {
    @SuppressWarnings("checkstyle:ConstantName")
    String specialization = "cast";

    default int windOfMusic(String name) {
        System.out.println(name + " кастует Wind of Music");
        int min = 15;
        int krit = 100;
        int diff = krit - min;
        Random random = new Random();
        int damage = random.nextInt(diff + 1);
        damage += min;
        return damage;
    }

    default void shieldStorm(String name) {
        System.out.println(name + " блокирует атаку");
    }

}
