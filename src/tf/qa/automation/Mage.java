package tf.qa.automation;


public abstract class Mage {

    public Mage(final String name, final int hp) {

    }

    public static void dead(final String name) {

        System.out.println(name + " погибает");
    }

    public abstract void run();
}
